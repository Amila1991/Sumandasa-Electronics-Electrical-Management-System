/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package control;

import connection.DBConn;
import connection.DBHandle;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import model.*;

/**
 *
 * @author Amila Karunathilaka
 */
public class ServiceOrderControl {
    public static int addServiceOrder(Customer customer,ServiceOrder serviceOrder,ServiceItem item) throws ClassNotFoundException, SQLException{
        String[] queries={DBQueries.addCustomerQuery(customer),DBQueries.addServiceOrderQuery(serviceOrder),DBQueries.addServiceItemQuery(item)};
        Connection conn=DBConn.getConnectionToDB();
        conn.setAutoCommit(false);
        int[] res=new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            res[i]=DBHandle.setData(conn, queries[i]);
            System.out.print(res[i]);
        }
        conn.commit();
        if (res[0]==1&&res[0]==1&&res[0]==1) {
            return 1;
        }else{
            return 0;
        }
    }
    public static int addCondition(ArrayList<Condition> conditionlist) throws ClassNotFoundException, SQLException{
        Connection conn=DBConn.getConnectionToDB();
        String query;
        for (Condition condition : conditionlist) {
            query=DBQueries.addConditionQuery(condition);
            int res=DBHandle.setData(conn, query);
        }

        return 1;
    }
    public static int addInvoice(Invoice invoice) throws ClassNotFoundException, SQLException{
        Connection conn=DBConn.getConnectionToDB();
        String query=DBQueries.addInvoiceQuery(invoice);
        int res=DBHandle.setData(conn, query);
        return res;
    }
    public static Map<String,Object> viewServiceOrder(ServiceOrder serviceOrder) throws ClassNotFoundException, SQLException{
        Connection conn=DBConn.getConnectionToDB();
        Map<String,Object> modelList=new HashMap<String, Object>();
        ArrayList<Condition> conditionList=new ArrayList<Condition>();
        Customer customer=new Customer();
        ServiceItem item=new ServiceItem();
        ResultSet rst;
        String query=DBQueries.checkServiceOrderQuery(serviceOrder);
        rst=DBHandle.getData(conn, query);
        if(rst.next()){
            serviceOrder.setService_Order_ID(rst.getString("Service_Order_ID"));
            serviceOrder.setDuration(rst.getString("Duration"));
            serviceOrder.setOrder_Date(rst.getString("Order_Date"));
            serviceOrder.setIssue_Date(rst.getString("Issue_Date"));
            serviceOrder.setTotal_Cost_Amount(rst.getDouble("Total_Cost_Amount"));
            serviceOrder.setCustID(rst.getString("Cust_ID"));
            
            customer=new Customer(rst.getString("Cust_ID"),rst.getString("Cust_Name"),rst.getString("Cust_Address"),rst.getString("Contact_No"));
            item=new ServiceItem(rst.getString("Item_Code"),rst.getString("Description"),rst.getString("Model_No"),rst.getString("Serial_No"),rst.getString("Item_Brand_Name"),rst.getDouble("Current_Value"),rst.getString("Work_Finish_Date"),false,rst.getString("Service_Order_ID"));    
        }
        query=DBQueries.searchAllTablesAnyColumnsQuery("Conditions", item.getItem_Code(), "Item_Code", "*");
        rst=DBHandle.getData(conn, query);
        while (rst.next()) {
            Condition condition=new Condition(rst.getInt("Condition_No"),rst.getString("Condition_Description"),rst.getString("Item_Code"));
            conditionList.add(condition);
        }
        modelList.put("ServiceOrder", serviceOrder);
        modelList.put("Customer", customer);
        modelList.put("Item", item);
        modelList.put("ConditionList", conditionList);
        
        return modelList;
    }
    public static Map<String,Object> allJobsFinishServiceOrders() throws SQLException, ClassNotFoundException{
        Connection conn=DBConn.getConnectionToDB();
        Map<String,Object> modelList=new HashMap<String, Object>();
        ArrayList<ServiceOrder> serviceOrderList=new ArrayList<ServiceOrder>();
        ArrayList<ServiceItem> itemList=new ArrayList<ServiceItem>();
        String query=DBQueries.getAllJobFinishServiceOrdersListQuery();
        ResultSet rst=DBHandle.getData(conn, query);
        ServiceOrder serviceOrder=new ServiceOrder();
        ServiceItem item=new ServiceItem();
        while (rst.next()) { 
            query="select so.Service_Order_ID,si.Item_Brand_Name,si.Description ,so.Order_Date from ServiceOrder so NATURAL JOIN ServiceItem si NATURAL RIGHT JOIN JobDetail jd where so.Service_Order_ID='"+rst.getString("Service_Order_ID")+"' & jd.Finish_Date is null Group by so.Service_Order_ID";
            ResultSet rst1=DBHandle.getData(conn, query);
            if(rst1.next()){
                serviceOrder.setService_Order_ID(rst.getString("Service_Order_ID"));
                serviceOrder.setOrder_Date(rst.getString("Order_Date"));
                item.setItem_Brand_Name(rst.getString("Item_Brand_Name"));
                item.setDescription(rst.getString("Description"));
                serviceOrderList.add(serviceOrder);
                itemList.add(item);
            }else{
                serviceOrder.setService_Order_ID(rst.getString("Service_Order_ID"));
                serviceOrder.setOrder_Date(rst.getString("Order_Date"));
                item.setItem_Brand_Name(rst.getString("Item_Brand_Name"));
                item.setDescription(rst.getString("Description"));
                serviceOrderList.add(serviceOrder);
                itemList.add(item);
            }
        }
        modelList.put("ServiceOrderList", serviceOrderList);
        modelList.put("ItemList", itemList);
        return modelList;
    }

    public static ArrayList<ServiceItemRemark> viewItemRemarks(ServiceOrder serviceOrder) throws ClassNotFoundException, SQLException {
        Connection conn=DBConn.getConnectionToDB();
        ArrayList<ServiceItemRemark> itemRemarksList=new ArrayList<ServiceItemRemark>();
        ServiceItemRemark itemRemarks;
        String query="select sir.Item_Remark_No,sir.Item_Remark_Description,sir.Item_Code from ServiceItemRemarks sir NATURAL JOIN ServiceItem si NATURAL JOIN ServiceOrder so where so.Service_Order_ID='"+serviceOrder.getService_Order_ID()+"'";
        ResultSet rst=DBHandle.getData(conn, query);
        while (rst.next()) {            
            itemRemarks=new ServiceItemRemark(rst.getInt("Item_Remark_No"), rst.getString("Item_Remark_Description"), rst.getString("Item_Code"));
            itemRemarksList.add(itemRemarks);
        }
        return itemRemarksList;
    }
    
    public static int confirmcompletedServiceOrder(ServiceOrder serviceOrder,ServiceItem item) throws ClassNotFoundException, SQLException{
        Connection conn=DBConn.getConnectionToDB();
        String query=DBQueries.addCompleteDateServiceItemQuery(item);
        int res1=DBHandle.setData(conn, query);
        query=DBQueries.addConfirmServiceOrderQuery(serviceOrder);
        int res2=DBHandle.setData(conn, query);
        return 1;
    }
    
    public static Map<String,Object> viewInvoice(ServiceOrder serviceOrder) throws ClassNotFoundException, SQLException{
        Map<String,Object> modelList=new HashMap<String, Object>();
        ArrayList<Invoice> invoiceList=new ArrayList<Invoice>();
        ServiceItem item=new ServiceItem();
        Connection conn=DBConn.getConnectionToDB();
        String query="select * from ServiceItem si NATURAL JOIN ServiceOrder so NATURAL JOIN ServiceInvoice where so.Service_Order_ID='"+serviceOrder.getService_Order_ID()+"'";
        ResultSet rst=DBHandle.getData(conn, query);
        while (rst.next()) {            
            Invoice invoice=new Invoice();
            invoice.setInvoice_No(rst.getString("Invoice_No"));
            invoice.setDate(rst.getString("Date"));
            invoice.setAmount(rst.getDouble("Amount"));
            invoice.setService_Order_ID(rst.getString("Service_Order_ID"));
            invoiceList.add(invoice);
            serviceOrder.setService_Order_ID(rst.getString("Service_Order_ID"));
            serviceOrder.setTotal_Cost_Amount(rst.getDouble("Total_Cost_Amount"));
            item.setDescription(rst.getString("Description"));
        }
        if (!rst.isFirst()) {
            query="select * from ServiceItem si NATURAL JOIN ServiceOrder so where so.Service_Order_ID='"+serviceOrder.getService_Order_ID()+"'";
            rst=DBHandle.getData(conn, query);
            if (rst.next()) {            
                serviceOrder.setService_Order_ID(rst.getString("Service_Order_ID"));
                serviceOrder.setTotal_Cost_Amount(rst.getDouble("Total_Cost_Amount"));
                item.setDescription(rst.getString("Description"));
            }
        }
        modelList.put("ServiceOrder", serviceOrder);
        modelList.put("Item", item);
        modelList.put("InvoiceList", invoiceList);
        return modelList;
    }
}

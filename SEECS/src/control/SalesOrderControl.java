/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import cashier.Payment;
import connection.DBConn;
import connection.DBHandle;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.*;
import printreport.Student;

/**
 *
 * @author Amila
 */
public class SalesOrderControl {

    public static int addSalesOrder(Transaction transaction,Customer customer, SalesOrder salesOrder, ArrayList<SoldItem> soldItemList,ArrayList<SalesItem> salesItemList) throws ClassNotFoundException, SQLException {
        String[] queries = {DBQueries.addTransactionQuery(transaction),DBQueries.addCustomerQuery(customer), DBQueries.addSalesOrderQuery(salesOrder)};
        Connection conn = DBConn.getConnectionToDB();
        int[] res = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            res[i] = DBHandle.setData(conn, queries[i]);
            System.out.print(res[i]);
        }
        int res1 = 0;
        for (SoldItem soldItem : soldItemList) {
            String query = DBQueries.addSoldItemQuery(soldItem);
            res1 = DBHandle.setData(conn, query);
            System.out.print(res1);
        }
        for (SalesItem salesItem : salesItemList) {
            String query = DBQueries.updateSalesItemQTYQuery(salesItem);
            res1 = DBHandle.setData(conn, query);
            System.out.print(res1);
        }
        conn.commit();
        if (res[0] == 1 && res[1] == 1) {
            return 1;
        } else {
            return 0;
        }
    }
    public static int addPayment(SalesOrderPayment payment) throws ClassNotFoundException, SQLException{
        String query=DBQueries.addSalesPaymentQuery(payment);
        Connection conn = DBConn.getConnectionToDB();
        int res=DBHandle.setData(conn, query);
        conn.commit();
        return res;
    }
    
    public static ArrayList<Student> aaa(){
        ArrayList<Student> c=new ArrayList<Student>();
        try {
            
             String query="select Model_No,Item_Description from SalesItem";
                Connection conn = DBConn.getConnectionToDB();
                ResultSet rst=DBHandle.getData(conn, query);
                while (rst.next()) {                
                    Student student=new Student(rst.getString("Item_Description" ), rst.getString("Model_No"));
                    c.add(student);
                }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SalesOrderControl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SalesOrderControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return c;
    }
    
    public static ArrayList<String> getSalesOrderIDList() throws ClassNotFoundException, SQLException{
        ArrayList<String> salesOrderIDlist=new ArrayList<>();
        String query=DBQueries.getAllTablesAnyColumnsQuery("SalesOrders", "Order_ID");
        Connection conn = DBConn.getConnectionToDB();
        ResultSet rst=DBHandle.getData(conn, query);
        conn.commit();
        while (rst.next()) {                
                    salesOrderIDlist.add(rst.getString("Order_ID"));
                }
        return salesOrderIDlist;
    }
    
    public static SalesOrder getSalesOrder(String orderID) throws ClassNotFoundException, SQLException{
        SalesOrder toReturn=new SalesOrder();
        String query=DBQueries.searchAllTablesAnyColumnsQuery("SalesOrder", orderID, "Order_ID", "*");
        Connection conn =DBConn.getConnectionToDB();
        ResultSet rst=DBHandle.getData(conn, query);
        conn.commit();
        if (rst.next()) {            
            toReturn.setOrder_ID(rst.getString("Order_ID"));
            toReturn.setOrder_Date(rst.getString("Order_Date"));
            toReturn.setDiscount(rst.getDouble("Discount"));
            toReturn.setTotal_Amount(rst.getDouble("Total_Amount"));
            toReturn.setCust_ID(rst.getString("Cust_ID"));
            toReturn.setTransaction_ID(rst.getString("Transaction_ID"));
        }
        return toReturn;
    }
    public static Map<String,Object> getSalesOrderDetail(SalesOrder salesOrder) throws ClassNotFoundException, SQLException{
        Map toReturn=new HashMap<String,Object>();
        Connection conn =DBConn.getConnectionToDB();
        String query=DBQueries.searchAllTablesAnyColumnsQuery("Customer", salesOrder.getCust_ID(), "Cust_ID", "*");
        ResultSet rst=DBHandle.getData(conn, query);
        Customer customer=new Customer();
        conn.commit();
        if (rst.next()) {            
            customer.setCustID(rst.getString("Cust_ID"));
            customer.setCustName(rst.getString("Cust_Name"));
            customer.setCustAddress(rst.getString("Cust_Address"));
            customer.setContactNo(rst.getString("Contact_No"));
        }
        toReturn.put("Customer", customer);
        query=DBQueries.searchAllTablesAnyColumnsQuery("SoldItem", salesOrder.getOrder_ID(), "Order_ID", "*");
        rst=DBHandle.getData(conn, query);
        ArrayList<SoldItem> soldItemList=new ArrayList<>();
        SoldItem soldItem;
        conn.commit();
        while (rst.next()) {
            soldItem=new SoldItem();
            soldItem.setSerial_No(rst.getString("Serial_No"));
            soldItem.setModel_No(rst.getString("Model_No"));
            soldItem.setItem_Brand_Name(rst.getString("Item_Brand_Name"));
            soldItem.setItem_Description(rst.getString("Item_Description"));
            soldItem.setItem_Qty(rst.getInt("Item_Qty"));
            soldItem.setIssue_price(rst.getDouble("Issue_price"));
            soldItem.setReceive_price(rst.getDouble("Receive_price"));
            soldItem.setAmount(soldItem.getIssue_price()*soldItem.getItem_Qty());
            soldItem.setWarranty_Period(rst.getString("Warranty_Period"));
            soldItem.setOrder_ID(rst.getString("Order_ID"));
            soldItemList.add(soldItem);
        }
        toReturn.put("SoldItemList", soldItemList);
        return toReturn;
    }
    
    public static SalesOrderPayment getSalesOrderPayment(String orderID) throws ClassNotFoundException, SQLException{
        SalesOrderPayment toReturn=new SalesOrderPayment();
        Connection conn = DBConn.getConnectionToDB();
        String query=DBQueries.searchAllTablesAnyColumnsQuery("SalesOrderPayment", orderID, "Order_ID", "*");
        ResultSet rst=DBHandle.getData(conn, query);
        conn.commit();
        if(rst.next()){
            toReturn.setOrderPayment_ID(rst.getString("OrderPayment_ID"));
            toReturn.setOrder_ID(orderID);
        }
        return toReturn;
    }
    
    public static int cancelSalesOrder(Transaction transaction,SalesOrderCancel salesOrderCancel,ArrayList<ReturnItem> returnItemList,ArrayList<SalesItem> salesItemList) throws ClassNotFoundException, SQLException{
        String[] queries = {DBQueries.addTransactionQuery(transaction), DBQueries.addSalesOrderCancelQuery(salesOrderCancel)};
        Connection conn = DBConn.getConnectionToDB();
        SalesOrderPayment salesOrderPayment=SalesOrderControl.getSalesOrderPayment(salesOrderCancel.getOrder_ID());
        int[] res = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            res[i] = DBHandle.setData(conn, queries[i]);
            System.out.print(res[i]);
        }
        String query;
        int res1 = 0;
        for (int i=0;i<returnItemList.size();i++) {
            ReturnItem returnItem=returnItemList.get(i);
            SoldItem soldItem=new SoldItem();
            soldItem.setSerial_No(returnItem.getSerial_No());
            SalesItem salesItem=salesItemList.get(i);
            query = DBQueries.addReturnItemQuery(returnItem);
            res1 = DBHandle.setData(conn, query);
            query=DBQueries.deleteSoldItemQuery(soldItem);
            res1 = DBHandle.setData(conn, query);
            query=DBQueries.updateSalesItemQTYQuery(salesItem);
            res1 = DBHandle.setData(conn, query);
            System.out.print(res1);
        }
        SalesOrder salesOrder=new SalesOrder();
        salesOrder.setOrder_ID(salesOrderCancel.getOrder_ID());
        salesOrder.setTotal_Amount(0.00);
        salesOrder.setDiscount(0.00);
        query=DBQueries.cancelSalesOrderQuery(salesOrder);
        res1 = DBHandle.setData(conn, query);
        
        
      /*  for (SalesItem salesItem : salesItemList) {
            String query = DBQueries.updateSalesItemQTYQuery(salesItem);
            res1 = DBHandle.setData(conn, query);
            System.out.print(res1);
        }*/
        conn.commit();
        if (res[0] == 1 && res[1] == 1) {
            return 1;
        } else {
            return 0;
        }
    }
}

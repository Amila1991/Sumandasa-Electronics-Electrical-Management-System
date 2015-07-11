/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package control;

import model.*;

/**
 *
 * @author Amila Karunathilaka
 */
public class DBQueries {
        /////////add Queries
    //add Customer
    public static String addCustomerQuery(Customer customer){
        String query="INSERT INTO Customer VALUES('"+customer.getCustID()+"','"+customer.getCustName()+"','"+customer.getCustAddress()+"','"+customer.getContactNo()+"')";
        return query;
    }
    //add Transaction
    public static String addTransactionQuery(Transaction transaction){
        String query="INSERT INTO Transaction VALUES('"+transaction.getTransaction_ID()+"','"+transaction.getTransaction_Date()+"',"+transaction.getTransaction_Type()+")";
        return query;
    }
    //add Service Order
    public static String addServiceOrderQuery(ServiceOrder serviceOrder){
        String query="INSERT INTO ServiceOrder(Service_Order_ID,Order_Date,Cust_ID) VALUES('"+serviceOrder.getService_Order_ID()+"','"+serviceOrder.getOrder_Date()+"','"+serviceOrder.getCustID()+"')";
        return query;
    }
    //add Sales Order
    public static String addSalesOrderQuery(SalesOrder salesOrder){
        String query="INSERT INTO SalesOrders VALUES('"+salesOrder.getOrder_ID()+"','"+salesOrder.getOrder_Date()+"',"+salesOrder.getTotal_Amount()+",0.00,'"+salesOrder.getCust_ID()+"')";
        return query;
    }
    //add GRN
    public static String addGRNQuery(GoodReceiveNote goodReceiveNote){
        String query="INSERT INTO GRN VALUES('"+goodReceiveNote.getGRN_ID()+"','"+goodReceiveNote.getGRN_Date()+"',"+goodReceiveNote.getTotal_Amount()+","+goodReceiveNote.getDiscount()+",'"+goodReceiveNote.getVendor_ID()+"')";
        System.out.println(query);
        return query;
    }
    //add GRN Detaol
    public static String addGRNDetailQuery(GRNDetail gRNDetail){
        String query="INSERT INTO GRNDetail VALUES('"+gRNDetail.getGRN_ID()+"','"+gRNDetail.getModel_No()+"',"+gRNDetail.getReceive_price()+","+gRNDetail.getGRN_Qty()+"')";
        System.out.println(query);
        return query;
    }
    //add ServiceItem
    public static String addServiceItemQuery(ServiceItem item){
        String query="INSERT INTO ServiceItem(Item_Code,Description,Model_No,Serial_No,Item_Brand_Name,Service_Order_ID) VALUES('"+item.getItem_Code()+"','"+item.getDescription()+"','"+item.getModel_No()+"','"+item.getSerial_No()+"','"+item.getItem_Brand_Name()+"','"+item.getService_Order_ID()+"')";
        return query;
    }
    //add Sales Item
    public static String addSalesItemQuery(SalesItem item){
        String query="INSERT INTO SalesItem VALUES('"+item.getModel_No()+"','"+item.getItem_Description()+"','"+item.getItem_Brand_Name()+"',"+item.getReceive_price()+","+item.getCash_Issue_price()+","+","+item.getCredit_Issue_price()+","+item.getItem_Qty()+",'"+item.getWarranty_Period()+"','"+item.getItemType_Code()+"')";
        return query;
    }
    //add Sold Item
    public static String addSoldItemQuery(SoldItem item){
        String query="INSERT INTO SoldItem VALUES('"+item.getSerial_No()+"','"+item.getModel_No()+"','"+item.getItem_Description()+"','"+item.getItem_Brand_Name()+"',"+item.getReceive_price()+","+item.getIssue_price()+","+item.getItem_Qty()+",'"+item.getWarranty_Period()+"','"+item.getOrder_ID()+"')";
        return query;
    }
    //add Sales Item Type
    public static String addSalesItemTypeQuery(SalesItemType salesItemType){
        String query="INSERT INTO SalesItemType VALUES('"+salesItemType.getItemType_Code()+"','"+salesItemType.getItemType_Name()+"','"+salesItemType.getDescription()+"')";
        return query;
    }
    //add Sales Payment
    public static String addSalesPaymentQuery(SalesOrderPayment salesOrderPayment){
        String query="INSERT INTO SalesOrderPayment VALUES('"+salesOrderPayment.getOrderPayment_ID()+"',"+salesOrderPayment.getOrderPayment_Amount()+",'"+salesOrderPayment.getOrderPayment_Date()+"','"+salesOrderPayment.getOrderPayment_Discount()+"','"+salesOrderPayment.getOrder_ID()+"')";
        return query;
    }
    //add Item Condition
    public static String addConditionQuery(Condition condition){
        String query="INSERT INTO Conditions VALUES("+condition.getCondition_No()+",'"+condition.getCondition_Description()+"','"+condition.getItem_Code()+"')";
        return query;
    }
    //add Employee Detail for Job
    public static String addEmployeeDetailQuery(EmployeeDetail employeeDetail){
        String query="INSERT INTO EmployeeDetail VALUES('"+employeeDetail.getEmployee_ID()+"','"+employeeDetail.getJob_Code()+"')";
        return query;
    }
    //add new Employee
    public static String addEmployeeQuery(Employee employee){
        String query="INSERT INTO Employee(Employee_ID,Employee_Name,Employee_Address,Employee_Contact,Employee_NIC,Employee_Type_ID ) VALUES('"+employee.getEmployee_ID()+"','"+employee.getEmployee_Name()+"','"+employee.getEmployee_Address()+"','"+employee.getEmployee_Contact()+"','"+employee.getEmployee_NIC()+"','"+employee.getEmployee_Type_ID()+"')";
        return query;
    }
    //add new Vendor
    public static String addVendorQuery(Vendor vendor){
        String query="INSERT INTO Vendor VALUES('"+vendor.getVendor_ID()+"','"+vendor.getVendor_Name()+"','"+vendor.getVendor_Address()+"','"+vendor.getContact_No1()+"','"+vendor.getContact_No2()+"','"+vendor.getContact_No3()+"','"+vendor.getFAX_No()+"','"+vendor.getEmail()+"')";
        return query;
    }
    //add new Job Card
    public static String addJobDetailQuery(JobDetail jobDetail){
        String query="INSERT INTO JobDetail(Job_Code,Job_Deficiency,Start_Date,Item_Code) VALUES('"+jobDetail.getJob_Code()+"','"+jobDetail.getJob_Deficiency()+"','"+jobDetail.getStart_Date()+"','"+jobDetail.getItem_Code()+"')";
        return query;
    }
    //add Job Deficiency
    public static String addJobDecriptionQuery(JobDescription jobDecription){
        String query="INSERT INTO JobDescription VALUES("+jobDecription.getDescription_No()+",'"+jobDecription.getJob_Description()+"','"+jobDecription.getJob_Code()+"')";
        return query;
    }
    //add Item Remark
    public static String addItemRemarkQuery(ServiceItemRemark itemRemark){
        String query="INSERT INTO ServiceItemRemarks VALUES("+itemRemark.getItem_Remarks_No()+",'"+itemRemark.getItem_Remarks_Description()+"','"+itemRemark.getItem_Code()+"')";
        return query;
    }
    //add Job States
    public static String addJobStatesQuery(JobCurrentState jobCurrentState){
        String query="INSERT INTO JobCurrentState VALUES("+jobCurrentState.getCurrent_State_Code()+",'"+jobCurrentState.getCurrent_State_Description()+"','"+jobCurrentState.getState_Add_Date()+"','"+jobCurrentState.getJob_Code()+"')";
        return query;
    }
    //add Accessory
    public static String addAccessoryQuery(Accessory accessory){
        String query="INSERT INTO Accessory VALUES("+accessory.getAccessory_ID()+",'"+accessory.getAccessory_Description()+"',"+accessory.getUnit_Purchase_Price()+","+accessory.getUnit_Issue_Price()+","+accessory.getQtyOnHand()+",'"+accessory.getAccessories_Category_ID()+"')";
        return query;
    }
    //add Invoice
    public static String addInvoiceQuery(Invoice invoice){
        String query="INSERT INTO ServiceInvoice VALUES("+invoice.getInvoice_No()+",'"+invoice.getDate()+"',"+invoice.getAmount()+","+invoice.getService_Order_ID()+"')";
        return query;
    }
    //add Sales Order Cancel
    public static String addSalesOrderCancelQuery(SalesOrderCancel salesOrderCancel){
        String query="INSERT INTO SalesOrderCancel VALUES("+salesOrderCancel.getOrder_ID()+",'"+salesOrderCancel.getOrder_Cancel_Date()+"',"+salesOrderCancel.getTotal_Amount()+","+salesOrderCancel.getDiscount()+",'"+salesOrderCancel.getTransaction_ID()+"','"+salesOrderCancel.getEmployee_ID()+"')";
        return query;
    }
    //add Return Item
    public static String addReturnItemQuery(ReturnItem item){
        String query="INSERT INTO ReturnItem VALUES('"+item.getSerial_No()+"','"+item.getModel_No()+"','"+item.getItem_Description()+"','"+item.getItem_Brand_Name()+"',"+item.getReceive_price()+","+item.getIssue_price()+","+item.getItem_Qty()+",'"+item.getWarranty_Period()+"','"+item.getOrder_ID()+"')";
        return query;
    }
    
        /////////Update Queries
    //Update Job Detail
    public static String addJobCompleteQuery(JobDetail jobDetail){
        String query="UPDATE JobDetail SET Finish_Date='"+jobDetail.getFinish_Date()+"',Work_Man_Hours='"+jobDetail.getWork_Man_Hours()+"',Job_Expenses_Charges='"+jobDetail.getJob_Expenses_Charges()+"' where Job_Code='"+jobDetail.getJob_Code()+"'";
        return query;
    }
    public static String addJobCostQuery(JobDetail jobDetail){
        String query="UPDATE JobDetail SET Labour_Cost='"+jobDetail.getLabour_Cost()+"',Transport_Charges='"+jobDetail.getTransport_Charges()+"',Other_Expenses_Charges='"+jobDetail.getOther_Expenses_Charges()+"' where Job_Code='"+jobDetail.getJob_Code()+"'";
        return query;
    }
    //Update Epmloyee
    public static String updateEmployeeQuery(Employee employee) {
        String query="UPDATE Employee SET Employee_Name='"+employee.getEmployee_Name()+"',Employee_Address='"+employee.getEmployee_Address()+"',Employee_Contact='"+employee.getEmployee_Contact()+"',Employee_Address='"+employee.getEmployee_Address()+"',Employee_NIC='"+employee.getEmployee_NIC()+"',Employee_Type_ID='"+employee.getEmployee_Type_ID()+"' where Employee_ID='"+employee.getEmployee_ID()+"'";
        return query;
    }
    //Update Service Order
    public static String addConfirmServiceOrderQuery(ServiceOrder serviceOrder) {
        String query="UPDATE ServiceOrder SET Total_Cost_Amount='"+serviceOrder.getTotal_Cost_Amount()+"' where Service_Order_ID='"+serviceOrder.getService_Order_ID()+"'";
        return query;
    }
    //Update Employee
    public static String addCompleteDateServiceItemQuery(ServiceItem item) {
        String query="UPDATE ServiceItem SET Work_Finish_Date='"+item.getWork_Finish_Date()+"' where Item_Code='"+item.getItem_Code()+"'";
        return query;
    }
    
    //Update Sales Item
    public static String updateSalesItemQuery(SalesItem salesItem) {
        String query="UPDATE SalesItem SET Receive_price='"+salesItem.getReceive_price()+"',Cash_Issue_price ='"+salesItem.getCash_Issue_price()+"',Credit_Issue_price ='"+salesItem.getCredit_Issue_price()+"',Item_Qty='"+salesItem.getItem_Qty()+"',Warranty_Period='"+salesItem.getWarranty_Period()+"' where Model_No='"+salesItem.getModel_No()+"'";
        return query;
    }
    //Update Sales Item Qty
    public static String updateSalesItemQTYQuery(SalesItem salesItem) {
        String query="UPDATE SalesItem SET Item_Qty='"+salesItem.getItem_Qty()+"' where Model_No='"+salesItem.getModel_No()+"'";
        return query;
    }
    //Update Sales Item Qty
    public static String updateSalesItemStockQuery(SalesItem salesItem) {
        String query="UPDATE SalesItem SET Receive_price='"+salesItem.getReceive_price()+"',Cash_Issue_price ='"+salesItem.getCash_Issue_price()+"',Credit_Issue_price ='"+salesItem.getCredit_Issue_price()+"',IItem_Qty='"+salesItem.getItem_Qty()+"' where Model_No='"+salesItem.getModel_No()+"'";
        return query;
    }
    //Update Sales Order Amount
    public static String cancelSalesOrderQuery(SalesOrder salesOrder) {
        String query="UPDATE SalesOrder SET Total_Amount="+salesOrder.getTotal_Amount()+", Discount ="+salesOrder.getDiscount()+" where Order_ID='"+salesOrder.getOrder_ID()+"'";
        return query;
    }
    
          /////////Delete Queries
    //Delete Sold Item
    public static String deleteSoldItemQuery(SoldItem item){
        String query="Delete from SoldItem where Serial_No='"+item.getSerial_No()+"'";
        return query;
    }
    
        /////////view Queries
    //get Service Order & ServiceItem 
    public static String checkServiceOrderQuery(ServiceOrder serviceOrder){
        String query="select * from Customer c NATURAL JOIN ServiceOrder so NATURAL JOIN ServiceItem si where so.Service_Order_ID='"+serviceOrder.getService_Order_ID()+"'";
        return query;
    }
    //search Data in all Table
    public static String searchAllTablesAnyColumnsQuery(String table,String searchvalue,String searchColumn,String... column){
        String columns=null;
        for (String columnvalue : column) {
            if (columns==null) {
                columns=columnvalue;
            }else{
                columns+=","+columnvalue;
            }
        }
        String query="select "+columns+" from "+table+" where "+searchColumn+"='"+searchvalue+"'";
        return query;
    }  
    //get Data in all Table
    public static String getAllTablesAnyColumnsQuery(String table,String... column){
        String columns=null;
        for (String columnvalue : column) {
            if (columns==null) {
                columns=columnvalue;
            }else{
                columns+=","+columnvalue;
            }
        }
        String query="select "+columns+" from "+table;
        return query;
    }
    //view New Service Order List
    public static String getNewJobListQuery(){
        String query="select * from ServiceOrder so NATURAL JOIN ServiceItem si NATURAL JOIN Conditions c NATURAL LEFT JOIN JobDetail jd where jd.Item_Code is null && c.Item_Code is not null Group by so.Service_Order_ID";
        return query;
    }
    //view Jobs Detail List
    public static String getJobsDetailListQuery(ServiceOrder serviceOrder){
        String query="select * from ServiceOrder so NATURAL JOIN ServiceItem si NATURAL JOIN JobDetail jd where so.Service_Order_ID='"+serviceOrder.getService_Order_ID()+"'";
        return query;
    }
    //view All Job Finish Service Orders List
    public static String getAllJobFinishServiceOrdersListQuery(){
        String query="select so.Service_Order_ID,si.Item_Brand_Name,si.Description ,so.Order_Date from ServiceOrder so NATURAL JOIN ServiceItem si NATURAL RIGHT JOIN JobDetail jd where jd.Finish_Date is not null Group by so.Service_Order_ID";
        return query;
    }

    

}

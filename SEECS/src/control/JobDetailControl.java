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
public class JobDetailControl {
    public static int addJobDetail(JobDetail jobDetail) throws ClassNotFoundException, SQLException{
        Connection conn=DBConn.getConnectionToDB();
        String query=DBQueries.addJobDetailQuery(jobDetail);
        int res=DBHandle.setData(conn, query);
        return 1;
    }
    public static int addJobDecription(ArrayList<JobDescription> jobDescriptionlist) throws ClassNotFoundException, SQLException{
        Connection conn=DBConn.getConnectionToDB();
        String query;
        for (JobDescription jobDescription : jobDescriptionlist) {
            query=DBQueries.addJobDecriptionQuery(jobDescription);
            int res=DBHandle.setData(conn, query);
        }

        return 1;
    }
    public static int addJobStates(ArrayList<JobCurrentState> jobCurrentStateList) throws ClassNotFoundException, SQLException{
        Connection conn=DBConn.getConnectionToDB();
        String query;
        for (JobCurrentState jobCurrentState : jobCurrentStateList) {
            query=DBQueries.addJobStatesQuery(jobCurrentState);
            int res=DBHandle.setData(conn, query);
        }

        return 1;
    }
    public static int addJobCompleteConfirm(JobDetail jobDetail, ArrayList<ServiceItemRemark> itemRemarkList) throws ClassNotFoundException, SQLException {
        System.out.println(jobDetail.getJob_Expenses_Charges());
        System.out.println(jobDetail.getWork_Man_Hours());
        Connection conn=DBConn.getConnectionToDB();
        String query=DBQueries.addJobCompleteQuery(jobDetail);
        int res=DBHandle.setData(conn, query);
        for (ServiceItemRemark itemRemark : itemRemarkList) {
            query=DBQueries.addItemRemarkQuery(itemRemark);
            res=DBHandle.setData(conn, query);
        }

        return 1;
        
    }
    public static Map<String,Object> checkNewJobs() throws ClassNotFoundException, SQLException{
        Map<String,Object> newJobDetail=new HashMap<String, Object>();
        ArrayList<ServiceItem> itemList=new ArrayList<ServiceItem>();
        ArrayList<ServiceOrder> serviceOrderList=new ArrayList<ServiceOrder>();
        ServiceItem item;
        ServiceOrder serviceOrder;
        String query=DBQueries.getNewJobListQuery();
        ResultSet rst=DBHandle.getData(DBConn.getConnectionToDB(), query);
        while(rst.next()){
            item=new ServiceItem(rst.getString("Item_Code"),rst.getString("Description"),rst.getString("Model_No"),rst.getString("Serial_No"),rst.getString("Item_Brand_Name"),rst.getDouble("Current_Value"),rst.getString("Work_Finish_Date"),false,rst.getString("Service_Order_ID"));
            serviceOrder=new ServiceOrder(rst.getString("Service_Order_ID"), rst.getString("Duration"), rst.getString("Order_Date"), rst.getString("Issue_Date"), rst.getDouble("Total_Cost_Amount"), rst.getString("Cust_ID"));
            itemList.add(item);
            serviceOrderList.add(serviceOrder);
        }
        newJobDetail.put("ItemList", itemList);
        newJobDetail.put("ServiceOrderList", serviceOrderList);
        return newJobDetail;
    }
    
    public static Map<String,Object> viewJobDetail(ServiceOrder serviceOrder) throws ClassNotFoundException, SQLException{
        Connection conn=DBConn.getConnectionToDB();
        Map<String,Object> modelList=new HashMap<String, Object>();
        ArrayList<JobDetail> jobDetailList=new ArrayList<JobDetail>();
        ArrayList<JobDetailString> jobDetailStringList=new ArrayList<JobDetailString>();
        ArrayList<JobDescription> jobDescriptionList=new ArrayList<JobDescription>();
        ServiceItem item=new ServiceItem();
        String query=DBQueries.getJobsDetailListQuery(serviceOrder);
        ResultSet rst=DBHandle.getData(conn, query);
        while(rst.next()){
           JobDetail jobDetail=new JobDetail();
           jobDetail.setJob_Code(rst.getString("Job_Code"));
           jobDetail.setJob_Deficiency(rst.getString("Job_Deficiency"));
           jobDetail.setStart_Date(rst.getString("Start_Date"));
           jobDetail.setFinish_Date(rst.getString("Finish_Date"));
           jobDetail.setJob_Expenses_Charges(rst.getDouble("Job_Expenses_Charges"));
           jobDetail.setOther_Expenses_Charges(rst.getDouble("Other_Expenses_Charges"));
           jobDetail.setLabour_Cost(rst.getDouble("Labour_Cost"));
           jobDetail.setTransport_Charges(rst.getDouble("Transport_Charges"));
           jobDetail.setWork_Man_Hours(rst.getInt("Work_Man_Hours"));
           jobDetail.setItem_Code(rst.getString("Item_Code"));
           
           JobDetailString jobDetailString=new JobDetailString();
           jobDetailString.setJob_Code(rst.getString("Job_Code"));
           jobDetailString.setJob_Deficiency(rst.getString("Job_Deficiency"));
           jobDetailString.setStart_Date(rst.getString("Start_Date"));
           jobDetailString.setFinish_Date(rst.getString("Finish_Date"));
           jobDetailString.setJob_Expenses_Charges(rst.getString("Job_Expenses_Charges"));
           jobDetailString.setOther_Expenses_Charges(rst.getString("Other_Expenses_Charges"));
           jobDetailString.setLabour_Cost(rst.getString("Labour_Cost"));
           jobDetailString.setTransport_Charges(rst.getString("Transport_Charges"));
           jobDetailString.setWork_Man_Hours(rst.getString("Work_Man_Hours"));
           jobDetailString.setItem_Code(rst.getString("Item_Code"));
           
           item.setItem_Code(rst.getString("Item_Code"));
           item.setDescription(rst.getString("Description"));
           item.setItem_Brand_Name(rst.getString("Item_Brand_Name"));
           jobDetailList.add(jobDetail);
           jobDetailStringList.add(jobDetailString);
           query=DBQueries.searchAllTablesAnyColumnsQuery("JobDescription", jobDetail.getJob_Code(), "Job_Code","*");
           ResultSet rst1=DBHandle.getData(conn, query);
           while(rst1.next()){
                JobDescription jobDescription=new JobDescription(rst1.getInt("Decription_No"), rst1.getString("Job_Decription"), rst1.getString("Job_Code"));
                jobDescriptionList.add(jobDescription);
           }
        }
        modelList.put("Item", item);
        modelList.put("JobDetail", jobDetailList);
        modelList.put("JobDetailString", jobDetailStringList);
        modelList.put("JobDescriptionList", jobDescriptionList);
        return modelList;
    }
    public static ArrayList<ServiceItemRemark> viewItemRemarks(ServiceItemRemark itemRemark) throws ClassNotFoundException, SQLException{
        Connection conn=DBConn.getConnectionToDB(); 
        ArrayList<ServiceItemRemark> itemRemarkList=new ArrayList<ServiceItemRemark>();
        String query=DBQueries.addItemRemarkQuery(itemRemark);
        ResultSet rst=DBHandle.getData(conn, query);
        while (rst.next()) {            
            itemRemark=new ServiceItemRemark(rst.getInt("Item_Remark_No"), rst.getString("Item_Remark_Description"), rst.getString("Item_Code"));
        }
        return itemRemarkList;
    }
    public static int addJobCost(JobDetail jobDetail) throws ClassNotFoundException, SQLException{
       Connection conn=DBConn.getConnectionToDB();
       String query=DBQueries.addJobCostQuery(jobDetail);
       int res=DBHandle.setData(conn, query);
       return res;
    }
    public static ArrayList<JobCurrentState> viewJobCurrentState(JobCurrentState jobCurrentState) throws ClassNotFoundException, SQLException{
        Connection conn=DBConn.getConnectionToDB(); 
        ArrayList<JobCurrentState> jobCurrentStateList=new ArrayList<JobCurrentState>();
        String query=DBQueries.searchAllTablesAnyColumnsQuery("JobCurrentState", jobCurrentState.getJob_Code(), "Job_Code", "*");
        ResultSet rst=DBHandle.getData(conn, query);
        while (rst.next()) {            
            jobCurrentState=new JobCurrentState(rst.getInt("Current_State_Code"), rst.getString("Current_State_Description"), rst.getString("State_Add_Date"),rst.getString("Job_Code"));
            jobCurrentStateList.add(jobCurrentState);
        }
        return jobCurrentStateList;
    }
       
}

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
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Employee;
import model.EmployeeDetail;
import model.EmployeeType;
import model.JobDetail;

/**
 *
 * @author Amila
 */
public class EmployeeControl {
    public static int addEmployee(Employee employee) throws ClassNotFoundException, SQLException{
        Connection conn=DBConn.getConnectionToDB();
        String query=DBQueries.addEmployeeQuery(employee);
        int res=DBHandle.setData(conn, query);
        return res;
    }
    public static int updateEmployee(Employee employee) throws ClassNotFoundException, SQLException{
        Connection conn=DBConn.getConnectionToDB();
        String query=DBQueries.updateEmployeeQuery(employee);
        int res=DBHandle.setData(conn, query);
        return res;
    }
    public static int removeEmployee(Employee employee) throws ClassNotFoundException, SQLException{
        Connection conn=DBConn.getConnectionToDB();
       // String query=DBQueries.removeEmployeeQuery(employee);
        int res=DBHandle.setData(conn, "");
        return res;
    }
    public static ArrayList<EmployeeDetail> viewEmployeeDetail(JobDetail jobDetail) throws SQLException, ClassNotFoundException{
        EmployeeDetail employeeDetail=null;
        ArrayList<EmployeeDetail> employeeDetailList=new ArrayList<EmployeeDetail>();
        String query=DBQueries.searchAllTablesAnyColumnsQuery("EmployeeDetail", jobDetail.getJob_Code(), "Job_Code", "*");
        ResultSet rst=DBHandle.getData(DBConn.getConnectionToDB(), query);
        while(rst.next()){
            employeeDetail=new EmployeeDetail(rst.getString("Employee_ID"), rst.getString("Job_Code"));
            employeeDetailList.add(employeeDetail);
        }
        return employeeDetailList;
    }
    public static Employee SearchEmployee(Employee employee) throws ClassNotFoundException, SQLException{
        Connection conn=DBConn.getConnectionToDB();
        String query=DBQueries.searchAllTablesAnyColumnsQuery("Employee", employee.getEmployee_ID(), "Employee_ID", "*");
        ResultSet rst=DBHandle.getData(conn, query);
        if (rst.next()) {
            employee.setEmployee_ID(rst.getString("Employee_ID"));
            employee.setEmployee_Name(rst.getString("Employee_Name"));
            employee.setEmployee_Address(rst.getString("Employee_Address"));
            employee.setEmployee_Contact(rst.getString("Employee_Contact"));
            employee.setEmployee_NIC(rst.getString("Employee_NIC"));
            employee.setEmployee_Type_ID(rst.getString("Employee_Type_ID"));  
        }
        return employee;
    }
    public static EmployeeType SearchEmployeeTypewithName(EmployeeType employeeType) throws ClassNotFoundException, SQLException{
        Connection conn=DBConn.getConnectionToDB();
        String query=DBQueries.searchAllTablesAnyColumnsQuery("EmployeeType", employeeType.getEmployee_Type_Name(), "Employee_Type_Name", "*");
        ResultSet rst=DBHandle.getData(conn, query);
        if (rst.next()) {
            employeeType.setEmployee_Type_ID(rst.getString("Employee_Type_ID"));
            employeeType.setEmployee_Type_Name(rst.getString("Employee_Type_Name"));
            employeeType.setEmployee_Type_Description(rst.getString("Employee_Type_Description"));
        }
        return employeeType;
    }
    public static EmployeeType SearchEmployeeTypewithID(EmployeeType employeeType) throws ClassNotFoundException, SQLException{
        Connection conn=DBConn.getConnectionToDB();
        String query=DBQueries.searchAllTablesAnyColumnsQuery("EmployeeType", employeeType.getEmployee_Type_ID(), "Employee_Type_ID", "*");
        ResultSet rst=DBHandle.getData(conn, query);
        if (rst.next()) {
            employeeType.setEmployee_Type_ID(rst.getString("Employee_Type_ID"));
            employeeType.setEmployee_Type_Name(rst.getString("Employee_Type_Name"));
            employeeType.setEmployee_Type_Description(rst.getString("Employee_Type_Description"));
        }
        return employeeType;
    }
    
    public static void viewEmployeeTableinDesignation(JTable tbEmployee,String value){
        try {
            DefaultTableModel Deleteitemtable = (DefaultTableModel) tbEmployee.getModel();
            int rw = tbEmployee.getRowCount();
            for (int j = 0; j < rw; j++) {
                Deleteitemtable.removeRow(0);
            }
            Connection conn = DBConn.getConnectionToDB();
            String query = DBQueries.searchAllTablesAnyColumnsQuery("Employee e NATURAL JOIN EmployeeType et", value,"et.Employee_Type_Name","e.Employee_ID","e.Employee_Name","et.Employee_Type_Name","e.Employee_Contact","e.Employee_NIC");
            ResultSet rst = DBHandle.getData(conn, query);
            while (rst.next()) {
                Object[] ob = {rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4),rst.getString(5)};
                Deleteitemtable.addRow(ob);
                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                    e.getStackTrace();
                }
            }
        } catch (Exception ex) {
        }
    }
    
   public static void viewEmployeeTableAll(JTable tbEmployee){
        try {
            DefaultTableModel Deleteitemtable = (DefaultTableModel) tbEmployee.getModel();
            int rw = tbEmployee.getRowCount();
            for (int j = 0; j < rw; j++) {
                Deleteitemtable.removeRow(0);
            }
            Connection conn = DBConn.getConnectionToDB();
            String query = "Select e.Employee_ID,e.Employee_Name,et.Employee_Type_Name,e.Employee_Contact,e.Employee_NIC from Employee e NATURAL JOIN EmployeeType et"; 
            ResultSet rst = DBHandle.getData(conn, query);
            while (rst.next()) {
                Object[] ob = {rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4),rst.getString(5)};
                Deleteitemtable.addRow(ob);
                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                    e.getStackTrace();
                }
            }
        } catch (Exception ex) {
        }
    }
}

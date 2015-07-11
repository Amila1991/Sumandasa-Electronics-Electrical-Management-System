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
import model.Employee;
import model.Vendor;

/**
 *
 * @author Amila
 */
public class VendorControl {
    public static int addVendor(Vendor vendor) throws ClassNotFoundException, SQLException{
        Connection conn=DBConn.getConnectionToDB();
        String query=DBQueries.addVendorQuery(vendor);
        System.out.println(query);
        int res=DBHandle.setData(conn, query);
        return res;
    }
    
    public static Vendor SearchVendor(Vendor vendor) throws ClassNotFoundException, SQLException{
        Connection conn=DBConn.getConnectionToDB();
        String query=DBQueries.searchAllTablesAnyColumnsQuery("Vendor", vendor.getVendor_Name(), "Vendor_Name", "*");
        ResultSet rst=DBHandle.getData(conn, query);
        if (rst.next()) {
            vendor.setVendor_ID(rst.getString("Vendor_ID"));
            vendor.setVendor_Name(rst.getString("Vendor_Name"));
            vendor.setVendor_Address(rst.getString("Vendor_Address"));
            vendor.setContact_No1(rst.getString("Contact_No1"));
            vendor.setContact_No2(rst.getString("Contact_No2"));
            vendor.setContact_No3(rst.getString("Contact_No3"));
            vendor.setFAX_No(rst.getString("FAX_No"));
            vendor.setEmail(rst.getString("Email"));  
        }
        return vendor;
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package connection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Amila Karunathilaka
 */
public class DBHandle {
    public static int setData(Connection conn,String query) throws SQLException{
        Statement stm=conn.createStatement();
        int res=stm.executeUpdate(query);
        return res;
    }
    public static ResultSet getData(Connection conn,String query) throws SQLException{
        Statement stm=conn.createStatement();
        ResultSet rst=stm.executeQuery(query);
        return rst;
    }
}

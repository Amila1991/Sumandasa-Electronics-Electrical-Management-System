/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package connection;

import dataFilesControl.ReadFile;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Amila Karunathilaka
 */
public class DBConn {
    private static final String URL=ReadFile.getDBConnectionpathinFile().get("URL");
    private static final String USER=ReadFile.getDBConnectionpathinFile().get("USER");
    private static final String PASSWORD=ReadFile.getDBConnectionpathinFile().get("PASSWORD");

    private static Connection conn=null;
    private static DBConn dbconn=null;

    private  DBConn() throws ClassNotFoundException, SQLException {
        Class.forName(ReadFile.getDBConnectionpathinFile().get("DriverName"));
        conn=DriverManager.getConnection(URL, USER, PASSWORD);
    }

    private static DBConn getDBConn() throws ClassNotFoundException, SQLException{
        if (dbconn==null) {
            dbconn=new DBConn();
            conn.setAutoCommit(false);
        }
        return dbconn;
    }

    public static Connection getConnectionToDB() throws ClassNotFoundException, SQLException{
        return getDBConn().conn;
    }
}

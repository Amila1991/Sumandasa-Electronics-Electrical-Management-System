/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Amila
 */
public class DBConnectionControl {
    public static ArrayList<String> getDatabaseList(String className,String driverName,String host,String userName,String password) throws ClassNotFoundException, SQLException{ 
        ArrayList<String> databaseList=new ArrayList<String>();
        Class.forName(className);
        String URL=driverName+"//"+host;
        Connection con=DriverManager.getConnection(URL, userName, password);
        ResultSet rst=DBHandle.getData(con, "show databases");
        while (rst.next()) {            
            databaseList.add(rst.getString("Database"));
        }
        return databaseList;
    }
    
    public static boolean createDatabase(String className,String driverName,String host,String userName,String password,String databaseName) throws ClassNotFoundException, SQLException{
        Class.forName(className);
        String URL=driverName+"//"+host;
        Connection con=DriverManager.getConnection(URL, userName, password);
        int res=DBHandle.setData(con, "create database "+databaseName);
        if (res==1) {
            return true;
        }
        return false;
    }
}

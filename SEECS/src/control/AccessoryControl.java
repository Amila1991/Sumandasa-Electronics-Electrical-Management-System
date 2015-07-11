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
import model.Accessory;

/**
 *
 * @author Amila
 */
public class AccessoryControl {
    public static int addAccessory(Accessory accessory) throws ClassNotFoundException, SQLException{
        Connection conn=DBConn.getConnectionToDB();
        String query=DBQueries.addAccessoryQuery(accessory);
        int res=DBHandle.setData(conn, query);
        return res;
    }
    public static Accessory viewAccessory(Accessory accessory) throws SQLException, ClassNotFoundException{
        String query=DBQueries.searchAllTablesAnyColumnsQuery("Accessory", accessory.getAccessory_ID(), "Accessory_ID", "*");
        ResultSet rst=DBHandle.getData(DBConn.getConnectionToDB(), query);
        if(rst.next()){
            accessory.setAccessory_ID(rst.getString("Accessory_ID"));
            accessory.setAccessory_Description(rst.getString("Accessory_Description"));
            accessory.setUnit_Purchase_Price(rst.getDouble("Unit_Purchase_Price"));
            accessory.setUnit_Issue_Price(rst.getDouble("Unit_Issue_Price"));
            accessory.setQtyOnHand(rst.getInt("QtyOnHand"));
            accessory.setAccessories_Category_ID(rst.getString("Accessories_Category_ID"));
        }
        return accessory;
    }
}

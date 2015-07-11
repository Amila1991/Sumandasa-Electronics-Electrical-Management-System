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
import model.SalesItem;
import model.SalesItemType;

/**
 *
 * @author Amila
 */
public class SalesItemControl {
    public static int addSalesItem(SalesItem salesItem) throws ClassNotFoundException, SQLException {
        String query = DBQueries.addSalesItemQuery(salesItem);
        Connection conn = DBConn.getConnectionToDB();
        int res = DBHandle.setData(conn, query);
        conn.commit();
        return res;
    }

    public static int addItemType(SalesItemType salesItemType) throws ClassNotFoundException, SQLException {
        String query = DBQueries.addSalesItemTypeQuery(salesItemType);
        Connection conn = DBConn.getConnectionToDB();
        int res = DBHandle.setData(conn, query);
        conn.commit();
        return res;
    }
    
    public static SalesItem getSalesItem(String value, String column) throws ClassNotFoundException, SQLException {
        Connection conn = DBConn.getConnectionToDB();
        SalesItem salesItem = new SalesItem();
        String query = DBQueries.searchAllTablesAnyColumnsQuery("SalesItem", value, column, "*");
        ResultSet rst = DBHandle.getData(conn, query);
        conn.commit();
        if (rst.next()) {
            salesItem.setModel_No(rst.getString("Model_No"));
            salesItem.setItem_Description(rst.getString("Item_Description"));
            salesItem.setItem_Brand_Name(rst.getString("Item_Brand_Name"));
            salesItem.setReceive_price(rst.getDouble("Receive_price"));
            salesItem.setCash_Issue_price(rst.getDouble("Cash_Issue_price"));
            salesItem.setCredit_Issue_price(rst.getDouble("Credit_Issue_price"));
            salesItem.setWarranty_Period(rst.getString("Warranty_Period"));
            salesItem.setItem_Qty(rst.getInt("Item_Qty"));
            salesItem.setItemType_Code(rst.getString("ItemType_Code"));
        }
        return salesItem;
    }

    public static SalesItemType getSalesTypeItem(String itemTypeName) throws ClassNotFoundException, SQLException {
        Connection conn = DBConn.getConnectionToDB();
        SalesItemType salesItemType = new SalesItemType();
        String query = DBQueries.searchAllTablesAnyColumnsQuery("SalesItemType", itemTypeName, "ItemType_Name", "*");
        ResultSet rst = DBHandle.getData(conn, query);
        conn.commit();
        if (rst.next()) {
            salesItemType.setItemType_Code(rst.getString("ItemType_Code"));
            salesItemType.setItemType_Name(rst.getString("ItemType_Name"));
            salesItemType.setDescription(rst.getString("Description"));
        }
        return salesItemType;
    }
    
    public static int updateStock(ArrayList<SalesItem> salesItemList) throws ClassNotFoundException, SQLException{
        Connection conn = DBConn.getConnectionToDB();
        int res1=1;
        for (SalesItem salesItem : salesItemList) {
            String query = DBQueries.updateSalesItemQuery(salesItem);
            res1 = DBHandle.setData(conn, query);
            System.out.print(res1);
        }
        conn.commit();
        return  res1;
    }
}

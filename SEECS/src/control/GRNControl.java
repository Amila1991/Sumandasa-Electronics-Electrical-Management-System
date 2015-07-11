/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import connection.DBConn;
import connection.DBHandle;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import model.GRNDetail;
import model.GoodReceiveNote;
import model.SalesItem;
import model.Transaction;

/**
 *
 * @author Amila
 */
public class GRNControl {
    public static int addGRN(Transaction transaction,GoodReceiveNote goodReceiveNote, ArrayList<SalesItem> salesItemList) throws ClassNotFoundException, SQLException {
        Connection conn = DBConn.getConnectionToDB();
        conn.setAutoCommit(false);
        String query = DBQueries.addTransactionQuery(transaction);
        int res = DBHandle.setData(conn, query);
        query = DBQueries.addGRNQuery(goodReceiveNote);
        int res1 = DBHandle.setData(conn, query);
        int res2 = 0;
        for (SalesItem salesItem : salesItemList) {
            query = DBQueries.updateSalesItemQuery(salesItem);
            res1 = DBHandle.setData(conn, query);
            System.out.print(res1);
        }
        conn.commit();
        if (res == 1 && res1 == 1 && res2 == 1) {
            return 1;
        } else {
            return 0;
        }
    }
    public static int addGRNDetail(GRNDetail gRNDetail) throws ClassNotFoundException, SQLException{
        String query = DBQueries.addGRNDetailQuery(gRNDetail);
        Connection conn = DBConn.getConnectionToDB();
        int res = DBHandle.setData(conn, query);
        return res;
    }
}

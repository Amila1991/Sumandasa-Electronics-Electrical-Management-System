package componentControl;


import connection.DBConn;
import connection.DBHandle;
import java.sql.Connection;
import java.sql.ResultSet;
import java.text.NumberFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
public class AutoGenerate {

    public static String getNextID(String table,String column,String prefix) {
        String id = prefix+"0000";
        try {
            Connection con = DBConn.getConnectionToDB();
            ResultSet rst = DBHandle.getData(con,
                    "SELECT "+column+" FROM "+table+" ORDER BY 1 DESC Limit 1");
            while (rst.next()) {
                id = rst.getString(1);
            }
            System.out.println(id);
            int index = 0;
            for (int i = id.length() - 1; i >= 0; i--) {
                try {
                    Integer.parseInt(id.substring(i));
                } catch (Exception e) {
                    index = i + 1;
                    break;
                }
                System.out.println(id+" "+ index);
            }
            String newID = id.substring(index);
            int n = Integer.parseInt(newID);
            n++;
            NumberFormat nf = NumberFormat.getInstance();
            nf.setMinimumIntegerDigits(4);
            nf.setGroupingUsed(false);//no more  100,000
//            nf.setMaximumFractionDigits(2);   nf.setMinimumFractionDigits(2) ;//
             id=id.substring(0, index) + nf.format(n);
        } catch (Exception ex) {
            Logger.getLogger(AutoGenerate.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }
    
    public static String getNextIDLoop(String table,String column,String prefix,int rowNo) {
        String id = prefix+"0000";
        try {
            Connection con = DBConn.getConnectionToDB();
            ResultSet rst = DBHandle.getData(con,
                    "SELECT "+column+" FROM "+table+" ORDER BY 1 DESC Limit 1");
            while (rst.next()) {
                id = rst.getString(1);
            }
            int index = 0;
            for (int i = id.length() - 1; i >= 0; i--) {
                try {
                    Integer.parseInt(id.substring(i));
                } catch (Exception e) {
                    index = i + 1;
                    break;
                }
            }
            String newID = id.substring(index);
            int n = Integer.parseInt(newID);
            n++;
            n+=rowNo;
            NumberFormat nf = NumberFormat.getInstance();
            nf.setMinimumIntegerDigits(3);
            nf.setGroupingUsed(false);//no more  100,000
//            nf.setMaximumFractionDigits(2);   nf.setMinimumFractionDigits(2) ;//
             id=id.substring(0, index) + nf.format(n);
        } catch (Exception ex) {
            Logger.getLogger(AutoGenerate.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }
}

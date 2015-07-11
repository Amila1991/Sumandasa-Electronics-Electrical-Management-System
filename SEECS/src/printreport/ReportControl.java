/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package printreport;

import componentControl.ValidationValues;
import connection.DBConn;
import connection.DBHandle;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.SoldItem;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Amila
 */
public class ReportControl {

    public static void ServiceOrderReport(Map<String, Object> paramData) {
        try {
            String reportSource = "src/report/ServiceOrderReport.jrxml";

            Map<String, Object> param = paramData;

            JasperReport jr = JasperCompileManager.compileReport(reportSource);
            JasperPrint jp = JasperFillManager.fillReport(jr, param, new JREmptyDataSource());
            JasperViewer.viewReport(jp, false);
        } catch (JRException ex) {
            Logger.getLogger(ReportControl.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void printBill(ArrayList<SoldItem> soldItemList, Map<String, Object> param) {
        Collection<PrintBillString> c = new ArrayList<PrintBillString>();
        String reportSource = "ShopBill.jrxml";
        for (SoldItem soldItem : soldItemList) {
            PrintBillString printBill = new PrintBillString(soldItem.getSerial_No(), soldItem.getModel_No(), soldItem.getItem_Description(), soldItem.getItem_Qty()+"", ValidationValues.ValidateCurrencyValue(soldItem.getIssue_price()+""), ValidationValues.ValidateCurrencyValue(soldItem.getAmount()+""), soldItem.getWarranty_Period());
            c.add(printBill);
        }


        try {
            JRBeanCollectionDataSource jrb = new JRBeanCollectionDataSource(c);

            JasperReport jr = JasperCompileManager.compileReport(reportSource);
            JasperPrint jp = JasperFillManager.fillReport(jr, param, jrb);
            //JasperPrintManager.printReport(jp, false);
            JasperViewer.viewReport(jp, false);
        } catch (JRException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    private static void aa() {
        Map<String, Object> param = new HashMap<String, Object>();
        Collection<PrintBill> c = new ArrayList<PrintBill>();
        String reportSource = "src/printreport/ShopBillA5.jrxml";
        String query = "select * from soldItem where Order_ID='OD0058'";
        try {
            ResultSet rst = DBHandle.getData(DBConn.getConnectionToDB(), query);
            if (rst.next()) {
                PrintBill printBill = new PrintBill();
                printBill.setSerialno(rst.getString("Serial_No"));
                printBill.setDescription(rst.getString("Item_Description"));
                printBill.setModelno(rst.getString("Model_No"));
                printBill.setQty(rst.getInt("Item_Qty"));
                printBill.setAmount(rst.getDouble("Issue_price"));
                printBill.setUnitprice(rst.getDouble("Issue_price"));
                c.add(printBill);

            }
            query = "select * from SalesOrders so NATURAL JOIN Customer c where so.Order_ID='OD0058'";
            rst = DBHandle.getData(DBConn.getConnectionToDB(), query);
            if (rst.next()) {
                param.put("custname", rst.getString("Cust_Name"));
                param.put("custaddress", rst.getString("Cust_Address"));
                param.put("invoiceno", rst.getString("Order_ID"));
                param.put("date", rst.getString("Order_Date"));
                param.put("term", "Cash");
                param.put("totalamount", rst.getString("Total_Amount"));
                param.put("rep", "dilusha");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ReportControl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ReportControl.class.getName()).log(Level.SEVERE, null, ex);
        }


        try {
            JRBeanCollectionDataSource jrb = new JRBeanCollectionDataSource(c);

            JasperReport jr = JasperCompileManager.compileReport(reportSource);
            JasperPrint jp = JasperFillManager.fillReport(jr, param, jrb);
            JasperPrintManager.printReport(jp, false);
            JasperViewer.viewReport(jp, false);
        } catch (JRException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }
    
    public static void getIncomeReport(Map<String,Object> param,ArrayList<IncomeReport> incomeReportList){
        String reportSource = "Incomereprot.jrxml";
        Collection<IncomeReport> c = incomeReportList;
        
        try {
            JRBeanCollectionDataSource jrb = new JRBeanCollectionDataSource(c);

            JasperReport jr = JasperCompileManager.compileReport(reportSource);
            JasperPrint jp = JasperFillManager.fillReport(jr, param, jrb);
            //JasperPrintManager.printReport(jp, false);
            JasperViewer.viewReport(jp, false);
        } catch (JRException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
    }

    public static void main(String[] args) {
        aa();
        //getIncomeReport();
    }
}

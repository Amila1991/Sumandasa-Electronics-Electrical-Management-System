/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Amila
 */
public class GoodReceiveNote {

    private String GRN_ID;
    private String GRN_Date;
    private double Total_Amount;
    private double Discount;
    private String GRN_Invoice_No;
    private String Vendor_ID;
    private String Transaction_ID;

    public GoodReceiveNote() {
    }

    public GoodReceiveNote(String GRN_ID, String GRN_Date, double Total_Amount, double Discount, String GRN_Invoice_No, String Vendor_ID, String Transaction_ID) {
        this.GRN_ID = GRN_ID;
        this.GRN_Date = GRN_Date;
        this.Total_Amount = Total_Amount;
        this.Discount = Discount;
        this.GRN_Invoice_No = GRN_Invoice_No;
        this.Vendor_ID = Vendor_ID;
        this.Transaction_ID = Transaction_ID;
    }

    public String getTransaction_ID() {
        return Transaction_ID;
    }

    public void setTransaction_ID(String Transaction_ID) {
        this.Transaction_ID = Transaction_ID;
    }

    public double getDiscount() {
        return Discount;
    }

    public void setDiscount(double Discount) {
        this.Discount = Discount;
    }

    public String getGRN_Date() {
        return GRN_Date;
    }

    public void setGRN_Date(String GRN_Date) {
        this.GRN_Date = GRN_Date;
    }

    public String getGRN_ID() {
        return GRN_ID;
    }

    public void setGRN_ID(String GRN_ID) {
        this.GRN_ID = GRN_ID;
    }

    public String getGRN_Invoice_No() {
        return GRN_Invoice_No;
    }

    public void setGRN_Invoice_No(String GRN_Invoice_No) {
        this.GRN_Invoice_No = GRN_Invoice_No;
    }

    public double getTotal_Amount() {
        return Total_Amount;
    }

    public void setTotal_Amount(double Total_Amount) {
        this.Total_Amount = Total_Amount;
    }

    public String getVendor_ID() {
        return Vendor_ID;
    }

    public void setVendor_ID(String Vendor_ID) {
        this.Vendor_ID = Vendor_ID;
    }
}

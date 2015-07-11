/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Amila
 */
public class Invoice {
    private String Invoice_No;
    private String Date;
    private Double Amount;
    private String Service_Order_ID;

    public Invoice() {
    }

    public Invoice(String Invoice_No, String Date, Double Amount, String Service_Order_ID) {
        this.Invoice_No = Invoice_No;
        this.Date = Date;
        this.Amount = Amount;
        this.Service_Order_ID = Service_Order_ID;
    }

    /**
     * @return the Invoice_No
     */
    public String getInvoice_No() {
        return Invoice_No;
    }

    /**
     * @return the Date
     */
    public String getDate() {
        return Date;
    }

    /**
     * @return the Amount
     */
    public Double getAmount() {
        return Amount;
    }

    /**
     * @return the Service_Order_ID
     */
    public String getService_Order_ID() {
        return Service_Order_ID;
    }

    /**
     * @param Invoice_No the Invoice_No to set
     */
    public void setInvoice_No(String Invoice_No) {
        this.Invoice_No = Invoice_No;
    }

    /**
     * @param Date the Date to set
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * @param Amount the Amount to set
     */
    public void setAmount(Double Amount) {
        this.Amount = Amount;
    }

    /**
     * @param Service_Order_ID the Service_Order_ID to set
     */
    public void setService_Order_ID(String Service_Order_ID) {
        this.Service_Order_ID = Service_Order_ID;
    }
    
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Amila
 */
public class SalesOrder {

    private String Order_ID;
    private String Order_Date;
    private double Total_Amount;
    private double Discount;
    private String Cust_ID;
    private String Transaction_ID;

    public SalesOrder() {
    }

    public SalesOrder(String Order_ID, String Order_Date, double Total_Amount, double Discount, String Cust_ID, String Transaction_ID) {
        this.Order_ID = Order_ID;
        this.Order_Date = Order_Date;
        this.Total_Amount = Total_Amount;
        this.Discount = Discount;
        this.Cust_ID = Cust_ID;
        this.Transaction_ID = Transaction_ID;
    }

    

    public String getCust_ID() {
        return Cust_ID;
    }

    public void setCust_ID(String Cust_ID) {
        this.Cust_ID = Cust_ID;
    }

    public String getOrder_Date() {
        return Order_Date;
    }

    public void setOrder_Date(String Order_Date) {
        this.Order_Date = Order_Date;
    }

    public String getOrder_ID() {
        return Order_ID;
    }

    public void setOrder_ID(String Order_ID) {
        this.Order_ID = Order_ID;
    }

    public double getTotal_Amount() {
        return Total_Amount;
    }

    public void setTotal_Amount(double Total_Amount) {
        this.Total_Amount = Total_Amount;
    }
    
    public double getDiscount() {
        return Discount;
    }

    public void setDiscount(double Discount) {
        this.Discount = Discount;
    }

    public String getTransaction_ID() {
        return Transaction_ID;
    }

    public void setTransaction_ID(String Transaction_ID) {
        this.Transaction_ID = Transaction_ID;
    }

    
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Amila
 */
public class SalesOrderCancel {
    
    private String Order_ID; 	
    private String Order_Cancel_Date; 	
    private double Total_Amount; 	
    private double Discount;		
    private String Transaction_ID;		
    private String Employee_ID;

    public SalesOrderCancel() {
    }

    public SalesOrderCancel(String Order_ID, String Order_Cancel_Date, double Total_Amount, double Discount, String Transaction_ID, String Employee_ID) {
        this.Order_ID = Order_ID;
        this.Order_Cancel_Date = Order_Cancel_Date;
        this.Total_Amount = Total_Amount;
        this.Discount = Discount;
        this.Transaction_ID = Transaction_ID;
        this.Employee_ID = Employee_ID;
    }

    public double getDiscount() {
        return Discount;
    }

    public void setDiscount(double Discount) {
        this.Discount = Discount;
    }

    public String getEmployee_ID() {
        return Employee_ID;
    }

    public void setEmployee_ID(String Employee_ID) {
        this.Employee_ID = Employee_ID;
    }

    public String getOrder_Cancel_Date() {
        return Order_Cancel_Date;
    }

    public void setOrder_Cancel_Date(String Order_Cancel_Date) {
        this.Order_Cancel_Date = Order_Cancel_Date;
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

    public String getTransaction_ID() {
        return Transaction_ID;
    }

    public void setTransaction_ID(String Transaction_ID) {
        this.Transaction_ID = Transaction_ID;
    }
    
    
    
}

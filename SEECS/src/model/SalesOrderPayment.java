/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Amila
 */
public class SalesOrderPayment {
    private String OrderPayment_ID;
	private double OrderPayment_Amount;
	private String OrderPayment_Date;
	private int OrderPayment_Discount;
	private String Order_ID;

    public SalesOrderPayment() {
    }

    public SalesOrderPayment(String OrderPayment_ID, double OrderPayment_Amount, String OrderPayment_Date, int OrderPayment_Discount, String Order_ID) {
        this.OrderPayment_ID = OrderPayment_ID;
        this.OrderPayment_Amount = OrderPayment_Amount;
        this.OrderPayment_Date = OrderPayment_Date;
        this.OrderPayment_Discount = OrderPayment_Discount;
        this.Order_ID = Order_ID;
    }

    /**
     * @return the OrderPayment_ID
     */
    public String getOrderPayment_ID() {
        return OrderPayment_ID;
    }

    /**
     * @param rderPayment_ID the rderPayment_ID to set
     */
    public void setOrderPayment_ID(String OrderPayment_ID) {
        this.OrderPayment_ID= OrderPayment_ID;
    }

    /**
     * @return the OrderPayment_Amount
     */
    public double getOrderPayment_Amount() {
        return OrderPayment_Amount;
    }

    /**
     * @param OrderPayment_Amount the OrderPayment_Amount to set
     */
    public void setOrderPayment_Amount(double OrderPayment_Amount) {
        this.OrderPayment_Amount = OrderPayment_Amount;
    }

    /**
     * @return the OrderPayment_Date
     */
    public String getOrderPayment_Date() {
        return OrderPayment_Date;
    }

    /**
     * @param OrderPayment_Date the OrderPayment_Date to set
     */
    public void setOrderPayment_Date(String OrderPayment_Date) {
        this.OrderPayment_Date = OrderPayment_Date;
    }

    /**
     * @return the OrderPayment_Discount
     */
    public int getOrderPayment_Discount() {
        return OrderPayment_Discount;
    }

    /**
     * @param OrderPayment_Discount the OrderPayment_Discount to set
     */
    public void setOrderPayment_Discount(int OrderPayment_Discount) {
        this.OrderPayment_Discount = OrderPayment_Discount;
    }

    /**
     * @return the Order_ID
     */
    public String getOrder_ID() {
        return Order_ID;
    }

    /**
     * @param Order_ID the Order_ID to set
     */
    public void setOrder_ID(String Order_ID) {
        this.Order_ID = Order_ID;
    }
        
        
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 *
 * @author Amila Karunathilaka
 */
public class ServiceOrder {
    private String service_Order_ID;
    private String duration;
    private String order_Date;
    private String issue_Date;
    private double total_Cost_Amount;
    private String custID;

    public ServiceOrder() {
    }

    public ServiceOrder(String service_Order_ID, String duration, String order_Date, String issue_Date, double total_Cost_Amount, String custID) {
        this.service_Order_ID = service_Order_ID;
        this.duration = duration;
        this.order_Date = order_Date;
        this.issue_Date = issue_Date;
        this.total_Cost_Amount = total_Cost_Amount;
        this.custID = custID;
    }

    

    /**
     * @return the service_Order_ID
     */
    public String getService_Order_ID() {
        return service_Order_ID;
    }

    /**
     * @return the order_Date
     */
    public String getOrder_Date() {
        return order_Date;
    }

    /**
     * @return the issue_Date
     */
    public String getIssue_Date() {
        return issue_Date;
    }

    /**
     * @return the total_Amount
     */
    public double getTotal_Cost_Amount() {
        return total_Cost_Amount;
    }

    /**
     * @return the custID
     */
    public String getCustID() {
        return custID;
    }

    /**
     * @param service_Order_ID the service_Order_ID to set
     */
    public void setService_Order_ID(String service_Order_ID) {
        this.service_Order_ID = service_Order_ID;
    }

    /**
     * @param order_Date the order_Date to set
     */
    public void setOrder_Date(String order_Date) {
        this.order_Date = order_Date;
    }

    /**
     * @param issue_Date the issue_Date to set
     */
    public void setIssue_Date(String issue_Date) {
        this.issue_Date = issue_Date;
    }

    /**
     * @param total_Amount the total_Amount to set
     */
    public void setTotal_Cost_Amount(double total_Amount) {
        this.total_Cost_Amount = total_Amount;
    }

    /**
     * @param custID the custID to set
     */
    public void setCustID(String custID) {
        this.custID = custID;
    }

    /**
     * @return the duration
     */
    public String getDuration() {
        return duration;
    }

    /**
     * @param duration the duration to set
     */
    public void setDuration(String duration) {
        this.duration = duration;
    }

    
}

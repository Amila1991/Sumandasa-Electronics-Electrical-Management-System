/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Amila
 */
public class ReturnItem {
    private String Serial_No;
    private String Model_No;
    private String Item_Description;
    private String Item_Brand_Name;
    private double Receive_price;
    private double Issue_price;
    private int Item_Qty;
    private double Amount;
    private String Warranty_Period;
    private String Order_ID;

    public ReturnItem() {
    }

    public ReturnItem(String Serial_No, String Model_No, String Item_Description, String Item_Brand_Name, double Receive_price, double Issue_price, int Item_Qty, double Amount, String Warranty_Period, String Order_ID) {
        this.Serial_No = Serial_No;
        this.Model_No = Model_No;
        this.Item_Description = Item_Description;
        this.Item_Brand_Name = Item_Brand_Name;
        this.Receive_price = Receive_price;
        this.Issue_price = Issue_price;
        this.Item_Qty = Item_Qty;
        this.Amount = Amount;
        this.Warranty_Period = Warranty_Period;
        this.Order_ID = Order_ID;
    }

    /**
     * @return the Serial_No
     */
    public String getSerial_No() {
        return Serial_No;
    }

    /**
     * @param Serial_No the Serial_No to set
     */
    public void setSerial_No(String Serial_No) {
        this.Serial_No = Serial_No;
    }

    /**
     * @return the Model_No
     */
    public String getModel_No() {
        return Model_No;
    }

    /**
     * @param Model_No the Model_No to set
     */
    public void setModel_No(String Model_No) {
        this.Model_No = Model_No;
    }

    /**
     * @return the Item_Description
     */
    public String getItem_Description() {
        return Item_Description;
    }

    /**
     * @param Item_Description the Item_Description to set
     */
    public void setItem_Description(String Item_Description) {
        this.Item_Description = Item_Description;
    }

    /**
     * @return the Item_Brand_Name
     */
    public String getItem_Brand_Name() {
        return Item_Brand_Name;
    }

    /**
     * @param Item_Brand_Name the Item_Brand_Name to set
     */
    public void setItem_Brand_Name(String Item_Brand_Name) {
        this.Item_Brand_Name = Item_Brand_Name;
    }

    /**
     * @return the Receive_price
     */
    public double getReceive_price() {
        return Receive_price;
    }

    /**
     * @param Receive_price the Receive_price to set
     */
    public void setReceive_price(double Receive_price) {
        this.Receive_price = Receive_price;
    }

    /**
     * @return the Issue_price
     */
    public double getIssue_price() {
        return Issue_price;
    }

    /**
     * @param Issue_price the Issue_price to set
     */
    public void setIssue_price(double Issue_price) {
        this.Issue_price = Issue_price;
    }

    /**
     * @return the Item_Qty
     */
    public int getItem_Qty() {
        return Item_Qty;
    }

    /**
     * @param Item_Qty the Item_Qty to set
     */
    public void setItem_Qty(int Item_Qty) {
        this.Item_Qty = Item_Qty;
    }

    /**
     * @return the Amount
     */
    public double getAmount() {
        return Amount;
    }

    /**
     * @param Amount the Amount to set
     */
    public void setAmount(double Amount) {
        this.Amount = Amount;
    }

    /**
     * @return the Warranty_Period
     */
    public String getWarranty_Period() {
        return Warranty_Period;
    }

    /**
     * @param Warranty_Period the Warranty_Period to set
     */
    public void setWarranty_Period(String Warranty_Period) {
        this.Warranty_Period = Warranty_Period;
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

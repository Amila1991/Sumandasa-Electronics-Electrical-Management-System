/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Amila
 */
public class SalesItem {

    private String Model_No;
    private String Item_Description;
    private String Item_Brand_Name;
    private double Receive_price;
    private double Cash_Issue_price;
    private double Credit_Issue_price;
    private int Item_Qty;
    private String Warranty_Period;
    private String ItemType_Code;

    public SalesItem() {
    }

    public SalesItem(String Model_No, String Item_Description, String Item_Brand_Name, double Receive_price, double Cash_Issue_price, double Credit_Issue_price, int Item_Qty, String Warranty_Period, String ItemType_Code) {
        this.Model_No = Model_No;
        this.Item_Description = Item_Description;
        this.Item_Brand_Name = Item_Brand_Name;
        this.Receive_price = Receive_price;
        this.Cash_Issue_price = Cash_Issue_price;
        this.Credit_Issue_price = Credit_Issue_price;
        this.Item_Qty = Item_Qty;
        this.Warranty_Period = Warranty_Period;
        this.ItemType_Code = ItemType_Code;
    }

    public double getCash_Issue_price() {
        return Cash_Issue_price;
    }

    public void setCash_Issue_price(double Cash_Issue_price) {
        this.Cash_Issue_price = Cash_Issue_price;
    }

    public double getCredit_Issue_price() {
        return Credit_Issue_price;
    }

    public void setCredit_Issue_price(double Credit_Issue_price) {
        this.Credit_Issue_price = Credit_Issue_price;
    }

    public String getItemType_Code() {
        return ItemType_Code;
    }

    public void setItemType_Code(String ItemType_Code) {
        this.ItemType_Code = ItemType_Code;
    }

    public String getItem_Brand_Name() {
        return Item_Brand_Name;
    }

    public void setItem_Brand_Name(String Item_Brand_Name) {
        this.Item_Brand_Name = Item_Brand_Name;
    }

    public String getItem_Description() {
        return Item_Description;
    }

    public void setItem_Description(String Item_Description) {
        this.Item_Description = Item_Description;
    }

    public int getItem_Qty() {
        return Item_Qty;
    }

    public void setItem_Qty(int Item_Qty) {
        this.Item_Qty = Item_Qty;
    }

    public String getModel_No() {
        return Model_No;
    }

    public void setModel_No(String Model_No) {
        this.Model_No = Model_No;
    }

    public double getReceive_price() {
        return Receive_price;
    }

    public void setReceive_price(double Receive_price) {
        this.Receive_price = Receive_price;
    }

    public String getWarranty_Period() {
        return Warranty_Period;
    }

    public void setWarranty_Period(String Warranty_Period) {
        this.Warranty_Period = Warranty_Period;
    }
}

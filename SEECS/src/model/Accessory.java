/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Amila
 */
public class Accessory {
    private String Accessory_ID;
    private String Accessory_Description;
    private double Unit_Purchase_Price;
    private double Unit_Issue_Price;
    private int QtyOnHand;
    private String Accessories_Category_ID;

    public Accessory() {
    }

    public Accessory(String Accessory_ID, String Accessory_Description, double Unit_Purchase_Price, double Unit_Issue_Price, int QtyOnHand, String Accessories_Category_ID) {
        this.Accessory_ID = Accessory_ID;
        this.Accessory_Description = Accessory_Description;
        this.Unit_Purchase_Price = Unit_Purchase_Price;
        this.Unit_Issue_Price = Unit_Issue_Price;
        this.QtyOnHand = QtyOnHand;
        this.Accessories_Category_ID = Accessories_Category_ID;
    }

    

    /**
     * @return the Accessory_ID
     */
    public String getAccessory_ID() {
        return Accessory_ID;
    }

    /**
     * @return the Accessory_Description
     */
    public String getAccessory_Description() {
        return Accessory_Description;
    }

    /**
     * @return the QtyOnHand
     */
    public int getQtyOnHand() {
        return QtyOnHand;
    }

    /**
     * @return the Accessories_Category_ID
     */
    public String getAccessories_Category_ID() {
        return Accessories_Category_ID;
    }

    /**
     * @param Accessory_ID the Accessory_ID to set
     */
    public void setAccessory_ID(String Accessory_ID) {
        this.Accessory_ID = Accessory_ID;
    }

    /**
     * @param Accessory_Description the Accessory_Description to set
     */
    public void setAccessory_Description(String Accessory_Description) {
        this.Accessory_Description = Accessory_Description;
    }

    /**
     * @param QtyOnHand the QtyOnHand to set
     */
    public void setQtyOnHand(int QtyOnHand) {
        this.QtyOnHand = QtyOnHand;
    }

    /**
     * @param Accessories_Category_ID the Accessories_Category_ID to set
     */
    public void setAccessories_Category_ID(String Accessories_Category_ID) {
        this.Accessories_Category_ID = Accessories_Category_ID;
    }

    /**
     * @return the Unit_Purchase_Price
     */
    public double getUnit_Purchase_Price() {
        return Unit_Purchase_Price;
    }

    /**
     * @return the Unit_Issue_Price
     */
    public double getUnit_Issue_Price() {
        return Unit_Issue_Price;
    }

    /**
     * @param Unit_Purchase_Price the Unit_Purchase_Price to set
     */
    public void setUnit_Purchase_Price(double Unit_Purchase_Price) {
        this.Unit_Purchase_Price = Unit_Purchase_Price;
    }

    /**
     * @param Unit_Issue_Price the Unit_Issue_Price to set
     */
    public void setUnit_Issue_Price(double Unit_Issue_Price) {
        this.Unit_Issue_Price = Unit_Issue_Price;
    }
    
    
}

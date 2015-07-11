/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Amila
 */
public class AccessoriesDetail {
    private String Accessory_ID;
    private String Job_Code;
    private double Unit_Price;
    private int Qty;
    private boolean Accessories_Deatil_Issue;

    public AccessoriesDetail() {
    }

    public AccessoriesDetail(String Accessory_ID, String Job_Code, double Unit_Price, int Qty, boolean Accessories_Deatil_Issue) {
        this.Accessory_ID = Accessory_ID;
        this.Job_Code = Job_Code;
        this.Unit_Price = Unit_Price;
        this.Qty = Qty;
        this.Accessories_Deatil_Issue = Accessories_Deatil_Issue;
    }

    

    /**
     * @return the Accessory_ID
     */
    public String getAccessory_ID() {
        return Accessory_ID;
    }

    /**
     * @return the Job_Code
     */
    public String getJob_Code() {
        return Job_Code;
    }

    /**
     * @return the Unit_Price
     */
    public double getUnit_Price() {
        return Unit_Price;
    }

    /**
     * @return the Qty
     */
    public int getQty() {
        return Qty;
    }

    /**
     * @param Accessory_ID the Accessory_ID to set
     */
    public void setAccessory_ID(String Accessory_ID) {
        this.Accessory_ID = Accessory_ID;
    }

    /**
     * @param Job_Code the Job_Code to set
     */
    public void setJob_Code(String Job_Code) {
        this.Job_Code = Job_Code;
    }

    /**
     * @param Unit_Price the Unit_Price to set
     */
    public void setUnit_Price(double Unit_Price) {
        this.Unit_Price = Unit_Price;
    }

    /**
     * @param Qty the Qty to set
     */
    public void setQty(int Qty) {
        this.Qty = Qty;
    }

    /**
     * @return the Accessories_Deatil_Issue
     */
    public boolean isAccessories_Deatil_Issue() {
        return Accessories_Deatil_Issue;
    }

    /**
     * @param Accessories_Deatil_Issue the Accessories_Deatil_Issue to set
     */
    public void setAccessories_Deatil_Issue(boolean Accessories_Deatil_Issue) {
        this.Accessories_Deatil_Issue = Accessories_Deatil_Issue;
    }
    
    
}

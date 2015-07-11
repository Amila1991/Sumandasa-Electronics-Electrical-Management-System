/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Amila
 */
public class AccessoriesCategory {
    private String Accessories_Category_ID;
    private String Accessories_Category_Description;

    public AccessoriesCategory() {
    }

    public AccessoriesCategory(String Accessories_Category_ID, String Accessories_Category_Description) {
        this.Accessories_Category_ID = Accessories_Category_ID;
        this.Accessories_Category_Description = Accessories_Category_Description;
    }

    /**
     * @return the Accessories_Category_ID
     */
    public String getAccessories_Category_ID() {
        return Accessories_Category_ID;
    }

    /**
     * @return the Accessories_Category_Description
     */
    public String getAccessories_Category_Description() {
        return Accessories_Category_Description;
    }

    /**
     * @param Accessories_Category_ID the Accessories_Category_ID to set
     */
    public void setAccessories_Category_ID(String Accessories_Category_ID) {
        this.Accessories_Category_ID = Accessories_Category_ID;
    }

    /**
     * @param Accessories_Category_Description the Accessories_Category_Description to set
     */
    public void setAccessories_Category_Description(String Accessories_Category_Description) {
        this.Accessories_Category_Description = Accessories_Category_Description;
    }
    
    
}

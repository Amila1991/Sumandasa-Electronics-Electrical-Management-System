/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Amila
 */
public class SalesItemType {

    private String ItemType_Code;
    private String ItemType_Name;
    private String Description;

    public SalesItemType() {
    }

    public SalesItemType(String ItemType_Code, String ItemType_Name, String Description) {
        this.ItemType_Code = ItemType_Code;
        this.ItemType_Name = ItemType_Name;
        this.Description = Description;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getItemType_Code() {
        return ItemType_Code;
    }

    public void setItemType_Code(String ItemType_Code) {
        this.ItemType_Code = ItemType_Code;
    }

    public String getItemType_Name() {
        return ItemType_Name;
    }

    public void setItemType_Name(String ItemType_Name) {
        this.ItemType_Name = ItemType_Name;
    }
    
    
}

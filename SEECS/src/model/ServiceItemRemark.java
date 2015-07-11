/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Amila
 */
public class ServiceItemRemark {
    private int Item_Remarks_No;
    private String Item_Remarks_Description;
    private String Item_Code;

    public ServiceItemRemark() {
    }

    public ServiceItemRemark(int Item_Remarks_No, String Item_Remarks_Description, String Item_Code) {
        this.Item_Remarks_No = Item_Remarks_No;
        this.Item_Remarks_Description = Item_Remarks_Description;
        this.Item_Code = Item_Code;
    }

    /**
     * @return the Item_Remarks_No
     */
    public int getItem_Remarks_No() {
        return Item_Remarks_No;
    }

    /**
     * @return the Item_Remarks_Description
     */
    public String getItem_Remarks_Description() {
        return Item_Remarks_Description;
    }

    /**
     * @return the Item_Code
     */
    public String getItem_Code() {
        return Item_Code;
    }

    /**
     * @param Item_Remarks_No the Item_Remarks_No to set
     */
    public void setItem_Remarks_No(int Item_Remarks_No) {
        this.Item_Remarks_No = Item_Remarks_No;
    }

    /**
     * @param Item_Remarks_Description the Item_Remarks_Description to set
     */
    public void setItem_Remarks_Description(String Item_Remarks_Description) {
        this.Item_Remarks_Description = Item_Remarks_Description;
    }

    /**
     * @param Item_Code the Item_Code to set
     */
    public void setItem_Code(String Item_Code) {
        this.Item_Code = Item_Code;
    }

   
    
}

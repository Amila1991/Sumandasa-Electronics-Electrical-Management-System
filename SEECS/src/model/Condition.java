/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 *
 * @author Amila Karunathilaka
 */
public class Condition {
    private int condition_No;
    private String condition_Description;
    private String item_Code;

    public Condition() {
    }

    public Condition(int condition_No, String condition_Description, String item_Code) {
        this.condition_No = condition_No;
        this.condition_Description = condition_Description;
        this.item_Code = item_Code;
    }

    /**
     * @return the condition_No
     */
    public int getCondition_No() {
        return condition_No;
    }

    /**
     * @return the condition_Description
     */
    public String getCondition_Description() {
        return condition_Description;
    }

    /**
     * @return the item_Code
     */
    public String getItem_Code() {
        return item_Code;
    }

    /**
     * @param condition_No the condition_No to set
     */
    public void setCondition_No(int condition_No) {
        this.condition_No = condition_No;
    }

    /**
     * @param condition_Description the condition_Description to set
     */
    public void setCondition_Description(String condition_Description) {
        this.condition_Description = condition_Description;
    }

    /**
     * @param item_Code the item_Code to set
     */
    public void setItem_Code(String item_Code) {
        this.item_Code = item_Code;
    }

    
}

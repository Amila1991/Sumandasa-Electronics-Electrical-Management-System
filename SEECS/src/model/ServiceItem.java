/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Amila Karunathilaka
 */
public class ServiceItem {

    private String item_Code;
    private String description;
    private String Model_No;
    private String Serial_No;
    private String Item_Brand_Name;
    private double current_Value;
    private String Work_Finish_Date;
    private boolean Item_Can_Be_Repair;
    private String service_Order_ID;

    public ServiceItem() {
    }

    public ServiceItem(String item_Code, String description, String Model_No, String Serial_No, String Item_Brand_Name, double current_Value, String Work_Finish_Date, boolean Item_Can_Be_Repair, String service_Order_ID) {
        this.item_Code = item_Code;
        this.description = description;
        this.Model_No = Model_No;
        this.Serial_No = Serial_No;
        this.Item_Brand_Name = Item_Brand_Name;
        this.current_Value = current_Value;
        this.Work_Finish_Date = Work_Finish_Date;
        this.Item_Can_Be_Repair = Item_Can_Be_Repair;
        this.service_Order_ID = service_Order_ID;
    }


    /**
     * @return the item_Code
     */
    public String getItem_Code() {
        return item_Code;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @return the current_Value
     */
    public double getCurrent_Value() {
        return current_Value;
    }

    /**
     * @return the service_Order_ID
     */
    public String getService_Order_ID() {
        return service_Order_ID;
    }

    /**
     * @param item_Code the item_Code to set
     */
    public void setItem_Code(String item_Code) {
        this.item_Code = item_Code;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @param current_Value the current_Value to set
     */
    public void setCurrent_Value(double current_Value) {
        this.current_Value = current_Value;
    }

    /**
     * @param service_Order_ID the service_Order_ID to set
     */
    public void setService_Order_ID(String service_Order_ID) {
        this.service_Order_ID = service_Order_ID;
    }

    /**
     * @return the Model_No
     */
    public String getModel_No() {
        return Model_No;
    }

    /**
     * @return the Serial_No
     */
    public String getSerial_No() {
        return Serial_No;
    }

    /**
     * @return the Item_Brand_Name
     */
    public String getItem_Brand_Name() {
        return Item_Brand_Name;
    }

    /**
     * @param Model_No the Model_No to set
     */
    public void setModel_No(String Model_No) {
        this.Model_No = Model_No;
    }

    /**
     * @param Serial_No the Serial_No to set
     */
    public void setSerial_No(String Serial_No) {
        this.Serial_No = Serial_No;
    }

    /**
     * @param Item_Brand_Name the Item_Brand_Name to set
     */
    public void setItem_Brand_Name(String Item_Brand_Name) {
        this.Item_Brand_Name = Item_Brand_Name;
    }

    /**
     * @return the Work_Finish_Date
     */
    public String getWork_Finish_Date() {
        return Work_Finish_Date;
    }

    /**
     * @param Work_Finish_Date the Work_Finish_Date to set
     */
    public void setWork_Finish_Date(String Work_Finish_Date) {
        this.Work_Finish_Date = Work_Finish_Date;
    }

    /**
     * @return the Item_Can_Be_Repair
     */
    public boolean isItem_Can_Be_Repair() {
        return Item_Can_Be_Repair;
    }

    /**
     * @param Item_Can_Be_Repair the Item_Can_Be_Repair to set
     */
    public void setItem_Can_Be_Repair(boolean Item_Can_Be_Repair) {
        this.Item_Can_Be_Repair = Item_Can_Be_Repair;
    }
}

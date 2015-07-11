/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Amila
 */
public class JobCurrentState {
    private int Current_State_Code;
    private String Current_State_Description;
    private String State_Add_Date;
    private String Job_Code;

    public JobCurrentState() {
    }

    public JobCurrentState(int Current_State_Code, String Current_State_Description, String State_Add_Date, String Job_Code) {
        this.Current_State_Code = Current_State_Code;
        this.Current_State_Description = Current_State_Description;
        this.State_Add_Date = State_Add_Date;
        this.Job_Code = Job_Code;
    }

    /**
     * @return the Current_State_Code
     */
    public int getCurrent_State_Code() {
        return Current_State_Code;
    }

    /**
     * @return the Current_State_Description
     */
    public String getCurrent_State_Description() {
        return Current_State_Description;
    }

    /**
     * @return the State_Add_Date
     */
    public String getState_Add_Date() {
        return State_Add_Date;
    }

    /**
     * @return the Job_Code
     */
    public String getJob_Code() {
        return Job_Code;
    }

    /**
     * @param Current_State_Code the Current_State_Code to set
     */
    public void setCurrent_State_Code(int Current_State_Code) {
        this.Current_State_Code = Current_State_Code;
    }

    /**
     * @param Current_State_Description the Current_State_Description to set
     */
    public void setCurrent_State_Description(String Current_State_Description) {
        this.Current_State_Description = Current_State_Description;
    }

    /**
     * @param State_Add_Date the State_Add_Date to set
     */
    public void setState_Add_Date(String State_Add_Date) {
        this.State_Add_Date = State_Add_Date;
    }

    /**
     * @param Job_Code the Job_Code to set
     */
    public void setJob_Code(String Job_Code) {
        this.Job_Code = Job_Code;
    }
    
    
}

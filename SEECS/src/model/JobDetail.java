/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 *
 * @author Amila Karunathilaka
 */
public class JobDetail {
    private String job_Code;
    private String Job_Deficiency;
    private double Labour_Cost;
    private double Transport_Charges;
    private double Job_Expenses_Charges;
    private double Other_Expenses_Charges;
    private String Start_Date;
    private String Finish_Date;
    private int Work_Man_Hours;
    private String Item_Code;
    private String Supervisor_ID;

    public JobDetail() {
    }

    public JobDetail(String job_Code, String Job_Deficiency, double Labour_Cost, double Transport_Charges, double Job_Expenses_Charges, double Other_Expenses_Charges, String Start_Date, String Finish_Date, int Work_Man_Hours, String Item_Code, String Supervisor_ID) {
        this.job_Code = job_Code;
        this.Job_Deficiency = Job_Deficiency;
        this.Labour_Cost = Labour_Cost;
        this.Transport_Charges = Transport_Charges;
        this.Job_Expenses_Charges = Job_Expenses_Charges;
        this.Other_Expenses_Charges = Other_Expenses_Charges;
        this.Start_Date = Start_Date;
        this.Finish_Date = Finish_Date;
        this.Work_Man_Hours = Work_Man_Hours;
        this.Item_Code = Item_Code;
        this.Supervisor_ID = Supervisor_ID;
    }
    
   

    /**
     * @return the job_Code
     */
    public String getJob_Code() {
        return job_Code;
    }

    /**
     * @return the Start_Date
     */
    public String getStart_Date() {
        return Start_Date;
    }

    /**
     * @return the Finish_Date
     */
    public String getFinish_Date() {
        return Finish_Date;
    }

    /**
     * @return the Item_Code
     */
    public String getItem_Code() {
        return Item_Code;
    }

    /**
     * @param job_Code the job_Code to set
     */
    public void setJob_Code(String job_Code) {
        this.job_Code = job_Code;
    }

    /**
     * @param Start_Date the Start_Date to set
     */
    public void setStart_Date(String Start_Date) {
        this.Start_Date = Start_Date;
    }

    /**
     * @param Finish_Date the Finish_Date to set
     */
    public void setFinish_Date(String Finish_Date) {
        this.Finish_Date = Finish_Date;
    }

    /**
     * @param Item_Code the Item_Code to set
     */
    public void setItem_Code(String Item_Code) {
        this.Item_Code = Item_Code;
    }

    /**
     * @return the Job_Deficiency
     */
    public String getJob_Deficiency() {
        return Job_Deficiency;
    }

    /**
     * @param Job_Deficiency the Job_Deficiency to set
     */
    public void setJob_Deficiency(String Job_Deficiency) {
        this.Job_Deficiency = Job_Deficiency;
    }

    /**
     * @return the Labour_Cost
     */
    public double getLabour_Cost() {
        return Labour_Cost;
    }

    /**
     * @return the Transport_Charges
     */
    public double getTransport_Charges() {
        return Transport_Charges;
    }

    /**
     * @return the Job_Expenses_Charges
     */
    public double getJob_Expenses_Charges() {
        return Job_Expenses_Charges;
    }

    /**
     * @return the Other_Expenses_Charges
     */
    public double getOther_Expenses_Charges() {
        return Other_Expenses_Charges;
    }

    /**
     * @param Work_Man_Hours_Charges the Labour_Cost to set
     */
    public void setLabour_Cost(double Labour_Cost) {
        this.Labour_Cost = Labour_Cost;
    }

    /**
     * @param Transport_Charges the Transport_Charges to set
     */
    public void setTransport_Charges(double Transport_Charges) {
        this.Transport_Charges = Transport_Charges;
    }

    /**
     * @param Job_Expenses_Charges the Job_Expenses_Charges to set
     */
    public void setJob_Expenses_Charges(double Job_Expenses_Charges) {
        this.Job_Expenses_Charges = Job_Expenses_Charges;
    }

    /**
     * @param Other_Expenses_Charges the Other_Expenses_Charges to set
     */
    public void setOther_Expenses_Charges(double Other_Expenses_Charges) {
        this.Other_Expenses_Charges = Other_Expenses_Charges;
    }

    /**
     * @return the Work_Man_Hours
     */
    public int getWork_Man_Hours() {
        return Work_Man_Hours;
    }

    /**
     * @param Work_Man_Hours the Work_Man_Hours to set
     */
    public void setWork_Man_Hours(int Work_Man_Hours) {
        this.Work_Man_Hours = Work_Man_Hours;
    }

    public boolean equals(Object ob){
        JobDetail jobDetail=(JobDetail) ob;
        if(getJob_Code().equals(jobDetail.getJob_Code())){
            return true;
        }else{
            return false;
        }
    }

    /**
     * @return the Supervisor_ID
     */
    public String getSupervisor_ID() {
        return Supervisor_ID;
    }

    /**
     * @param Supervisor_ID the Supervisor_ID to set
     */
    public void setSupervisor_ID(String Supervisor_ID) {
        this.Supervisor_ID = Supervisor_ID;
    }

}

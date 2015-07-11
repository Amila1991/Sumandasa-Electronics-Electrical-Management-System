/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Amila
 */
public class EmployeeDetail {
    private String Employee_ID;
    private String Job_Code;

    public EmployeeDetail() {
    }

    public EmployeeDetail(String Employee_ID, String Job_Code) {
        this.Employee_ID = Employee_ID;
        this.Job_Code = Job_Code;
    }

    /**
     * @return the Employee_ID
     */
    public String getEmployee_ID() {
        return Employee_ID;
    }

    /**
     * @return the Job_Code
     */
    public String getJob_Code() {
        return Job_Code;
    }

    /**
     * @param Employee_ID the Employee_ID to set
     */
    public void setEmployee_ID(String Employee_ID) {
        this.Employee_ID = Employee_ID;
    }

    /**
     * @param Job_Code the Job_Code to set
     */
    public void setJob_Code(String Job_Code) {
        this.Job_Code = Job_Code;
    }
    
    
}

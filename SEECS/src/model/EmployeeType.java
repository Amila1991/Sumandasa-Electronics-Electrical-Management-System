/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Amila
 */
public class EmployeeType {
    private String Employee_Type_ID;
    private String Employee_Type_Name;
    private String Employee_Type_Description;

    public EmployeeType() {
    }

    public EmployeeType(String Employee_Type_ID, String Employee_Type_Name, String Employee_Type_Description) {
        this.Employee_Type_ID = Employee_Type_ID;
        this.Employee_Type_Name = Employee_Type_Name;
        this.Employee_Type_Description = Employee_Type_Description;
    }

    /**
     * @return the Employee_Type_ID
     */
    public String getEmployee_Type_ID() {
        return Employee_Type_ID;
    }

    /**
     * @return the Employee_Type_Name
     */
    public String getEmployee_Type_Name() {
        return Employee_Type_Name;
    }

    /**
     * @return the Employee_Type_Description
     */
    public String getEmployee_Type_Description() {
        return Employee_Type_Description;
    }

    /**
     * @param Employee_Type_ID the Employee_Type_ID to set
     */
    public void setEmployee_Type_ID(String Employee_Type_ID) {
        this.Employee_Type_ID = Employee_Type_ID;
    }

    /**
     * @param Employee_Type_Name the Employee_Type_Name to set
     */
    public void setEmployee_Type_Name(String Employee_Type_Name) {
        this.Employee_Type_Name = Employee_Type_Name;
    }

    /**
     * @param Employee_Type_Description the Employee_Type_Description to set
     */
    public void setEmployee_Type_Description(String Employee_Type_Description) {
        this.Employee_Type_Description = Employee_Type_Description;
    }
    
    
}

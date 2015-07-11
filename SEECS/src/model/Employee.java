/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


    

    /**
 *
 * @author Amila
 */
public class Employee {
    private String Employee_ID;
    private String Employee_Name ;
    private String Employee_Address;
    private String Employee_Contact;
    private String Employee_NIC;
    private String Employee_Type_ID;

    public Employee() {
    }

    public Employee(String Employee_ID, String Employee_Name, String Employee_Address, String Employee_Contact, String Employee_NIC, String Employee_Type_ID) {
        this.Employee_ID = Employee_ID;
        this.Employee_Name = Employee_Name;
        this.Employee_Address = Employee_Address;
        this.Employee_Contact = Employee_Contact;
        this.Employee_NIC = Employee_NIC;
        this.Employee_Type_ID = Employee_Type_ID;
    }

 
    
/**
     * @return the Employee_ID
     */
    public String getEmployee_ID() {
        return Employee_ID;
    }

    /**
     * @return the Employee_Name
     */
    public String getEmployee_Name() {
        return Employee_Name;
    }

    /**
     * @return the Employee_Address
     */
    public String getEmployee_Address() {
        return Employee_Address;
    }

    /**
     * @return the Employee_Contact
     */
    public String getEmployee_Contact() {
        return Employee_Contact;
    }

    /**
     * @return the Employee_NIC
     */
    public String getEmployee_NIC() {
        return Employee_NIC;
    }

    /**
     * @return the Employee_Type_ID
     */
    public String getEmployee_Type_ID() {
        return Employee_Type_ID;
    }

    /**
     * @param Employee_ID the Employee_ID to set
     */
    public void setEmployee_ID(String Employee_ID) {
        this.Employee_ID = Employee_ID;
    }

    /**
     * @param Employee_Name the Employee_Name to set
     */
    public void setEmployee_Name(String Employee_Name) {
        this.Employee_Name = Employee_Name;
    }

    /**
     * @param Employee_Address the Employee_Address to set
     */
    public void setEmployee_Address(String Employee_Address) {
        this.Employee_Address = Employee_Address;
    }

    /**
     * @param Employee_Contact the Employee_Contact to set
     */
    public void setEmployee_Contact(String Employee_Contact) {
        this.Employee_Contact = Employee_Contact;
    }

    /**
     * @param Employee_NIC the Employee_NIC to set
     */
    public void setEmployee_NIC(String Employee_NIC) {
        this.Employee_NIC = Employee_NIC;
    }

    /**
     * @param Employee_Type_ID the Employee_Type_ID to set
     */
    public void setEmployee_Type_ID(String Employee_Type_ID) {
        this.Employee_Type_ID = Employee_Type_ID;
    }

    
    
    
}

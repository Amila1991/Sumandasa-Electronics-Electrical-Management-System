/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Amila
 */
public class SystemUser {
    private String Employee_ID;
    private String User_Name;
    private String Password;

    public SystemUser() {
    }

    public SystemUser(String Employee_ID, String User_Name, String Password) {
        this.Employee_ID = Employee_ID;
        this.User_Name = User_Name;
        this.Password = Password;
    }

    /**
     * @return the Employee_ID
     */
    public String getEmployee_ID() {
        return Employee_ID;
    }

    /**
     * @return the User_Name
     */
    public String getUser_Name() {
        return User_Name;
    }

    /**
     * @return the Password
     */
    public String getPassword() {
        return Password;
    }

    /**
     * @param Employee_ID the Employee_ID to set
     */
    public void setEmployee_ID(String Employee_ID) {
        this.Employee_ID = Employee_ID;
    }

    /**
     * @param User_Name the User_Name to set
     */
    public void setUser_Name(String User_Name) {
        this.User_Name = User_Name;
    }

    /**
     * @param Password the Password to set
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }
    
    
}

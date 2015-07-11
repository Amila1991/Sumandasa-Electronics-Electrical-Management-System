/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Amila
 */
public class Vendor {

    private String Vendor_ID;
    private String Vendor_Name;
    private String Vendor_Address;
    private String Contact_No1;
    private String Contact_No2;
    private String Contact_No3;
    private String FAX_No;
    private String Email;

    public Vendor() {
    }

    public Vendor(String Vendor_ID, String Vendor_Name, String Vendor_Address, String Contact_No1, String Contact_No2, String Contact_No3, String FAX_No, String Email) {
        this.Vendor_ID = Vendor_ID;
        this.Vendor_Name = Vendor_Name;
        this.Vendor_Address = Vendor_Address;
        this.Contact_No1 = Contact_No1;
        this.Contact_No2 = Contact_No2;
        this.Contact_No3 = Contact_No3;
        this.FAX_No = FAX_No;
        this.Email = Email;
    }

    public String getContact_No1() {
        return Contact_No1;
    }

    public void setContact_No1(String Contact_No1) {
        this.Contact_No1 = Contact_No1;
    }

    public String getContact_No2() {
        return Contact_No2;
    }

    public void setContact_No2(String Contact_No2) {
        this.Contact_No2 = Contact_No2;
    }

    public String getContact_No3() {
        return Contact_No3;
    }

    public void setContact_No3(String Contact_No3) {
        this.Contact_No3 = Contact_No3;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getFAX_No() {
        return FAX_No;
    }

    public void setFAX_No(String FAX_No) {
        this.FAX_No = FAX_No;
    }

    public String getVendor_Address() {
        return Vendor_Address;
    }

    public void setVendor_Address(String Vendor_Address) {
        this.Vendor_Address = Vendor_Address;
    }

    public String getVendor_ID() {
        return Vendor_ID;
    }

    public void setVendor_ID(String Vendor_ID) {
        this.Vendor_ID = Vendor_ID;
    }

    public String getVendor_Name() {
        return Vendor_Name;
    }

    public void setVendor_Name(String Vendor_Name) {
        this.Vendor_Name = Vendor_Name;
    }
    
    
}

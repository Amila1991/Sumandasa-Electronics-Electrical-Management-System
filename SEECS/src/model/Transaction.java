/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Amila
 */
public class Transaction {
    private String Transaction_ID;
    private String Transaction_Date;
    private int Transaction_Type;

    public Transaction() {
    }

    public Transaction(String Transaction_ID, String Transaction_Date, int Transaction_Type) {
        this.Transaction_ID = Transaction_ID;
        this.Transaction_Date = Transaction_Date;
        this.Transaction_Type = Transaction_Type;
    }

    public String getTransaction_Date() {
        return Transaction_Date;
    }

    public void setTransaction_Date(String Transaction_Date) {
        this.Transaction_Date = Transaction_Date;
    }

    public String getTransaction_ID() {
        return Transaction_ID;
    }

    public void setTransaction_ID(String Transaction_ID) {
        this.Transaction_ID = Transaction_ID;
    }

    public int getTransaction_Type() {
        return Transaction_Type;
    }

    public void setTransaction_Type(int Transaction_Type) {
        this.Transaction_Type = Transaction_Type;
    }
    
    
}

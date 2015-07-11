/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Amila
 */
public class GRNDetail {

    private String GRN_ID;
    private String Model_No;
    private double Receive_price;
    private int GRN_Qty;

    public GRNDetail() {
    }

    public GRNDetail(String GRN_ID, String Model_No, double Receive_price, int GRN_Qty) {
        this.GRN_ID = GRN_ID;
        this.Model_No = Model_No;
        this.Receive_price = Receive_price;
        this.GRN_Qty = GRN_Qty;
    }

    public String getGRN_ID() {
        return GRN_ID;
    }

    public void setGRN_ID(String GRN_ID) {
        this.GRN_ID = GRN_ID;
    }

    public int getGRN_Qty() {
        return GRN_Qty;
    }

    public void setGRN_Qty(int GRN_Qty) {
        this.GRN_Qty = GRN_Qty;
    }

    public String getModel_No() {
        return Model_No;
    }

    public void setModel_No(String Model_No) {
        this.Model_No = Model_No;
    }

    public double getReceive_price() {
        return Receive_price;
    }

    public void setReceive_price(double Receive_price) {
        this.Receive_price = Receive_price;
    }
    
    
}

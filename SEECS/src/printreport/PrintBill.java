/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package printreport;

/**
 *
 * @author Amila
 */
public class PrintBill {
    private String serialno;
    private String modelno;
    private String description;    
    private int qty;
    private double unitprice;
    private double amount;
    private String warranty;

    public PrintBill() {
    }

    public PrintBill(String serialno, String modelno, String description, int qty, double unitprice, double amount, String warranty) {
        this.serialno = serialno;
        this.modelno = modelno;
        this.description = description;
        this.qty = qty;
        this.unitprice = unitprice;
        this.amount = amount;
        this.warranty = warranty;
    }

    /**
     * @return the serialno
     */
    public String getSerialno() {
        return serialno;
    }

    /**
     * @param serialno the serialno to set
     */
    public void setSerialno(String serialno) {
        this.serialno = serialno;
    }

    /**
     * @return the modelno
     */
    public String getModelno() {
        return modelno;
    }

    /**
     * @param modelno the modelno to set
     */
    public void setModelno(String modelno) {
        this.modelno = modelno;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the qty
     */
    public int getQty() {
        return qty;
    }

    /**
     * @param qty the qty to set
     */
    public void setQty(int qty) {
        this.qty = qty;
    }

    /**
     * @return the unitprice
     */
    public double getUnitprice() {
        return unitprice;
    }

    /**
     * @param unitprice the unitprice to set
     */
    public void setUnitprice(double unitprice) {
        this.unitprice = unitprice;
    }

    /**
     * @return the amount
     */
    public double getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     * @return the warranty
     */
    public String getWarranty() {
        return warranty;
    }

    /**
     * @param warranty the warranty to set
     */
    public void setWarranty(String warranty) {
        this.warranty = warranty;
    }
    
    
}

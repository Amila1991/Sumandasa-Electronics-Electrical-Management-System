/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package printreport;

/**
 *
 * @author Amila
 */
public class PrintBillString {
    private String serialno;
    private String modelno;
    private String description;    
    private String qty;
    private String unitprice;
    private String amount;
    private String warranty;

    public PrintBillString() {
    }

    public PrintBillString(String serialno, String modelno, String description, String qty, String unitprice, String amount, String warranty) {
        this.serialno = serialno;
        this.modelno = modelno;
        this.description = description;
        this.qty = qty;
        this.unitprice = unitprice;
        this.amount = amount;
        this.warranty = warranty;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getModelno() {
        return modelno;
    }

    public void setModelno(String modelno) {
        this.modelno = modelno;
    }

    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }

    public String getSerialno() {
        return serialno;
    }

    public void setSerialno(String serialno) {
        this.serialno = serialno;
    }

    public String getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(String unitprice) {
        this.unitprice = unitprice;
    }

    public String getWarranty() {
        return warranty;
    }

    public void setWarranty(String warranty) {
        this.warranty = warranty;
    }
    
    
}

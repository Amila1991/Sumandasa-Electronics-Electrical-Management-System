/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package printreport;

/**
 *
 * @author Amila
 */
public class IncomeReport {
    
    private String modelno;
    private String description;
    private int startqty;
    private int soldqty;
    private int balanceqty;
    private double purchaseunitprice;
    private double issueunitprice;
    private double staramount;
    private double soldamount;
    private double balanceamount;

    public IncomeReport() {
    }

    public IncomeReport(String modelno, String description, int startqty, int soldqty, int balanceqty, double purchaseunitprice, double issueunitprice, double staramount, double soldamount, double balanceamount) {
        this.modelno = modelno;
        this.description = description;
        this.startqty = startqty;
        this.soldqty = soldqty;
        this.balanceqty = balanceqty;
        this.purchaseunitprice = purchaseunitprice;
        this.issueunitprice = issueunitprice;
        this.staramount = staramount;
        this.soldamount = soldamount;
        this.balanceamount = balanceamount;
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
     * @return the startqty
     */
    public int getStartqty() {
        return startqty;
    }

    /**
     * @param startqty the startqty to set
     */
    public void setStartqty(int startqty) {
        this.startqty = startqty;
    }

    /**
     * @return the soldqty
     */
    public int getSoldqty() {
        return soldqty;
    }

    /**
     * @param soldqty the soldqty to set
     */
    public void setSoldqty(int soldqty) {
        this.soldqty = soldqty;
    }

    /**
     * @return the balanceqty
     */
    public int getBalanceqty() {
        return balanceqty;
    }

    /**
     * @param balanceqty the balanceqty to set
     */
    public void setBalanceqty(int balanceqty) {
        this.balanceqty = balanceqty;
    }

    /**
     * @return the purchaseunitprice
     */
    public double getPurchaseunitprice() {
        return purchaseunitprice;
    }

    /**
     * @param purchaseunitprice the purchaseunitprice to set
     */
    public void setPurchaseunitprice(double purchaseunitprice) {
        this.purchaseunitprice = purchaseunitprice;
    }

    /**
     * @return the issueunitprice
     */
    public double getIssueunitprice() {
        return issueunitprice;
    }

    /**
     * @param issueunitprice the issueunitprice to set
     */
    public void setIssueunitprice(double issueunitprice) {
        this.issueunitprice = issueunitprice;
    }

    /**
     * @return the staramount
     */
    public double getStaramount() {
        return staramount;
    }

    /**
     * @param staramount the staramount to set
     */
    public void setStaramount(double staramount) {
        this.staramount = staramount;
    }

    /**
     * @return the soldamount
     */
    public double getSoldamount() {
        return soldamount;
    }

    /**
     * @param soldamount the soldamount to set
     */
    public void setSoldamount(double soldamount) {
        this.soldamount = soldamount;
    }

    /**
     * @return the balanceamount
     */
    public double getBalanceamount() {
        return balanceamount;
    }

    /**
     * @param balanceamount the balanceamount to set
     */
    public void setBalanceamount(double balanceamount) {
        this.balanceamount = balanceamount;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final IncomeReport other = (IncomeReport) obj;
        if ((this.modelno == null) ? (other.modelno != null) : !this.modelno.equals(other.modelno)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + (this.modelno != null ? this.modelno.hashCode() : 0);
        return hash;
    }

    
}

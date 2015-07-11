/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Amila
 */
public enum TransactionType {

    GOODISSUE(1), GOODRECEIVE(2), GOODISSUECANCEL(3), INSTALLMENTPAY(4);
    int code;

    private TransactionType(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}

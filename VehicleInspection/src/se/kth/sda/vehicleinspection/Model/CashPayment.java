/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.sda.vehicleinspection.Model;

import se.kth.sda.vehicleinspection.Model.Amount;

/**
 *
 * @author tmpuser-10212
 */


/**
 *
 * @author tmpuser-10227
 */
public class CashPayment implements Payment {

    /**
     *
     */
    public Float amount;

    /**
     *
     */
    public Float paidAmount;

    /**
     *
     * @param amount
     * @param paidAmount
     */
    public CashPayment(Float amount, Float paidAmount) {
        System.out.println("Cash payment started");
        this.amount = amount;
        this.paidAmount = paidAmount;
       // calculateChange();
    }

    /**
     *
     * @return
     */
    public float calculateChange() {
        float changeAmt;
        changeAmt = paidAmount - amount;
        System.out.println("You paid: " + paidAmount);
        System.out.println("Total inspection cost: " + amount);
        System.out.println("Change: " + changeAmt);
        return changeAmt;
    }

    /**
     *
     * @return
     */
    @Override
    public boolean performTransaction() {
        System.out.println("Doing Cash Transaction");
        System.out.println("Cash Transaction approved");
        return true;
    }

    /**
     *
     * @return
     */
    @Override
    public String getPaymentMessage() {
        return "Thanks for paying by cash: " + amount;
    }
}
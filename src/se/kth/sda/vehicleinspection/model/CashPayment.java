/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
package se.kth.sda.vehicleinspection.model;
/**
 *
 * @author tmpuser-10227
 */
public class CashPayment implements Payment {

    public Float amount;
    public Float paidAmount;

    public CashPayment(Float amount, Float paidAmount) {
        System.out.println("Cash payment started");
        this.amount = amount;
        this.paidAmount = paidAmount;
        calculateChange();
    }

    public float calculateChange() {
        float changeAmt;
        changeAmt = paidAmount - amount;
        System.out.println("You paid: " + paidAmount);
        System.out.println("Total inspection cost: " + amount);
        System.out.println("Change: " + changeAmt);
        return changeAmt;
    }

    @Override
    public boolean performTransaction() {
        System.out.println("Doing Cash Transaction");
        System.out.println("Cash Transaction approved");
        return true;
    }

    @Override
    public String getPaymentMessage() {
        return "Thanks for paying by cash: " + amount;
    }
}

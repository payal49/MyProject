/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.sda.vehicleinspection.Model;
import DTO.CreditCardDTO;
import DTO.*;
import se.kth.sda.vehicleinspection.Integration.*;

/**
 *
 * @author tmpuser-10212
 */


import DTO.*;
import se.kth.sda.vehicleinspection.Integration.*;

/**
 *
 * @author tmpuser-10227
 */
public class CreditCardPayment implements Payment {

    private CreditCardDTO creditCard;
    private Float cost;

    /**
     *
     * @param creditDTO
     * @param cost
     */
    public CreditCardPayment(CreditCardDTO creditDTO, Float cost) {
        creditCard = creditDTO;
        this.cost = cost;
    }

    /**
     *
     * @return
     */
    @Override
    public boolean performTransaction() {
        System.out.println("Credit Payment initiated");
        CreditCardAuthorization creditCardAuthorization = new CreditCardAuthorization();
        creditCardAuthorization.getCreditCardAuthorization(creditCard);
        return true;
    }

    /**
     *
     * @return
     */
    @Override
    public String getPaymentMessage() {
        return "Thanks for your credit card payment of: " + cost;
    }
}
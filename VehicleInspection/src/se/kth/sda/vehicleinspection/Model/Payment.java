/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.sda.vehicleinspection.Model;

import DTO.CreditCardDTO;


/**
 *
 * @author tmpuser-10212
 */

public interface Payment {

    /**
     *
     * @return
     */
    public boolean performTransaction();

    /**
     *
     * @return
     */
    public String getPaymentMessage();
}
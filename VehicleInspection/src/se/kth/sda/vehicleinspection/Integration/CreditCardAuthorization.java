/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.sda.vehicleinspection.Integration;

import DTO.CreditCardDTO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author tmpuser-10212
 */


import DTO.CreditCardDTO;

/**
 *
 * @author tmpuser-10227
 */
public class CreditCardAuthorization {

    /**
     *
     */
    public CreditCardAuthorization() {

    }

    /**
     *
     * @param creditCardDTO
     * @return
     */
    public boolean getCreditCardAuthorization(CreditCardDTO creditCardDTO) {
        System.out.println("Credit card authorized. Payment approved");
        return true;
    }

}
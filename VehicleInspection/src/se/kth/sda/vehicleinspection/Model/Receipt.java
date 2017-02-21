/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.sda.vehicleinspection.Model;

/**
 *
 * @author tmpuser-10211
 */


/**
 *
 * @author tmpuser-10227
 */
public class Receipt {
    
    /**
     *
     */
    public Receipt(){
        System.out.println(setStandardMessage());
    }

    /**
     *
     * @return
     */
    public String setStandardMessage() {
        StringBuilder str = new StringBuilder();
        str.append("\n");
        str.append("*******KTH Garage*******");
        str.append("\n");
        str.append("Brinellvägen 8, 114 28 Stockholm");
        str.append("\n");
        str.append("***************************");
        str.append("\n");
        return str.toString();
    }

}
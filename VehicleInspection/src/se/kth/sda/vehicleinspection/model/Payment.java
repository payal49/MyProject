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
public interface Payment {

    public boolean performTransaction();

    public String getPaymentMessage();
}

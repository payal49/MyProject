/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.sda.vehicleinspection.Integration;

/**
 *
 * @author tmpuser-10227
 */


/**
 *
 * @author tmpuser-10227
 */
public class Queue {

    private int number;

    /**
     *
     */
    public Queue() {
        number = 0;
    }

    /**
     *
     * @return
     */
    public int incrementQueueNumber() {
        number++;
        return number;
    }
}
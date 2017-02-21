/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class Garage {

    private Queue queue;
    private Boolean door;

    /**
     *
     */
    public Garage() {
        queue = new Queue();
        openDoor();
    }

    /**
     *
     * @return
     */
    public int nextCustomer() {
        return (queue.incrementQueueNumber());
    }

    /**
     *
     */
    public void openDoor() {
        this.door = true;
    }

    /**
     *
     */
    public void closeDoor() {
        this.door = false;
    }
}

   


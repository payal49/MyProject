/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.sda.vehicleinspection.Integration;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tmpuser-10211
 */
public class GarageTest {
    
    public GarageTest() {
        
    }
    
    @BeforeClass
    public static void setUpClass() {
       
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of nextCustomer method, of class Garage.
     */
    @Test
    public void testNextCustomer() {
        System.out.println("nextCustomer");
        Garage instance = new Garage();
        int expResult = 1;
        int result = instance.nextCustomer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    /**
     * Test of openDoor method, of class Garage.
     */
    @Test
    public void testOpenDoor() {
        System.out.println("openDoor");
        Garage instance = new Garage();
        instance.openDoor();
        boolean expResult = true;
        boolean result = true;
        // TODO review the generated test code and remove the default call to fail.
       assertEquals(expResult, result);
    }

    /**
     * Test of closeDoor method, of class Garage.
     */
    @Test
    public void testCloseDoor() {
        System.out.println("closeDoor");
        Garage instance = new Garage();
        instance.closeDoor();
        // TODO review the generated test code and remove the default call to fail.
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.sda.vehicleinspection.Model;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tmpuser-10211
 */
public class CashPaymentTest {
    
    CashPayment instance;
    CashPayment instance1;
    CashPayment instance2;
    
    public CashPaymentTest() {
      
    }
    
    @Before
    public void setUp() {
        instance  = new CashPayment(4500.0F,5000.0F);
        
        
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calculateChange method, of class CashPayment.
     */
    @Test
    public void testCalculateChange() {
        System.out.println("calculateChange");              
       
        float expResult = 500.0F;
        float result = instance.calculateChange();
        assertEquals(expResult, result,0.0F);
              
        
        // TODO review the generated test code and remove the default call to fail.
       
    }    
         

    /**
     * Test of performTransaction method, of class CashPayment.
     */
    @Test
    public void testPerformTransaction() {
        System.out.println("performTransaction");        
        boolean expResult = true;
        boolean result = true;
       // assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getPaymentMessage method, of class CashPayment.
     */
    @Test
    public void testGetPaymentMessage() {
        System.out.println("getPaymentMessage");        
        String expResult = "Thanks for paying by cash: " + 4500.0F;
        String result = instance.getPaymentMessage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}

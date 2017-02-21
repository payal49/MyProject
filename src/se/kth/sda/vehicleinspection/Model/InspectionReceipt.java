/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.sda.vehicleinspection.Model;

import DTO.CustomerDTO;
import se.kth.sda.vehicleinspection.Model.InspectionResult;

/**
 *
 * @author tmpuser-10227
 */
public class InspectionReceipt extends Receipt {

    private InspectionResult result;
    private CustomerDTO customer;

    /**
     *
     * @param inspectionResult
     * @param customer
     */
    public InspectionReceipt(InspectionResult inspectionResult, CustomerDTO customer) {
        this.customer = customer;
        this.result = inspectionResult;
    }

    /**
     *
     */
    public void generateReceipt() {
        System.out.println("=================\nInspection Receipt\n");
        System.out.println("Customer Name: " + customer.getName());
        result.printInspectionResult();
        System.out.println("\n=================");
    }

}

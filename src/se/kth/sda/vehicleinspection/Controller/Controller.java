/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.sda.vehicleinspection.Controller;



/**
 *
 * @author tmpuser-10211
 */


import se.kth.sda.vehicleinspection.Integration.Garage;
import DTO.CustomerDTO;
import DTO.InspectionDTO;
import DTO.InspectionParts;
import DTO.VehicleDTO;
import se.kth.sda.vehicleinspection.Integration.*;
import se.kth.sda.vehicleinspection.Model.*;
import se.kth.sda.vehicleinspection.Integration.VehicleRegistry;
import se.kth.sda.vehicleinspection.Model.InspectionResult;
import se.kth.sda.vehicleinspection.Model.Payment;
import se.kth.sda.vehicleinspection.Model.PaymentReceipt;
import se.kth.sda.vehicleinspection.Model.RecommendedInspection;
import se.kth.sda.vehicleinspection.Model.VehicleInspection;

/**
 *
 * @author tmpuser-10227
 */
public class Controller {

    private Garage garage;
    
    /**
     *
     */
    public Controller() {
        garage = new Garage();
        System.out.println("Open garage door");
    }

    /**
     *
     * @return
     */
    public Garage moveVehicleToGarage() {
        int id = garage.nextCustomer();
        System.out.println("Now serving customer " + id);
        garage.closeDoor();
        System.out.println("Customer inside the garage. Door closes.");
        return garage;
    }

    /**
     *
     * @param vehicleDTO
     * @param customerDTO
     */
    public void ensureVehicleExistsInRegistry(VehicleDTO vehicleDTO,
            CustomerDTO customerDTO) {
        VehicleRegistry.ensureVehicleExistsInRegistry(vehicleDTO, customerDTO);
    }

    /**
     *
     * @param vehicleDTO
     * @return
     */
    public RecommendedInspection getRecommendedInspection(VehicleDTO vehicleDTO) {
        RecommendedInspection r = RecommendedInspection.getRecommendedInspections(vehicleDTO);
        r.print();
        return r;
    }

    /**
     *
     * @param recommendedInspection
     * @return
     */
    public Float computeInspectionCost(RecommendedInspection recommendedInspection) {
        InspectionDTO inspection = new InspectionDTO();
        Float totalCost = 0f;
        for (InspectionParts part : recommendedInspection.getRecommendedInspectionParts()) {
            totalCost += inspection.getInspectionCost(part);
        }
        System.out.println("Total inspection cost: " + totalCost);
        return totalCost;
    }

    /**
     *
     * @param p
     */
    public void pay(Payment p) {
        p.performTransaction();
    }

    /**
     *
     * @param p
     * @param vehicleDTO
     * @param customerDTO
     */
    public void printPaymentReceipt(Payment p, VehicleDTO vehicleDTO, CustomerDTO customerDTO) {
        System.out.println("Printing payment receipt");
        PaymentReceipt paymentReceipt = new PaymentReceipt(p, vehicleDTO, customerDTO);
        System.out.println(paymentReceipt.generatePaymentReceipt());
    }

    /**
     *
     * @param vehicleDTO
     * @param recommendedInspection
     * @return
     */
    public InspectionResult inspectVehicle(VehicleDTO vehicleDTO, RecommendedInspection recommendedInspection) {
        System.out.println("Performing Inspection");
        VehicleInspection vehicleInspection = new VehicleInspection(vehicleDTO, recommendedInspection);
        InspectionResult res = vehicleInspection.performInspection();
        return res;
    }
    
    /**
     *
     * @param result
     * @param customer
     */
    public void printInspectionReceipt(InspectionResult result, CustomerDTO customer){
        InspectionReceipt receipt = new InspectionReceipt(result, customer);
        receipt.generateReceipt();
    }

    /**
     *
     */
    public void moveVehicleOutOfGarage() {
        System.out.println("Inspection process completed. Garage door closed.");
        garage.openDoor();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.sda.vehicleinspection.StartUp;

import java.time.Month;
import java.time.YearMonth;
import DTO.AddressDTO;
import DTO.CreditCardDTO;
import DTO.CustomerDTO;
import DTO.VehicleDTO;
import se.kth.sda.vehicleinspection.Controller.Controller;
import se.kth.sda.vehicleinspection.Model.CashPayment;
import se.kth.sda.vehicleinspection.Model.CreditCardPayment;
import se.kth.sda.vehicleinspection.Model.InspectionResult;
import se.kth.sda.vehicleinspection.Model.Payment;
import se.kth.sda.vehicleinspection.Model.RecommendedInspection;

/**
 *
 * @author tmpuser-10227
 */
public class Main {

    /**
     *
     * @param args
     */
    public static void main(String args[]) {
        VehicleDTO vehicleDTO1 = new VehicleDTO("AOH 5324", "Car", "VOLVO", "SUV", "BLACK");
        VehicleDTO vehicleDTO2 = new VehicleDTO("CXB 2345", "Car", "SWIFT", "Compact", "RED");

        AddressDTO addressDTO = new AddressDTO("Vidangsvage", "Stockholm", "16735", "Stockhlm", "Sweden");

        CustomerDTO customerDTO = new CustomerDTO("CustPay 345LK", "Payal Gupta", addressDTO,
                "9873645344", "user@yahoo.com");

        CreditCardDTO creditCardDTO = new CreditCardDTO("123456789123", "Sam", YearMonth.of(2018, Month.FEBRUARY),
                "125", "1254");

        Controller controller = new Controller();
        controller.moveVehicleToGarage();  // TODO rename method
        controller.ensureVehicleExistsInRegistry(vehicleDTO1, customerDTO);
        RecommendedInspection recommendedInspection = controller.getRecommendedInspection(vehicleDTO1);
        Float cost = controller.computeInspectionCost(recommendedInspection);
        System.out.println("Pay by cash or credit card? You entered Cash");
        Payment c = new CashPayment(cost, cost + 100);
        controller.pay(c);
        controller.printPaymentReceipt(c, vehicleDTO2, customerDTO);
        InspectionResult result1 = controller.inspectVehicle(vehicleDTO1, recommendedInspection);
        controller.printInspectionReceipt(result1, customerDTO);

        controller.ensureVehicleExistsInRegistry(vehicleDTO1, customerDTO);
        RecommendedInspection recommendedInspection2 = controller.getRecommendedInspection(vehicleDTO1);
        controller.computeInspectionCost(recommendedInspection2);
        System.out.println("Pay by cash or credit card? You entered credit card");
        Payment cc = new CreditCardPayment(creditCardDTO, cost);
        controller.pay(cc);
        controller.printPaymentReceipt(cc, vehicleDTO2, customerDTO);
        InspectionResult result2 = controller.inspectVehicle(vehicleDTO1, recommendedInspection2);
        controller.printInspectionReceipt(result2, customerDTO);

        /*controller.ensureVehicleExistsInRegistry(vehicleDTO1, customerDTO);
        RecommendedInspection recommendedInspection3 = controller.getRecommendedInspection(vehicleDTO1);
        controller.computeInspectionCost(recommendedInspection3);
        controller.inspectVehicle(vehicleDTO1, recommendedInspection3);
        controller.moveVehicleOutOfGarage();
        controller.ensureVehicleExistsInRegistry(vehicleDTO1, customerDTO);
        RecommendedInspection recommendedInspection4 = controller.getRecommendedInspection(vehicleDTO1);
        controller.computeInspectionCost(recommendedInspection4);
        controller.inspectVehicle(vehicleDTO1, recommendedInspection4);
        controller.moveVehicleOutOfGarage();*/
    }
}
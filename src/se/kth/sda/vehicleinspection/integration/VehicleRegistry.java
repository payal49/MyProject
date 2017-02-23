/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.sda.vehicleinspection.integration;

import se.kth.sda.vehicleinspection.DTO.CustomerDTO;
import se.kth.sda.vehicleinspection.DTO.VehicleDTO;
import java.util.HashMap;
import java.util.Map.Entry;

/**
 *
 * @author tmpuser-10211
 */
public class VehicleRegistry {

    public static final HashMap<VehicleDTO, CustomerDTO> vehicleRegistry = new HashMap<>();

    public static void ensureVehicleExistsInRegistry(VehicleDTO vehicleDTO, CustomerDTO customerDTO) {
        System.out.println("Check if vehicle was serviced in the garage before" + "");
        if (!(VehicleRegistry.vehicleRegistry.containsKey(vehicleDTO))) {
            createNewVehicleEntry(vehicleDTO, customerDTO);
        }
    }

    public static void createNewVehicleEntry(VehicleDTO vehicleDTO, CustomerDTO customerDTO) {
        VehicleRegistry.vehicleRegistry.put(vehicleDTO, customerDTO);
        System.out.println("Vehicle regisrty created successfully");
        printVehicleRegistry();
    }

    public static void printVehicleRegistry() {
        for (Entry<VehicleDTO, CustomerDTO> entry : vehicleRegistry.entrySet()) {
            String key = entry.getKey().getNumber();
            String value = entry.getValue().getName();
            System.out.println("Vehicle Number: " + key + " Customer Name: " + value);
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.sda.vehicleinspection.integration;

import java.util.HashMap;
import java.util.Map.Entry;
import se.kth.sda.vehicleinspection.DTO.VehicleDTO;

/**
 *
 * @author tmpuser-10227
 */
public class VehicleInspectionHistory {

    private static HashMap<VehicleDTO, SingleVehicleInspectionForAllDatesResults> allVehiclesHistory = new HashMap<>();

    public static SingleVehicleInspectionForAllDatesResults checkIfInspectionHistoryExists(VehicleDTO vehicleDTO) {
        return allVehiclesHistory.get(vehicleDTO);
    }

    public static SingleVehicleInspectionForSingleDateResults getLatestInspectionResults(VehicleDTO vehicleDTO) {
        SingleVehicleInspectionForAllDatesResults r = checkIfInspectionHistoryExists(vehicleDTO);
        if (r != null) {
            return r.singleVehicleInspectionForAllDatesResults.get(
                    r.singleVehicleInspectionForAllDatesResults.size() - 1);
        } else {
            return new SingleVehicleInspectionForSingleDateResults();
        }
    }

    public static void commitNewInspectionResults(VehicleDTO vehicleDTO, SingleVehicleInspectionForAllDatesResults singleVehicleInspectionForAllDatesResults) {
        allVehiclesHistory.put(vehicleDTO, singleVehicleInspectionForAllDatesResults);
        printAllVehicleHistory();
    }

    public static void printAllVehicleHistory() {
        for (Entry<VehicleDTO, SingleVehicleInspectionForAllDatesResults> entry : allVehiclesHistory.entrySet()) {
            String vehicleNumber = entry.getKey().getNumber();
            System.out.println(vehicleNumber);
            entry.getValue().printSingleVehicleInspectionForAllDatesResults();
        }
    }
}

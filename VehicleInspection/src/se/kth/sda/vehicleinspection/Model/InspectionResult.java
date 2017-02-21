/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.sda.vehicleinspection.Model;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import DTO.InspectionParts;
import DTO.InspectionResults;
import DTO.VehicleDTO;
import se.kth.sda.vehicleinspection.Integration.SingleVehicleInspectionForSingleDateResults;

/**
 *
 * @author tmpuser-10211
 */
public class InspectionResult {

    private Map<InspectionParts, InspectionResults> inspectionResult = new HashMap<>();
    private VehicleDTO vehicleDTO;

    /**
     *
     * @param vehicle
     * @param inspectedResult
     */
    public InspectionResult(VehicleDTO vehicle, Map<InspectionParts, InspectionResults> inspectedResult) {
        this.vehicleDTO = vehicle;
        this.inspectionResult = inspectedResult;
    }

    /**
     *
     */
    public void printInspectionResult() {
        System.out.println("Inspection results of vehicle: " + vehicleDTO.getNumber());
        for (Entry<InspectionParts, InspectionResults> entry : inspectionResult.entrySet()) {
            System.out.println(entry.getKey() + "--" + entry.getValue());
        }
    }

    /**
     *
     * @return
     */
    public SingleVehicleInspectionForSingleDateResults addInspectionResultToVehicleHistory() {
        Date date = new Date();
        return new SingleVehicleInspectionForSingleDateResults(date, inspectionResult);
    }

}
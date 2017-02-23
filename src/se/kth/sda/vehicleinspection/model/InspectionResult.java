/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 package se.kth.sda.vehicleinspection.model;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import se.kth.sda.vehicleinspection.DTO.InspectionParts;
import se.kth.sda.vehicleinspection.DTO.InspectionResults;
import se.kth.sda.vehicleinspection.DTO.VehicleDTO;
import se.kth.sda.vehicleinspection.integration.SingleVehicleInspectionForSingleDateResults;

public class InspectionResult {

    private Map<InspectionParts, InspectionResults> inspectionResult = new HashMap<>();
    private VehicleDTO vehicleDTO;

    public InspectionResult(VehicleDTO vehicle, Map<InspectionParts, InspectionResults> inspectedResult) {
        this.vehicleDTO = vehicle;
        this.inspectionResult = inspectedResult;
    }

    public void printInspectionResult() {
        System.out.println("Inspection results of vehicle: " + vehicleDTO.getNumber());
        for (Entry<InspectionParts, InspectionResults> entry : inspectionResult.entrySet()) {
            System.out.println(entry.getKey() + "--" + entry.getValue());
        }
    }
    
    public Map<InspectionParts, InspectionResults> getInspectionResult()
    {
        return inspectionResult;
    }
    public  void getInspectionPassFailCount() {        
              int passcount = 0;
              int failcount = 0;
        for (Map.Entry<InspectionParts, InspectionResults> entry : inspectionResult.entrySet()) {
            InspectionResults inspectionresult = entry.getValue();
            if(inspectionresult.equals(InspectionResults.PASS))
                passcount+=1;
            else if(inspectionresult.equals(InspectionResults.FAIL))
                failcount+=1;
        }
        System.out.println("Passed Inspection Result Count is " +passcount);
        System.out.println("Failed Inspection Result Count is " +failcount);

    }

    public SingleVehicleInspectionForSingleDateResults addInspectionResultToVehicleHistory() {
        Date date = new Date();
        return new SingleVehicleInspectionForSingleDateResults(date, inspectionResult);
    }

}
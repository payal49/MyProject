/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.sda.vehicleinspection.Model;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import DTO.InspectionParts;
import DTO.InspectionResults;
import DTO.VehicleDTO;
import se.kth.sda.vehicleinspection.Integration.SingleVehicleInspectionForAllDatesResults;
import se.kth.sda.vehicleinspection.Integration.SingleVehicleInspectionForSingleDateResults;
import se.kth.sda.vehicleinspection.Integration.VehicleInspectionHistory;

/**
 *
 * @author tmpuser-10227
 */
public class VehicleInspection {

    private RecommendedInspection actualInspection;
    VehicleDTO vehicle;
    Random r = new Random();

    /**
     *
     * @param vehicleDTO
     * @param recommendedInspections
     */
    public VehicleInspection(VehicleDTO vehicleDTO, RecommendedInspection recommendedInspections) {
        this.actualInspection = recommendedInspections;
        vehicle = vehicleDTO;
    }

    /**
     *
     * @return
     */
    public InspectionResult performInspection() {
        Map<InspectionParts, InspectionResults> inspectedParts = new HashMap<>();
        for (InspectionParts p : actualInspection.getRecommendedInspectionParts()) {
            if (r.nextInt(10) < 5) {
                inspectedParts.put(p, InspectionResults.PASS);
            } else {
                inspectedParts.put(p, InspectionResults.FAIL);
            }
        }
        InspectionResult finalResults = new InspectionResult(vehicle, inspectedParts);
        addInspectionResultToVehicleHistory(vehicle, finalResults);
        return finalResults;
    }

    /**
     *
     * @param vehicleDTO
     * @param inspectionResult
     */
    public void addInspectionResultToVehicleHistory(VehicleDTO vehicleDTO, InspectionResult inspectionResult) {
        SingleVehicleInspectionForSingleDateResults s = inspectionResult.addInspectionResultToVehicleHistory();
        SingleVehicleInspectionForAllDatesResults a = new SingleVehicleInspectionForAllDatesResults(s);
        VehicleInspectionHistory.commitNewInspectionResults(vehicleDTO, a);
    }
}
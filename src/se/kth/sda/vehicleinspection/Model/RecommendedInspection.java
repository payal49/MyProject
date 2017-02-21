/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.sda.vehicleinspection.Model;

import java.util.HashSet;
import java.util.Set;
import DTO.InspectionParts;
import DTO.VehicleDTO;
import se.kth.sda.vehicleinspection.Integration.VehicleInspectionHistory;

/**
 *
 * @author tmpuser-10227
 */
public class RecommendedInspection {

    private Set<InspectionParts> recommendedInspectionParts;

    /**
     *
     * @return
     */
    public Set<InspectionParts> getRecommendedInspectionParts() {
        return recommendedInspectionParts;
    }

    /**
     *
     * @param ip
     */
    public RecommendedInspection(Set<InspectionParts> ip) {
        recommendedInspectionParts = ip;
    }

    /**
     *
     * @param vehicleDTO
     * @return
     */
    public static RecommendedInspection getRecommendedInspections(VehicleDTO vehicleDTO) {
        Set<InspectionParts> prevFailures
                = VehicleInspectionHistory.getLatestInspectionResults(vehicleDTO).getFailedInspections();
        if (prevFailures.isEmpty()) {
            return createDefaultRecomendedInspections();
        }
        return new RecommendedInspection(prevFailures);
    }

    /**
     *
     * @return
     */
    public static RecommendedInspection createDefaultRecomendedInspections() {
        Set<InspectionParts> s = new HashSet<>();
        for (InspectionParts p : InspectionParts.values()) {
            s.add(p);
        }
        return new RecommendedInspection(s);
    }

    /**
     *
     */
    public void print() {
        System.out.println("Recommended inspections for your vehicle:");
        for (InspectionParts p : recommendedInspectionParts) {
            System.out.println(p);
        }
    }

}
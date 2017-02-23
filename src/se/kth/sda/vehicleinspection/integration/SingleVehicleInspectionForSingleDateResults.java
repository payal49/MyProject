/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.sda.vehicleinspection.integration;

import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import se.kth.sda.vehicleinspection.DTO.InspectionParts;
import se.kth.sda.vehicleinspection.DTO.InspectionResults;

/**
 *
 * @author Shubha
 */
public class SingleVehicleInspectionForSingleDateResults {

    // TODO fix private / public
    public Date date;
    public Map<InspectionParts, InspectionResults> partsAndResults;

    public SingleVehicleInspectionForSingleDateResults() {
        date = new Date();
        partsAndResults = new HashMap<>();
    }

    public SingleVehicleInspectionForSingleDateResults(Date date, Map<InspectionParts, InspectionResults> partsAndResults) {
        this.date = date;
        this.partsAndResults = partsAndResults;
    }

    public Set<InspectionParts> getFailedInspections() {
        Set<InspectionParts> ip = new HashSet<>();
        for (Entry<InspectionParts, InspectionResults> e : partsAndResults.entrySet()) {
            if (e.getValue() == InspectionResults.FAIL) {
                ip.add(e.getKey());
            }
        }
        return ip;
    }

    public void printSingleVehicleInspectionForSingleDateResults() {
        System.out.println("Date of inspection: " + date);
        for (Entry<InspectionParts, InspectionResults> entry : partsAndResults.entrySet()) {
            String inspectionPart = entry.getKey().toString();
            String inspectionResult = entry.getValue().toString();
            System.out.println("Inspected part: " + inspectionPart + " Result of inspection: " + inspectionResult);
        }
    }
}

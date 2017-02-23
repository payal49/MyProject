/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.sda.vehicleinspection.DTO;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author tmpuser-10227
 */
public class DefaultInspectionChecklist {

    private Map<InspectionParts, InspectionResults> inspectionPart = new HashMap<>();

    public DefaultInspectionChecklist() {
        for (InspectionParts p : InspectionParts.values()) {
            inspectionPart.put(p, InspectionResults.NA);
        }
    }

    public InspectionResults getInspectionResult(InspectionParts part) {
        return inspectionPart.get(part);
    }

}

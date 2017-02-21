/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;


/**
 *
 * @author tmpuser-10227
 */


import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author tmpuser-10227
 */
public class InspectionDTO {

    private Map<InspectionParts, Float> inspectionPartPrices = new HashMap<>();

    /**
     *
     */
    public InspectionDTO() {
        inspectionPartPrices.put(InspectionParts.ENGINE, 100F);
        inspectionPartPrices.put(InspectionParts.WHEELS, 200F);
        inspectionPartPrices.put(InspectionParts.WINDSHIELDS, 50F);
        inspectionPartPrices.put(InspectionParts.LIGHTS, 10F);
        inspectionPartPrices.put(InspectionParts.BRAKES, 100F);
        inspectionPartPrices.put(InspectionParts.ACCELERATOR, 200F);
        inspectionPartPrices.put(InspectionParts.GEARBOX, 50F);
        inspectionPartPrices.put(InspectionParts.STEREO, 10F);
        inspectionPartPrices.put(InspectionParts.STEERING, 100F);
        inspectionPartPrices.put(InspectionParts.CLUTCH, 200F);
        inspectionPartPrices.put(InspectionParts.AIRCONDITION, 50F);
        inspectionPartPrices.put(InspectionParts.AIRBAGS, 10F);
        inspectionPartPrices.put(InspectionParts.BONNET, 100F);
        inspectionPartPrices.put(InspectionParts.CARBURATOR, 200F);
        inspectionPartPrices.put(InspectionParts.SPEEDOMETER, 50F);
        inspectionPartPrices.put(InspectionParts.GPS, 10F);
        inspectionPartPrices.put(InspectionParts.PAINT, 100F);
        inspectionPartPrices.put(InspectionParts.MIRRORS, 200F);
    }

    /**
     *
     * @param part
     * @return
     */
    public float getInspectionCost(InspectionParts part) {
        return inspectionPartPrices.get(part);
    }
}
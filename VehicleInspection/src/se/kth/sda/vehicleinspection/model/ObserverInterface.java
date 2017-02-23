/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.sda.vehicleinspection.model;

import java.util.Map;
import se.kth.sda.vehicleinspection.DTO.InspectionParts;
import se.kth.sda.vehicleinspection.DTO.InspectionResults;

/**
 *
 * @author payal
 */
public interface ObserverInterface {
    
   public void isInspectionDone(Map<InspectionParts, InspectionResults> inspectionresult);
            
}
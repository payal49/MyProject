/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.sda.vehicleinspection.view;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Observable;
import se.kth.sda.vehicleinspection.model.ObserverInterface;
import java.util.Observer;
import java.util.Set;
import se.kth.sda.vehicleinspection.DTO.InspectionParts;
import se.kth.sda.vehicleinspection.DTO.InspectionResults;
import se.kth.sda.vehicleinspection.model.InspectionResult;
import se.kth.sda.vehicleinspection.model.VehicleInspection;

/**
 *
 * @author agupt
 */
public class InspectionStatsView implements Observer {
    
    
    public InspectionStatsView( )
            {                 
                
            }

    @Override
    public void update(Observable o, Object arg) {
        InspectionResult inspectionResult = (InspectionResult)arg;
        inspectionResult.getInspectionPassFailCount();        
        }
        
        //To change body of generated methods, choose Tools | Templates.
    }
   
    
    
    
    

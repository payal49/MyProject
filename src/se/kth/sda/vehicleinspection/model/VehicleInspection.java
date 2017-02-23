/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
package se.kth.sda.vehicleinspection.model;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import se.kth.sda.vehicleinspection.DTO.InspectionParts;
import se.kth.sda.vehicleinspection.DTO.InspectionResults;
import se.kth.sda.vehicleinspection.DTO.VehicleDTO;
import se.kth.sda.vehicleinspection.integration.SingleVehicleInspectionForAllDatesResults;
import se.kth.sda.vehicleinspection.integration.SingleVehicleInspectionForSingleDateResults;
import se.kth.sda.vehicleinspection.integration.VehicleInspectionHistory;
import java.util.Observable;
import se.kth.sda.vehicleinspection.view.InspectionStatsView;

/**
 *
 * @author tmpuser-10227
 */
public class VehicleInspection extends Observable   {
    
     InspectionStatsView inspectionStatsView = new InspectionStatsView();
      
    static
    private RecommendedInspection actualInspection;
    VehicleDTO vehicle;
    Random r = new Random();
    ArrayList<ObserverInterface> list = new ArrayList<ObserverInterface>();

    public VehicleInspection(VehicleDTO vehicleDTO, RecommendedInspection recommendedInspections) {
        this.actualInspection = recommendedInspections;
        vehicle = vehicleDTO;
        addObserver(inspectionStatsView);
    }

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
        setChanged();
        hasChanged();        
        notifyObservers(finalResults);        
        return finalResults;
    }
        
        public void addObserver(ObserverInterface observerInterface)
        { 
            list.add(observerInterface);
            
        }
        
          public void removeObserver(ObserverInterface observerInterface)
        { 
            list.remove(observerInterface );
            
        }
          
           

    public void addInspectionResultToVehicleHistory(VehicleDTO vehicleDTO, InspectionResult inspectionResult) {
        SingleVehicleInspectionForSingleDateResults s = inspectionResult.addInspectionResultToVehicleHistory();
        SingleVehicleInspectionForAllDatesResults a = new SingleVehicleInspectionForAllDatesResults(s);
        VehicleInspectionHistory.commitNewInspectionResults(vehicleDTO, a);
    }
}

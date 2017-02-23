/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.sda.vehicleinspection.view;



import java.util.Map;
import se.kth.sda.vehicleinspection.DTO.InspectionParts;
import se.kth.sda.vehicleinspection.DTO.InspectionResults;
import se.kth.sda.vehicleinspection.model.ObserverInterface;


/**
 *
 * @author payal
 */
public class InspectionStatsView implements ObserverInterface {
    
    
    public InspectionStatsView( )
            {                 
                
            }

    
    public void isInspectionDone(Map<InspectionParts, InspectionResults> inspectionresult) {
         System.out.println("Observer Pattern InspectionStatsView");
              int passcount = 0;
              int failcount = 0;             
          for (Map.Entry<InspectionParts, InspectionResults> entry : inspectionresult.entrySet()) {
              
            InspectionResults inspectionresults= entry.getValue();
            if(inspectionresults.equals(InspectionResults.PASS))
                passcount+=1;
            else if(inspectionresults.equals(InspectionResults.FAIL))
                failcount+=1;       
               
        }
            System.out.println("Pass Count is " + passcount);
            System.out.println("Fail Count is " + failcount);
    }
}
          
   
        //To change body of generated methods, choose Tools | Templates.
    
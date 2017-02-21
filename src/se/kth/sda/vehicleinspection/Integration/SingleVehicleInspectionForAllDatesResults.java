/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.sda.vehicleinspection.Integration;

/**
 *
 * @author tmpuser-10211
 */


import java.util.ArrayList;

/**
 *
 * @author Shubha
 */
public class SingleVehicleInspectionForAllDatesResults {

    // TODO fix private / public

    /**
     *
     */
    public ArrayList<SingleVehicleInspectionForSingleDateResults> singleVehicleInspectionForAllDatesResults = new ArrayList<>();

    /**
     *
     * @param s
     */
    public SingleVehicleInspectionForAllDatesResults(SingleVehicleInspectionForSingleDateResults s) {
        singleVehicleInspectionForAllDatesResults.add(s);
    }

    /**
     *
     */
    public void printSingleVehicleInspectionForAllDatesResults() {
        for (SingleVehicleInspectionForSingleDateResults s : singleVehicleInspectionForAllDatesResults) {
            s.printSingleVehicleInspectionForSingleDateResults();
        }
    }
}
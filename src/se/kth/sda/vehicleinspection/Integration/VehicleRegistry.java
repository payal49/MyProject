package se.kth.sda.vehicleinspection.Integration;

import DTO.CustomerDTO;
import DTO.VehicleDTO;
import java.util.HashMap;
import java.util.Map.Entry;

/**
 *
 * @author tmpuser-10211
 */
public class VehicleRegistry {

    /**
     *
     */
    public static final HashMap<VehicleDTO, CustomerDTO> vehicleRegistry = new HashMap<>();

    /**
     *
     * @param vehicleDTO
     * @param customerDTO
     */
    public static void ensureVehicleExistsInRegistry(VehicleDTO vehicleDTO, CustomerDTO customerDTO) {
        System.out.println("Check if vehicle was serviced in the garage before" + "");
        if (!(VehicleRegistry.vehicleRegistry.containsKey(vehicleDTO))) {
            createNewVehicleEntry(vehicleDTO, customerDTO);
        }
    }

    /**
     *
     * @param vehicleDTO
     * @param customerDTO
     */
    public static void createNewVehicleEntry(VehicleDTO vehicleDTO, CustomerDTO customerDTO) {
        VehicleRegistry.vehicleRegistry.put(vehicleDTO, customerDTO);
        System.out.println("Vehicle regisrty created successfully");
        printVehicleRegistry();
    }

    /**
     *
     */
    public static void printVehicleRegistry() {
        for (Entry<VehicleDTO, CustomerDTO> entry : vehicleRegistry.entrySet()) {
            String key = entry.getKey().getNumber();
            String value = entry.getValue().getName();
            System.out.println("Vehicle Number: " + key + " Customer Name: " + value);
        }
    }
}


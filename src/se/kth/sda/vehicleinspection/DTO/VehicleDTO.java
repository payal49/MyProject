/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.sda.vehicleinspection.DTO;

/**
 *
 * @author tmpuser-10227
 */
public class VehicleDTO {

    private String number;
    private String type;
    private String brand;
    private String model;
    private String color;

    public VehicleDTO(String number, String type, String brand, String model, String color) {
        this.brand = brand;
        this.type = type;
        this.number = number;
        this.model = model;
        this.color = color;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        if (number == null || number.isEmpty()) {
            System.out.println("Invalid vehicle number");
        } else {
            this.number = number;
        }
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if (type == null || type.isEmpty()) {
            System.out.println("Invalid vehicle type");
        } else {
            this.type = type;
        }
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand == null || brand.isEmpty()) {
            System.out.println("Invalid vehicle brand");
        } else {
            this.brand = brand;
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model == null || model.isEmpty()) {
            System.out.println("Invalid vehicle model");
        } else {
            this.model = model;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty()) {
            System.out.println("Invalid vehicle color");
        } else {
            this.color = color;
        }
    }
}

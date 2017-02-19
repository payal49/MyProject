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
public final class AddressDTO {

    private String street;
    private String city;
    private String zipCode;
    private String state;
    private String country;

    public AddressDTO(String street, String city, String zipcode, String state, String country) {
        setStreet(street);
        setCity(city);
        setZipCode(zipcode);
        setState(state);
        setCountry(country);
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        if (street == null || street.isEmpty()) {
            System.out.println("Invalid street name");
        } else {
            this.street = street;
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        if (city == null || city.isEmpty()) {
            System.out.println("Invalid city name");
        } else {
            this.city = city;
        }
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        if (zipCode == null || zipCode.isEmpty()) {
            System.out.println("Invalid zipCode name");
        } else {
            this.zipCode = zipCode;
        }
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        if (state == null || state.isEmpty()) {
            System.out.println("Invalid state name");
        } else {
            this.state = state;
        }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (country == null || country.isEmpty()) {
            System.out.println("Invalid country name");
        } else {
            this.country = country;
        }
    }
}

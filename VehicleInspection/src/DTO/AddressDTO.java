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
public class AddressDTO {
    private String street;
    private String city;
    private String zipCode;
    private String state;
    private String country;
    
    /**
     *
     * @param street
     * @param city
     * @param zipcode
     * @param state
     * @param country
     */
    public AddressDTO(String street, String city, String zipcode, String state, String country){
        setStreet(street);
        setCity(city);
        setZipCode(zipCode);
        setState(state);
        setCountry(country);
    }

    /**
     *
     * @return
     */
    public String getStreet() {
        return street;
    }

    /**
     *
     * @param street
     */
    public void setStreet(String street) {
        if(street == null || street.isEmpty()){
            System.out.println("Invalid street name");
        }
        else{
            this.street = street;
        }
    }

    /**
     *
     * @return
     */
    public String getCity() {
        return city;
    }

    /**
     *
     * @param city
     */
    public void setCity(String city) {
        if(city == null || city.isEmpty()){
            System.out.println("Invalid city name");
        }
        else{
            this.city = city;
        }
    }

    /**
     *
     * @return
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     *
     * @param zipCode
     */
    public void setZipCode(String zipCode) {
        if(zipCode == null || zipCode.isEmpty()){
            System.out.println("Invalid zipCode name");
        }
        else{
            this.zipCode = zipCode;
        }
    }

    /**
     *
     * @return
     */
    public String getState() {
        return state;
    }

    /**
     *
     * @param state
     */
    public void setState(String state) {
        if(state == null || state.isEmpty()){
            System.out.println("Invalid state name");
        }
        else{
            this.state = state;
        }
    }

    /**
     *
     * @return
     */
    public String getCountry() {
        return country;
    }

    /**
     *
     * @param country
     */
    public void setCountry(String country) {
        if(country == null || country.isEmpty()){
            System.out.println("Invalid country name");
        }
        else{
            this.country = country;
        }
    }
}
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
public class CustomerDTO {

    private String drivingLicense;
    private String name;
    private AddressDTO address;
    private String phone;
    private String emailID;

    /**
     *
     * @param drivingLicense
     * @param name
     * @param address
     * @param phone
     * @param email
     */
    public CustomerDTO(String drivingLicense, String name, AddressDTO address, String phone, String email) {
        this.drivingLicense = drivingLicense;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.emailID = email;
    }

    /**
     *
     * @return
     */
    public String getDrivingLicense() {
        return drivingLicense;
    }

    /**
     *
     * @param drivingLicense
     */
    public void setDrivingLicense(String drivingLicense) {
        if (drivingLicense == null || drivingLicense.isEmpty()) {
            System.out.println("Invalid driving license");
        } else {
            this.drivingLicense = drivingLicense;
        }
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            System.out.println("Invalid name");
        } else {
            this.name = name;
        }
    }

    /**
     *
     * @return
     */
    public AddressDTO getAddress() {
        return address;
    }

    /**
     *
     * @param address
     */
    public void setAddress(AddressDTO address) {
        this.address = address;
    }

    /**
     *
     * @return
     */
    public String getPhone() {
        return phone;
    }

    /**
     *
     * @param phone
     */
    public void setPhone(String phone) {
        if (phone == null || phone.isEmpty() || !(isInteger(phone))) {
            System.out.println("Invalid phone number");
        } else {
            this.phone = phone;
        }
    }

    /**
     *
     * @return
     */
    public String getEmailID() {
        return emailID;
    }

    /**
     *
     * @param emailID
     */
    public void setEmailID(String emailID) {
        if (emailID == null || emailID.isEmpty()) {
            System.out.println("Invalid emailID");
        } else {
            this.emailID = emailID;
        }
    }

     /**
     *
     * @param s
     */
    private boolean isInteger(String s) {
        if (s.isEmpty()) {
            return false;
        }
        int length = s.length();
        for (int i = 0; i < length; i++) {
            if (!(Integer.parseInt(s.substring(i)) >= 0 && Integer.parseInt(s.substring(i)) <= 9)) {
                return false;
            }
        }
        return true;
    }
}

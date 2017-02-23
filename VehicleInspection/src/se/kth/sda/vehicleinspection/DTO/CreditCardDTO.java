/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.sda.vehicleinspection.DTO;

import java.time.YearMonth;

/**
 *
 * @author - Shubba , Payal , Vimala
 * The class CreditCardDTO represent Detailed CreditCard information .
 */
public class CreditCardDTO {

    private String creditCardNumber;
    private String name;
    private YearMonth expiryYearMonth;
    private String cvv;
    private String pin;

    /**
     * This is CreditCardDTO Constructor 
     * @param creditCardNumber - Credit Card Number detail
     * @param name - Credit Card name detail
     * @param expiryYearMonth Credit Card expiry detail
     * @param cvv - Credit Card CVV Number
     * @param pin - Credit Card pin Number
     */
    public CreditCardDTO(String creditCardNumber, String name, YearMonth expiryYearMonth, String cvv, String pin) {
        validateCreditCardNumber(creditCardNumber);
        setName(name);
        validateExpiryYearMonth(expiryYearMonth);
        validateCVV(cvv);
        validatePin(pin);
    }

    private void validateCVV(String cvv) {
        //Ensure CVV is a 3 digit number
        if (isInteger(cvv, 3)) {
            this.cvv = cvv;
        } else {
            System.out.println("Invalid CVV");
        }
    }

    private void validateExpiryYearMonth(YearMonth expiryYearMonth) {
        if (expiryYearMonth.isBefore(YearMonth.now())) {
            System.out.println("Invalid expiry month & year");
        } else {
            this.expiryYearMonth = expiryYearMonth;
        }
    }

    private void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new UnsupportedOperationException("Invalid Name");
        } else {
            this.name = name;
        }
    }

    private void validateCreditCardNumber(String creditCardNumber) {
        if (isInteger(creditCardNumber, 12)) {
            this.creditCardNumber = creditCardNumber;
        } else {
            System.out.println("Invalid Credit Card Number");
        }
    }

    private void validatePin(String pin) {
        //Ensure pin is a 4 digit number
        if (isInteger(pin, 4)) {
            this.pin = pin;
        } else {
            System.out.println("Invalid pin");
        }
    }

    private static boolean isInteger(String s, int len) {
        if (s.isEmpty()) {
            return false;
        }
        if (s.length() != len) {
            return false;
        }
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) < '0' || s.charAt(i) > '9') {
                return false;
            }
        }
        return true;
    }
}

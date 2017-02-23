/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
package se.kth.sda.vehicleinspection.model;
import se.kth.sda.vehicleinspection.DTO.CustomerDTO;
import se.kth.sda.vehicleinspection.DTO.VehicleDTO;

/**
 *
 * @author tmpuser-10227
 */
public class PaymentReceipt extends Receipt {

    private Payment payment;
    private VehicleDTO vehicleDTO;
    private CustomerDTO customerDTO;
    //private String paymentMessage;

    public PaymentReceipt(Payment payment, VehicleDTO vehicleDTO, CustomerDTO customerDTO) {
        this.payment = payment;
        this.customerDTO = customerDTO;
        this.vehicleDTO = vehicleDTO;
    }

    public String generatePaymentReceipt() {
        StringBuilder str = new StringBuilder();
        str.append("\n");
        str.append("=================\nPayment Receipt\n");
        str.append("Payment Received from: \n");
        str.append("\nCustomer Name: ");
        str.append(customerDTO.getName());
        str.append("Vehicle Number: ");
        str.append(vehicleDTO.getNumber());
        str.append("\n");
        str.append(payment.getPaymentMessage());
        str.append("\n=================");
        return str.toString();
    }
}

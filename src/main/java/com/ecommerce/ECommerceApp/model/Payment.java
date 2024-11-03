package com.ecommerce.ECommerceApp.model;


import org.springframework.stereotype.Component;
import java.time.LocalDateTime;

/**
 * Represents a payment in ECommerce system.
 * Contains: paymentID, paymentType, paymentStatus
 */
@Component
public class Payment{
    
    private int paymentID;
    private PaymentType paymentType;
    private PaymentStatus paymentStatus;
    
    public int getPaymentID(){
        return paymentID;
    }
    public void setPaymentID(int PaymentID){
        this.paymentID = paymentID;
    }

    public PaymentType getPaymentType(){
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType){
        this.paymentType = paymentType;
    }

    public PaymentStatus getPaymentStatus(){
        return paymentStatus;
    }
    public void setPaymentStatus(PaymentStatus status){
        this.paymentStatus = status;
    }

}
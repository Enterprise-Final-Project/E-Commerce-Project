package com.ecommerce.ECommerceApp.model;


import org.springframework.stereotype.Component;
import java.time.LocalDateTime;

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

    public PaymentType getPaymetType(){
        return paymentType;
    }

    public void SetPaymentType(PaymentType paymentType){
        this.paymentType = paymentType;
    }


    public PaymentStatus getPaymentStatus(){
        return paymentStatus;
    }
    public void SetPaymentStatus(PaymentStatus status){
        this.paymentStatus = status;
    }

}
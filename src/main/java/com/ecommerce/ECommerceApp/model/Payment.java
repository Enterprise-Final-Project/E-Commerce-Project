package com.ecommerce.ECommerceApp.model;

public interface Payment{
    
    int getPaymentID();
    void setPaymentID(int PaymentID);

    PaymentType getPaymentType();
    void SetPaymentType(PaymentType paymentType);


    PaymentStatus getPaymentStatus();
    void SetPaymentStatus(PaymentStatus status);

}
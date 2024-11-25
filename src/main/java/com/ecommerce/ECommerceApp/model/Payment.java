package com.ecommerce.ECommerceApp.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

/**
 * Represents a payment in the e-commerce application.
 */
@Embeddable
public class Payment {
    
    @Column(name = "paymentID")
    private Integer paymentID;
    @Enumerated(EnumType.STRING)
    @Column(name = "paymentStatus")
    private PaymentStatus paymentStatus;
    @Enumerated(EnumType.STRING)
    @Column(name = "paymentType")
    private PaymentType paymentType;

    // Default constructor
    public Payment() {
    }

    /**
     * Constructor for Payment.
     *
     * @param paymentID the payment ID
     * @param paymentType the payment type
     * @param paymentStatus the payment status
     */
    public Payment(int paymentID, PaymentType paymentType, PaymentStatus paymentStatus) {
        this.paymentID = paymentID;
        this.paymentType = paymentType;
        this.paymentStatus = paymentStatus;
    }

    /**
     * Gets the payment ID.
     *
     * @return the payment ID
     */
    public int getPaymentID() {
        return paymentID;
    }

    /**
     * Sets the payment ID.
     *
     * @param paymentID the payment ID
     */
    public void setPaymentID(int paymentID) {
        this.paymentID = paymentID;
    }

    /**
     * Gets the payment type.
     *
     * @return the payment type
     */
    public PaymentType getPaymentType() {
        return paymentType;
    }

    /**
     * Sets the payment type.
     *
     * @param paymentType the payment type
     */
    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    /**
     * Gets the payment status.
     *
     * @return the payment status
     */
    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    /**
     * Sets the payment status.
     *
     * @param paymentStatus the payment status
     */
    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
}
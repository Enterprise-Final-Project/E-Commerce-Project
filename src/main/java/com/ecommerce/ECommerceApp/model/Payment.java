package com.ecommerce.ECommerceApp.model;

import javax.persistence.*;

/**
 * Represents a payment in the e-commerce application.
 */
@Entity
public class Payment {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increment ID
   private Long paymentID;

    @Column(nullable = true)
    @Enumerated(EnumType.STRING)
    private PaymentType paymentType;

    @Column(nullable = true)
    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentStatus;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = true)
    private User user;

    /**
     * Default constructor required by JPA.
     */

    protected Payment() {}
    /**
     * Constructor for Payment.
     *
     * @param paymentType the payment type
     * @param paymentStatus the payment status
     */
    public Payment(PaymentType paymentType, PaymentStatus paymentStatus) {
        this.paymentType = paymentType;
        this.paymentStatus = paymentStatus;
    }

    /**
     * Gets the payment ID.
     *
     * @return the payment ID
     */
    public Long getPaymentID() {
        return paymentID;
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

    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
}
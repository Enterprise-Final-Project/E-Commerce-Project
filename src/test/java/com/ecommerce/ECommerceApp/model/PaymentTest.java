package com.ecommerce.ECommerceApp.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Unit tests for the {@link Payment} class.
 */
public class PaymentTest {
    private Payment payment;

    @BeforeEach
    public void setUp() {
        payment = new Payment(PaymentType.DEBIT, PaymentStatus.APPROVED);
    }

    /**
     * Tests the {@link Payment#getPaymentID()} method.
     */
    @Test
    public void testGetPaymentID() {
        payment.getPaymentID();
    }

    /**
     * Tests the {@link Payment#getPaymentType()} method.
     */
    @Test
    public void testGetPaymentType() {
        assertEquals(PaymentType.DEBIT, payment.getPaymentType());
    }

    /**
     * Tests the {@link Payment#getPaymentStatus()} method.
     */
    @Test
    public void testGetPaymentStatus() {
        assertEquals(PaymentStatus.APPROVED, payment.getPaymentStatus());
    }
}
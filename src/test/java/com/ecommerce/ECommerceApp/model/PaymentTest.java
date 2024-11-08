package com.ecommerce.ECommerceApp.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Unit tests for the {@link Payment} class.
 */
@SpringBootTest
public class PaymentTest {
    @Autowired
    private Payment payment;

    /**
     * Tests the {@link Payment#getPaymentID()} method.
     */
    @Test
    public void testGetPaymentID() {
        payment.setPaymentID(1);
        assertEquals(1, payment.getPaymentID());
    }

    /**
     * Tests the {@link Payment#getPaymentType()} method.
     */
    @Test
    public void testGetPaymentType() {
        payment.setPaymentType(PaymentType.DEBIT);
        assertEquals(PaymentType.DEBIT, payment.getPaymentType());
    }

    /**
     * Tests the {@link Payment#getPaymentStatus()} method.
     */
    @Test
    public void testGetPaymentStatus() {
        payment.setPaymentStatus(PaymentStatus.APPROVED);
        assertEquals(PaymentStatus.APPROVED, payment.getPaymentStatus());
    }
}
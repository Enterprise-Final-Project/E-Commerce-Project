package com.ecommerce.ECommerceApp.model;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Unit tests for the {@link ShippingDetails} class.
 */
public class ShippingDetailsTest {

    @Autowired
    private ShippingDetails details;

    @BeforeEach
    public void setUp() {
        details = new ShippingDetails("123 Main St", LocalDateTime.now(), ShippingType.STANDARD);
    }

    /**
     * Tests the {@link ShippingDetails#getShippingAddress()} method.
     */
    @Test
    public void testGetShippingAddress() {
        assertEquals("123 Main St", details.getShippingAddress());
    }

    /**
     * Tests the {@link ShippingDetails#setShippingAddress(String)} method.
     */
    @Test
    public void testSetShippingAddress() {
        details.setShippingAddress("456 Elm St");
        assertEquals("456 Elm St", details.getShippingAddress());
    }

    /**
     * Tests the {@link ShippingDetails#getDeliveryDate()} method.
     */
    @Test
    public void testGetDeliveryDate() {
        LocalDateTime currentTime = LocalDateTime.now();
        details.setDeliveryDate(currentTime);
        assertEquals(currentTime, details.getDeliveryDate());
    }

    /**
     * Tests the {@link ShippingDetails#setDeliveryDate(LocalDateTime)} method.
     */
    @Test
    public void testSetDeliveryDate() {
        LocalDateTime date = LocalDateTime.now();
        details.setDeliveryDate(date);
        assertEquals(date, details.getDeliveryDate());
    }

    /**
     * Tests the {@link ShippingDetails#getShippingType()} method.
     */
    @Test
    public void testGetShippingType() {
        assertEquals(ShippingType.STANDARD, details.getShippingType());
    }

    /**
     * Tests the {@link ShippingDetails#setShippingType(ShippingType)} method.
     */
    @Test
    public void testSetShippingType() {
        details.setShippingType(ShippingType.EXPRESS);
        assertEquals(ShippingType.EXPRESS, details.getShippingType());
    }
}
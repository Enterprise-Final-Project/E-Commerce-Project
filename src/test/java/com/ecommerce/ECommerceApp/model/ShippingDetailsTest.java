package com.ecommerce.ECommerceApp.model;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Unit tests for the {@link ShippingDetails} class.
 */
@SpringBootTest
public class ShippingDetailsTest {

    @Autowired
    private ShippingDetails details;

    /**
     * Tests the {@link ShippingDetails#getShippingAddress()} method.
     */
    @Test
    public void testGetShippingAddress() {
        details.setShippingAddress("123 Main St");
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
        details.setShippingType(ShippingType.STANDARD);
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
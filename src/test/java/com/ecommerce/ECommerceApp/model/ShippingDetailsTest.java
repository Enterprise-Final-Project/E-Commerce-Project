package com.ecommerce.ECommerceApp.model;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ShippingDetailsTest {

    @Autowired
    private ShippingDetails details;

    @Test
    public void testGetShippingAddress() {
        details.setShippingAddress("123 Main St");
        assertEquals("123 Main St", details.getShippingAddress());
    }

    @Test
    public void testSetShippingAddress() {
        details.setShippingAddress("456 Elm St");
        assertEquals("456 Elm St", details.getShippingAddress());
    }

    @Test
    public void testGetDeliveryDate() {
        LocalDateTime currentTime = LocalDateTime.now();
        details.setDeliveryDate(currentTime);
        assertEquals(currentTime, details.getDeliveryDate());
    }

    @Test
    public void testSetDeliveryDate() {
        LocalDateTime date = LocalDateTime.now();
        details.setDeliveryDate(date);
        assertEquals(date, details.getDeliveryDate());
    }

    @Test
    public void testGetShippingType() {
        details.setShippingType(ShippingType.STANDARD);
        assertEquals(ShippingType.STANDARD, details.getShippingType());
    }

    @Test
    public void testSetShippingType() {
        details.setShippingType(ShippingType.EXPRESS);
        assertEquals(ShippingType.EXPRESS, details.getShippingType());
    }
}
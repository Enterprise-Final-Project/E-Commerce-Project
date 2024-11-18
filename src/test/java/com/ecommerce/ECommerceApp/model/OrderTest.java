package com.ecommerce.ECommerceApp.model;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Test class for the Order model.
 */
public class OrderTest {
    
    @Autowired
    private Order order;

    /**
     * Sets up the test environment before each test.
     */
    @BeforeEach
    public void setUp() {
        order = new Order(1, LocalDateTime.now(), 1, 100.0f);
    }

    /**
     * Tests the getOrderID method.
     */
    @Test
    public void testGetOrderID() {
        assertEquals(1, order.getOrderID());
    }

    /**
     * Tests the setOrderID method.
     */
    @Test
    public void testSetOrderID() {
        order.setOrderID(2);
        assertEquals(2, order.getOrderID());
    }

    /**
     * Tests the getOrderDate method.
     */
    @Test
    public void testGetOrderDate() {
        LocalDateTime currentTime = LocalDateTime.now();
        order.setOrderDate(currentTime);
        assertEquals(currentTime, order.getOrderDate());
    }

    /**
     * Tests the setOrderDate method.
     */
    @Test
    public void testSetOrderDate() {
        LocalDateTime newDate = LocalDateTime.now().plusDays(1);
        order.setOrderDate(newDate);
        assertEquals(newDate, order.getOrderDate());
    }

    /**
     * Tests the getUserID method.
     */
    @Test
    public void testGetUserID() {
        assertEquals(1, order.getUserID());
    }

    /**
     * Tests the setUserID method.
     */
    @Test
    public void testSetUserID() {
        order.setUserID(2);
        assertEquals(2, order.getUserID());
    }

    /**
     * Tests the getTotalAmount method.
     */
    @Test
    public void testGetTotalAmount() {
        assertEquals(100.0f, order.getTotalAmount());
    }

    /**
     * Tests the setTotalAmount method.
     */
    @Test
    public void testSetTotalAmount() {
        order.setTotalAmount(200.0f);
        assertEquals(200.0f, order.getTotalAmount());
    }
}

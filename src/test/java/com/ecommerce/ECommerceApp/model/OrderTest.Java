package com.ecommerce.ECommerceApp.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class OrderTest {
    @Autowired
    private Order order;

    @Test
    public void testGetOrderID() {
        order.setOrderID(1);
        assertEquals(1, order.getOrderID());
    }

    @Test
    public void testGetOrderDate() {
        order.setOrderDate("2021-10-23");
        assertEquals("2021-10-23", order.getOrderDate());
    }

    @Test
    public void testGetUserID() {
        order.setUserID(1);
        assertEquals(1, order.getUserID());
    }

    @Test
    public void testGetTotalAmount() {
        order.setTotalAmount(100.0f);
        assertEquals(100.0f, order.getTotalAmount());
    }
}
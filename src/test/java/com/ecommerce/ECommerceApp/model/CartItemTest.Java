package com.ecommerce.ECommerceApp.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Unit tests for the {@link CartItem} class.
 */
@SpringBootTest
public class CartItemTest {
    @Autowired
    private CartItem cartItem;

    /**
     * Tests the {@link CartItem#getProductID()} method.
     */
    @Test
    public void testGetProductID() {
        cartItem.setProductID(1);
        assertEquals(1, cartItem.getProductID());
    }

    /**
     * Tests the {@link CartItem#getQuantity()} method.
     */
    @Test
    public void testGetQuantity() {
        cartItem.setQuantity(2);
        assertEquals(2, cartItem.getQuantity());
    }

    /**
     * Tests the {@link CartItem#getPrice()} method.
     */
    @Test
    public void testGetPrice() {
        cartItem.setPrice(3.0);
        assertEquals(3.0, cartItem.getPrice());
    }

    /**
     * Tests the {@link CartItem#setProductID(int)} method.
     */
    @Test
    public void testSetProductID() {
        cartItem.setProductID(1);
        assertEquals(1, cartItem.getProductID());
    }

    /**
     * Tests the {@link CartItem#setQuantity(int)} method.
     */
    @Test
    public void testSetQuantity() {
        cartItem.setQuantity(2);
        assertEquals(2, cartItem.getQuantity());
    }

    /**
     * Tests the {@link CartItem#setPrice(double)} method.
     */
    @Test
    public void testSetPrice() {
        cartItem.setPrice(3.0);
        assertEquals(3.0, cartItem.getPrice());
    }
}
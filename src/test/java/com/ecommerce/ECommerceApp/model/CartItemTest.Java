package com.ecommerce.ECommerceApp.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CartItemTest {
    @Autowired
    private CartItem cartItem;

    @Test
    public void testGetProductID() {
        cartItem.setProductID(1);
        assertEquals(1, cartItem.getProductID());
    }

    @Test
    public void testGetQuantity() {
        cartItem.setQuantity(2);
        assertEquals(2, cartItem.getQuantity());
    }

    @Test
    public void testGetPrice() {
        cartItem.setPrice(3.0);
        assertEquals(3.0, cartItem.getPrice());
    }

    @Test
    public void testSetProductID() {
        cartItem.setProductID(1);
        assertEquals(1, cartItem.getProductID());
    }

    @Test
    public void testSetQuantity() {
        cartItem.setQuantity(2);
        assertEquals(2, cartItem.getQuantity());
    }

    @Test
    public void testSetPrice() {
        cartItem.setPrice(3.0);
        assertEquals(3.0, cartItem.getPrice());
    }
}
package com.ecommerce.ECommerceApp.model;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Unit tests for the {@link Seller} class.
 */
@SpringBootTest
public class SellerTest {
    @Autowired
    private Seller seller;

    @BeforeEach
    public void setUp() {
        seller.getProductIDList().clear();
        seller.getOrderFulfillmentList().clear();
    }

    /**
     * Tests the {@link Seller#getProductIDList()} method.
     */
    @Test
    public void testGetProductIDList() {
        assertEquals(List.of(), seller.getProductIDList());
    }

    /**
     * Tests the {@link Seller#addProduct(int)} method.
     */
    @Test
    public void testAddProduct() {
        seller.addProduct(1);
        assertEquals(List.of(1), seller.getProductIDList());
    }

    /**
     * Tests the {@link Seller#removeProduct(int)} method.
     */
    @Test
    public void testRemoveProduct() {
        seller.addProduct(2);
        seller.addProduct(1);
        seller.addProduct(3);
        seller.removeProduct(2);
        assertEquals(List.of(1, 3), seller.getProductIDList());
    }

    /**
     * Tests the {@link Seller#getOrderFulfillmentList()} method.
     */
    @Test
    public void testGetOrderFulfillmentList() {
        assertEquals(List.of(), seller.getOrderFulfillmentList());
    }

    /**
     * Tests the {@link Seller#addOrder(int)} method.
     */
    @Test
    public void testAddOrder() {
        seller.addOrder(1);
        assertEquals(List.of(1), seller.getOrderFulfillmentList());
    }

    /**
     * Tests the {@link Seller#removeOrder(int)} method.
     */
    @Test
    public void testRemoveOrder() {
        seller.addOrder(2);
        seller.addOrder(1);
        seller.addOrder(3);
        seller.removeOrder(2);
        assertEquals(List.of(1, 3), seller.getOrderFulfillmentList());
    }
}
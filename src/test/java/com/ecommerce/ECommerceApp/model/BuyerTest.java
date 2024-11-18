package com.ecommerce.ECommerceApp.model;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Unit tests for the Buyer class.
 */
public class BuyerTest {
    private Buyer buyer;

    /**
     * Sets up a Buyer instance before each test.
     */
    @BeforeEach
    public void setUp() {
        buyer = new Buyer(
                "John",
                "Doe",
                new PhoneNumber("1234567890"),
                new Email("test@mail.com"),
                "password123",
                new Address("123 Main St", "City", "State", "12345", "Country"),
                new Address("456 Elm St", "City", "State", "12345", "Country"),
                new Payment(1, PaymentType.CREDIT, PaymentStatus.APPROVED),
                AccountType.BUYER,
                new ArrayList<>(),
                new ArrayList<>(),
                new ArrayList<>()
        );               
    }

    /**
     * Tests that the cart is not null.
     */
    @Test
    public void testGetCart() {
        assertNotNull(buyer.getCart());
    }

    /**
     * Tests adding an item to the cart.
     */
    @Test
    public void testAddToCart() {
        buyer.addToCart(1);
        assertNotNull(buyer.getCart());
    }

    /**
     * Tests removing an item from the cart.
     */
    @Test
    public void testRemoveFromCart() {
        buyer.addToCart(1);
        buyer.removeFromCart(1);
        assertNotNull(buyer.getCart());
    }

    /**
     * Tests that the order history is not null.
     */
    @Test
    public void testGetOrderHistory() {
        assertNotNull(buyer.getOrderHistory());
    }

    /**
     * Tests adding an item to the order history.
     */
    @Test
    public void testAddToOrderHistory() {
        buyer.addToOrderHistory(1);
        assertNotNull(buyer.getOrderHistory());
    }

    /**
     * Tests removing an item from the order history.
     */
    @Test
    public void testRemoveFromOrderHistory() {
        buyer.addToOrderHistory(1);
        buyer.removeFromOrderHistory(1);
        assertNotNull(buyer.getOrderHistory());
    }

    /**
     * Tests that the wish list is not null.
     */
    @Test
    public void testGetWishList() {
        assertNotNull(buyer.getWishList());
    }

    /**
     * Tests adding an item to the wish list.
     */
    @Test
    public void testAddToWishList() {
        buyer.addToWishList(1);
        assertNotNull(buyer.getWishList());
    }

    /**
     * Tests removing an item from the wish list.
     */
    @Test
    public void testRemoveFromWishList() {
        buyer.addToWishList(1);
        buyer.removeFromWishList(1);
        assertNotNull(buyer.getWishList());
    }
}

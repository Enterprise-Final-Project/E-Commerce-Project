package com.ecommerce.ECommerceApp.model;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class BuyerTest {
    @Autowired
    private Buyer buyer;

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

    @Test
    public void testGetCart() {
        assertNotNull(buyer.getCart());
    }

    @Test
    public void testAddToCart() {
        buyer.addToCart(1);
        assertNotNull(buyer.getCart());
    }

    @Test
    public void testRemoveFromCart() {
        buyer.addToCart(1);
        buyer.removeFromCart(1);
        assertNotNull(buyer.getCart());
    }

    @Test
    public void testGetOrderHistory() {
        assertNotNull(buyer.getOrderHistory());
    }

    @Test
    public void testAddToOrderHistory() {
        buyer.addToOrderHistory(1);
        assertNotNull(buyer.getOrderHistory());
    }

    @Test
    public void testRemoveFromOrderHistory() {
        buyer.addToOrderHistory(1);
        buyer.removeFromOrderHistory(1);
        assertNotNull(buyer.getOrderHistory());
    }

    @Test
    public void testGetWishList() {
        assertNotNull(buyer.getWishList());
    }

    @Test
    public void testAddToWishList() {
        buyer.addToWishList(1);
        assertNotNull(buyer.getWishList());
    }

    @Test
    public void testRemoveFromWishList() {
        buyer.addToWishList(1);
        buyer.removeFromWishList(1);
        assertNotNull(buyer.getWishList());
    }
}

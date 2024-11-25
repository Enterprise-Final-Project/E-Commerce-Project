package com.ecommerce.ECommerceApp.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Unit tests for the {@link User} class.
 */
public class UserTest {
    
    @Autowired
    private User user;

    /**
     * Sets up a new {@link User} instance before each test.
     */
    @BeforeEach
    public void setUp() {
        user = new User(
                true,
                "John",
                "Doe",
                "test@mail.com",
                "password",
                "123 Main St, Apt 1",
                "123 Main St, Apt 1",
                1,
                "USER");
    }
    
    /**
     * Tests that the user ID is not null.
     */
    @Test
    public void testGetUserID() {
        assert user.getUserID() != null;
    }

    /**
     * Tests that the first name is correctly retrieved.
     */
    @Test
    public void testGetFirstName() {
        assert user.getFirstName().equals("John");
    }

    /**
     * Tests that the last name is correctly retrieved.
     */
    @Test
    public void testGetLastName() {
        assert user.getLastName().equals("Doe");
    }

    /**
     * Tests that the full name is correctly retrieved.
     */
    @Test
    public void testGetFullName() {
        assert user.getFullName().equals("John Doe");
    }

    /**
     * Tests that the password is correctly updated.
     */
    @Test
    public void testSetNewPassword() {
        user.setNewPassword("newpassword");
        assert user.getPassword().equals("newpassword");
    }
}

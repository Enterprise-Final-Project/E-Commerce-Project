package com.ecommerce.ECommerceApp.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Test class for the Admin model.
 */
public class AdminTest {

    @Autowired
    private Admin admin;

    /**
     * Sets up the test data before each test.
     */
    @BeforeEach
    public void setUp() {
        admin = new Admin(
            true,
            "John", 
            "Doe", 
            "john.doe@example.com", 
            "password123", 
            "123 Main St, Apt 1", 
            "456 Elm St, Apt 2", 
            1,
            "ADMIN",
            "Level1"
        );
    }

    /**
     * Tests the getFirstName method.
     */
    @Test
    public void testGetFirstName() {
        assertEquals("John", admin.getFirstName());
    }

    /**
     * Tests the getFullName method.
     */
    @Test
    public void testGetFullName() {
        assertEquals("John Doe", admin.getFullName());
    }

    /**
     * Tests the getAdminLevel method.
     */
    @Test
    public void testGetAdminLevel() {
        assertEquals("Level1", admin.getAdminLevel());
    }

    /**
     * Tests the setAdminLevel method.
     */
    @Test
    public void testSetAdminLevel() {
        admin.setAdminLevel("Level2");
        assertEquals("Level2", admin.getAdminLevel());
    }
}
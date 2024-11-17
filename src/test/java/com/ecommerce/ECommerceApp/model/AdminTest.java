package com.ecommerce.ECommerceApp.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
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
            "John", 
            "Doe", 
            new PhoneNumber("1234567890"), 
            new Email("john.doe@example.com"), 
            "password123", 
            new Address("123 Main St", "City", "State", "12345", "Country"), 
            new Address("456 Elm St", "City", "State", "12345", "Country"), 
            new Payment(1, PaymentType.CREDIT, PaymentStatus.APPROVED),
            AccountType.ADMIN, 
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
     * Tests the getUserID method.
     */
    @Test
    public void testGetUserID() {
        assertNotNull(admin.getUserID());
        assertEquals(36, admin.getUserID().length()); // UUID length is 36 characters
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
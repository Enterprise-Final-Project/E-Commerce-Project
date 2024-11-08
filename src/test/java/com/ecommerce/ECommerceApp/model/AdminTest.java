package com.ecommerce.ECommerceApp.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AdminTest {

    @Autowired
    private Admin admin;

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
            new Payment(), 
            AccountType.ADMIN, 
            "Level1"
        );
    }

    @Test
    public void testGetFirstName() {
        assertEquals("John", admin.getFirstName());
    }

    @Test
    public void testGetFullName() {
        assertEquals("John Doe", admin.getFullName());
    }

    @Test
    public void testGetUserID() {
        assertNotNull(admin.getUserID());
        assertEquals(36, admin.getUserID().length()); // UUID length is 36 characters
    }

    @Test
    public void testGetAdminLevel() {
        assertEquals("Level1", admin.getAdminLevel());
    }

    @Test
    public void testSetAdminLevel() {
        admin.setAdminLevel("Level2");
        assertEquals("Level2", admin.getAdminLevel());
    }
}
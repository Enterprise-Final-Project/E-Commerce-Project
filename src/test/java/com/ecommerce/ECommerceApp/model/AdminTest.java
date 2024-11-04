package com.ecommerce.ECommerceApp.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AdminTest {

    @Autowired
    private Admin admin;

    @Test
    public void testGetFirstName() {
        admin = new Admin("John", "Doe", new PhoneNumber("1234567890"), new Email("john.doe@example.com"), "password123", new Address("123 Main St", "City", "State", "12345", "Country"), new Address("456 Elm St", "City", "State", "12345", "Country"), new Payment(), AccountType.ADMIN, "Level1");
        assertEquals("John", admin.getFirstName());
    }

    @Test
    public void testGetFullName() {
        admin = new Admin("John", "Doe", new PhoneNumber("1234567890"), new Email("john.doe@example.com"), "password123", new Address("123 Main St", "City", "State", "12345", "Country"), new Address("456 Elm St", "City", "State", "12345", "Country"), new Payment(), AccountType.ADMIN, "Level1");
        assertEquals("John Doe", admin.getFullName());
    }

    @Test
    public void testGetUserID() {
        admin = new Admin("John", "Doe", new PhoneNumber("1234567890"), new Email("john.doe@example.com"), "password123", new Address("123 Main St", "City", "State", "12345", "Country"), new Address("456 Elm St", "City", "State", "12345", "Country"), new Payment(), AccountType.ADMIN, "Level1");
        assertEquals(36, admin.getUserID().length()); // UUID length is 36 characters
    }
}
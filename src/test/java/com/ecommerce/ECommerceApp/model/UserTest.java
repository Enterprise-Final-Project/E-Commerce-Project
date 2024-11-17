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
                "John",
                "Doe",
                new PhoneNumber("123-456-7890"),
                new Email("test@mail.com"),
                "password",
                new Address("123 Main St", "Apt 1", "Springfield", "IL", "62701"),
                new Address("123 Main St", "Apt 1", "Springfield", "IL", "62701"),
                new Payment(1, PaymentType.CREDIT, PaymentStatus.APPROVED),
                AccountType.USER);
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
        assert user.lastName.equals("Doe");
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
        assert user.password.equals("newpassword");
    }

    /**
     * Tests that the active status is correctly updated.
     */
    @Test
    public void testSetActive() {
        user.setActive(true);
        assert user.active;
    }

    /**
     * Tests that the user information is correctly updated.
     */
    @Test
    public void testUpdateInformation() {
        user.updateInformation("Jane", "Smith", new PhoneNumber("098-765-4321"), new Email("test2@mail.com"), "newpassword",
                new Address("456 Main St", "Apt 2", "Springfield", "IL", "62701"),
                new Address("456 Main St", "Apt 2", "Springfield", "IL", "62701"),
                new Payment(2, PaymentType.CREDIT, PaymentStatus.APPROVED), AccountType.ADMIN);
        assert user.getFirstName().equals("Jane");
        assert user.lastName.equals("Smith");
        assert user.password.equals("newpassword");
        assert user.mailingAddress.getStreet().equals("456 Main St");
        assert user.shippingAddress.getStreet().equals("456 Main St");
        assert user.paymentMethod.getPaymentID() == 2;
        assert user.accountType == AccountType.ADMIN;
    }
}

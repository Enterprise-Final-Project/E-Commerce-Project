package com.ecommerce.ECommerceApp.model;

import java.util.UUID;

/**
 * Represents a user in the e-commerce application.
 */
public class User {

    // db details
    public String userID;
    public Boolean active;

    // user account details
    public String firstName;
    public String lastName;
    public PhoneNumber phoneNumber;
    public Email email;
    protected String password;

    // payment details
    public Address mailingAddress;
    public Address shippingAddress;
    public Payment paymentMethod;
    public AccountType accountType;

    /**
     * Constructs a new User with the specified details.
     *
     * @param firstName the first name of the user
     * @param lastName the last name of the user
     * @param phoneNumber the phone number of the user
     * @param email the email address of the user
     * @param password the password of the user
     * @param mailingAddress the mailing address of the user
     * @param shippingAddress the shipping address of the user
     * @param paymentMethod the payment method of the user
     * @param accountType the account type of the user
     */
    public User(String firstName, String lastName, PhoneNumber phoneNumber, Email email, String password, Address mailingAddress, Address shippingAddress, Payment paymentMethod, AccountType accountType) {
        this.userID = generateUniqueID();
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.password = password;
        this.mailingAddress = mailingAddress;
        this.shippingAddress = shippingAddress;
        this.paymentMethod = paymentMethod;
        this.accountType = accountType;
    }

    /**
     * Gets the user ID.
     *
     * @return the user ID
     */
    public String getUserID() {
        return this.userID;
    }

    /**
     * Gets the first name of the user.
     *
     * @return the first name of the user
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * Gets the full name of the user.
     *
     * @return the full name of the user
     */
    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }

    /**
     * Sets a new password for the user.
     *
     * @param password the new password
     */
    protected void setNewPassword(String password) {
        this.password = password;
    }

    /**
     * Sets the active status of the user.
     *
     * @param active the active status
     */
    protected void setActive(boolean active) {
        this.active = active;
    }

    /**
     * Updates the user's information.
     *
     * @param firstName the first name of the user
     * @param lastName the last name of the user
     * @param phoneNumber the phone number of the user
     * @param email the email address of the user
     * @param password the password of the user
     * @param mailingAddress the mailing address of the user
     * @param shippingAddress the shipping address of the user
     * @param paymentMethod the payment method of the user
     * @param accountType the account type of the user
     */
    protected void updateInformation(String firstName, String lastName, PhoneNumber phoneNumber, Email email, String password, Address mailingAddress, Address shippingAddress, Payment paymentMethod, AccountType accountType) {
        // if fields are left blank, they will not update
        if (firstName != null && !firstName.isBlank()) {
            this.firstName = firstName;
        }
        if (lastName != null && !lastName.isBlank()) {
            this.lastName = lastName;
        }
        if (phoneNumber != null) {
            this.phoneNumber = phoneNumber;
        }
        if (email != null) {
            this.email = email;
        }
        if (password != null && !password.isBlank()) {
            this.password = password;
        }
        if (mailingAddress != null) {
            this.mailingAddress = mailingAddress;
        }
        if (shippingAddress != null) {
            this.shippingAddress = shippingAddress;
        }
        if (paymentMethod != null) {
            this.paymentMethod = paymentMethod;
        }
        if (accountType != null) {
            this.accountType = accountType;
        }
    }

    /**
     * Generates a unique UUID for the user.
     *
     * @return the unique UUID
     */
    private String generateUniqueID() {
        return UUID.randomUUID().toString();
    }
}
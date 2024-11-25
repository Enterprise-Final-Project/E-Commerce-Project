package com.ecommerce.ECommerceApp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Represents a user in the e-commerce application.
 */
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userID; // Change to Long for auto-generation

    private Boolean active;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "mailing_address")
    private String mailingAddress;

    @Column(name = "shipping_address")
    private String shippingAddress;

    @Column(name = "payment_method")
    private Integer paymentMethod;

    @Column(name = "account_type")
    private String accountType;

    /**
     * Default constructor.
     */
    public User() {
    }

    /**
     * Constructs a new User with the specified details.
     *
     * @param active the active status of the user
     * @param firstName the first name of the user
     * @param lastName the last name of the user
     * @param email the email of the user
     * @param password the password of the user
     * @param mailingAddress the mailing address of the user
     * @param shippingAddress the shipping address of the user
     * @param paymentMethod the payment method of the user
     * @param accountType the account type of the user
     */
    public User(Boolean active, String firstName, String lastName, String email, String password, String mailingAddress, String shippingAddress, Integer paymentMethod, String accountType) {
        this.active = active;
        this.firstName = firstName;
        this.lastName = lastName;
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
    public Long getUserID() {
        return this.userID;
    }

    /**
     * Sets the user ID.
     *
     * @param userID the user ID
     */
    public void setUserID(Long userID) {
        this.userID = userID;
    }

    /**
     * Gets the first name of the user.
     *
     * @return the first name
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * Sets the first name of the user.
     *
     * @param firstName the first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets the full name of the user.
     *
     * @return the full name
     */
    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }

    /**
     * Checks if the user is active.
     *
     * @return true if the user is active, false otherwise
     */
    public boolean isActive() {
        return this.active;
    }

    /**
     * Gets the password of the user.
     *
     * @return the password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * Sets the password of the user.
     *
     * @param password the password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Gets the mailing address of the user.
     *
     * @return the mailing address
     */
    public String getMailingAddress() {
        return this.mailingAddress;
    }

    /**
     * Sets the mailing address of the user.
     *
     * @param mailingAddress the mailing address
     */
    public void setMailingAddress(String mailingAddress) {
        this.mailingAddress = mailingAddress;
    }

    /**
     * Gets the shipping address of the user.
     *
     * @return the shipping address
     */
    public String getShippingAddress() {
        return this.shippingAddress;
    }

    /**
     * Sets the shipping address of the user.
     *
     * @param shippingAddress the shipping address
     */
    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    /**
     * Gets the payment method of the user.
     *
     * @return the payment method
     */
    public Integer getPaymentMethod() {
        return this.paymentMethod;
    }

    /**
     * Sets the payment method of the user.
     *
     * @param paymentMethod the payment method
     */
    public void setPaymentMethod(Integer paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    /**
     * Gets the account type of the user.
     *
     * @return the account type
     */
    public String getAccountType() {
        return this.accountType;
    }

    /**
     * Gets the email of the user.
     *
     * @return the email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * Gets the last name of the user.
     *
     * @return the last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the last name of the user.
     *
     * @param lastName the last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
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
}
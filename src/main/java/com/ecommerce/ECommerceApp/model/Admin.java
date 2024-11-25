package com.ecommerce.ECommerceApp.model;

/**
 * Represents an admin in the e-commerce application.
 */
public class Admin extends User {

    private String adminLevel;

    /**
     * Constructs a new Admin with the specified details.
     *
     * @param firstName the first name of the admin
     * @param lastName the last name of the admin
     * @param phoneNumber the phone number of the admin
     * @param email the email address of the admin
     * @param password the password of the admin
     * @param mailingAddress the mailing address of the admin
     * @param shippingAddress the shipping address of the admin
     * @param paymentMethod the payment method of the admin
     * @param accountType the account type of the admin
     * @param adminLevel the admin level of the admin
     */
    public Admin(Boolean active, String firstName, String lastName, String email, String password, String mailingAddress, String shippingAddress, Integer paymentMethod, String accountType, String adminLevel) {
        super(active, firstName, lastName, email, password, mailingAddress, shippingAddress,
                paymentMethod, accountType);
        this.adminLevel = adminLevel;
    }

    /**
     * Gets the admin level of the admin.
     *
     * @return the admin level
     */
    public String getAdminLevel() {
        return adminLevel;
    }

    /**
     * Sets the admin level of the admin.
     *
     * @param adminLevel the new admin level
     */
    public void setAdminLevel(String adminLevel) {
        this.adminLevel = adminLevel;
    }
}
package com.ecommerce.ECommerceApp.model;

import java.util.regex.Pattern;

/**
 * Represents an email address in the e-commerce application.
 */
public class Email {
    private String emailAddress;

    // regex for email
    private static final String EMAIL_REGEX =
        "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$";
    // use regex
    private static final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);

    /**
     * Constructs a new Email with the specified email address.
     *
     * @param emailAddress the email address
     * @throws IllegalArgumentException if the email address is invalid
     */
    public Email(String emailAddress) {
        if (isValid(emailAddress)) {
            this.emailAddress = emailAddress;
        } else {
            throw new IllegalArgumentException("Invalid email address: " + emailAddress);
        }
    }

    /**
     * Sets the email address.
     *
     * @param emailAddress the email address
     * @throws IllegalArgumentException if the email address is invalid
     */
    public void setEmailAddress(String emailAddress) {
        if (isValid(emailAddress)) {
            this.emailAddress = emailAddress;
        } else {
            throw new IllegalArgumentException("Invalid email address: " + emailAddress);
        }
    }

    /**
     * Gets the email address.
     *
     * @return the email address
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Validates the email address.
     *
     * @param email the email address to validate
     * @return true if the email address is valid, false otherwise
     */
    public static boolean isValid(String email) {
        return EMAIL_PATTERN.matcher(email).matches();
    }
}
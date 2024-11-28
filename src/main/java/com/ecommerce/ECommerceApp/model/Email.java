package com.ecommerce.ECommerceApp.model;

import java.util.regex.Pattern;
import javax.persistence.Embeddable;
/**
 * Represents an email address in the e-commerce application.
 */
@Embeddable
public class Email {
    private String emailAddress;

    // regex for email
    private static final String EMAIL_REGEX =
        "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$";
    // use regex
    private static final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);
    /**
     * Default constructor required by JPA.
     */
    protected Email() {}
    /**
     * Constructs a new Email with the specified email address.
     *
     * @param emailAddress the email address
     * @throws IllegalArgumentException if the email address is invalid
     */
    public Email(String emailAddress) {
        if (emailAddress == null || emailAddress.isBlank()) {
            throw new IllegalArgumentException("Email address cannot be null or empty");
        }
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
    public String getEmail() {
        return emailAddress;
    }

    @Override
    public String toString() {
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
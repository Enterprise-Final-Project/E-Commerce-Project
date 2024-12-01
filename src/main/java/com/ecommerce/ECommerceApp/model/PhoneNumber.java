package com.ecommerce.ECommerceApp.model;

import java.util.regex.Pattern;
import javax.persistence.Embeddable;
/**
 * Represents a phone number in the e-commerce application.
 */
@Embeddable
public class PhoneNumber {
    private String phoneNumber;

    // phone number regex
    private static final String PHONE_REGEX =
            "^(\\+\\d{1,3}[- ]?)?\\(?\\d{3}\\)?[- .]?\\d{3}[- .]?\\d{4}$";
    private static final Pattern PHONE_PATTERN = Pattern.compile(PHONE_REGEX);
    /**
     * Default constructor required by JPA.
     */
    protected PhoneNumber() {}
    /**
     * Constructs a new PhoneNumber with the specified phone number.
     *
     * @param phoneNumber the phone number
     * @throws IllegalArgumentException if the phone number is invalid
     */
    public PhoneNumber(String phoneNumber) {
        if (isValid(phoneNumber)) {
            this.phoneNumber = phoneNumber;
        } else {
            throw new IllegalArgumentException("Invalid phone number: " + phoneNumber);
        }
    }

    /**
     * Sets the phone number.
     *
     * @param phoneNumber the phone number
     * @throws IllegalArgumentException if the phone number is invalid
     */
    public void setPhoneNumber(String phoneNumber) {
        if (isValid(phoneNumber)) {
            this.phoneNumber = phoneNumber;
        } else {
            throw new IllegalArgumentException("Invalid phone number: " + phoneNumber);
        }
    }

    /**
     * Gets the phone number.
     *
     * @return the phone number
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Validates the phone number.
     *
     * @param phoneNumber the phone number to validate
     * @return true if the phone number is valid, false otherwise
     */
    public static boolean isValid(String phoneNumber) {
        return PHONE_PATTERN.matcher(phoneNumber).matches();
    }
}
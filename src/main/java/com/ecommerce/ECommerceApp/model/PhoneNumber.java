package com.ecommerce.ECommerceApp.model;
import java.util.regex.Pattern;

public class PhoneNumber {
    private String phoneNumber;

    // phone number regex
    private static final String PHONE_REGEX =
            "^(\\+\\d{1,3}[- ]?)?\\(?\\d{3}\\)?[- .]?\\d{3}[- .]?\\d{4}$";
    private static final Pattern PHONE_PATTERN = Pattern.compile(PHONE_REGEX);

    // Constructor
    public PhoneNumber(String phoneNumber) {
        setPhoneNumber(phoneNumber); // Use the setter for validation and assignment
    }

    // Setter
    public void setPhoneNumber(String phoneNumber) {
        if (isValid(phoneNumber)) {
            this.phoneNumber = phoneNumber;
        } else {
            throw new IllegalArgumentException("Invalid phone number: " + phoneNumber);
        }
    }

    // Getter
    public String getPhoneNumber() {
        return phoneNumber;
    }
    // validate
    public static boolean isValid(String phoneNumber) {
        return PHONE_PATTERN.matcher(phoneNumber).matches();
    }



}

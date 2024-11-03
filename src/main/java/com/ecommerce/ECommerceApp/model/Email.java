package com.ecommerce.ECommerceApp.model;
import com.ecommerce.ECommerceApp.exception.InvalidEmailException;

import java.util.regex.Pattern;

public class Email
{
    private String emailAddress;

    // regex for email
    private static final String EMAIL_REGEX =
        "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$";
    //use regex
    private static final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);

    //constructor
    public Email(String emailAddress) {
        setEmailAddress(emailAddress);
    }

    // setter
    public void setEmailAddress(String emailAddress) {
        if (isValid(emailAddress)) {
            this.emailAddress = emailAddress;
        } else {
            throw new InvalidEmailException("Invalid email address: " + emailAddress);
        }
    }
    //getter
    public String getEmailAddress() {
        return emailAddress;
    }

    // validate email
    public static boolean isValid(String email) {
        return EMAIL_PATTERN.matcher(email).matches();
    }
}

package com.ecommerce.ECommerceApp.exception;

/**
 * Throws exception when invalide phone number is provided.
 */
public class InvalidPhoneNumberException extends RuntimeException {
    public InvalidPhoneNumberException(String message) {
        super(message);
    }
}

package com.ecommerce.ECommerceApp.exception;

/**
 * Throws an exception error when invalid email address is provided.
 */
public class InvalidEmailException extends RuntimeException {
    public InvalidEmailException(String message) {
        super(message);
    }
}

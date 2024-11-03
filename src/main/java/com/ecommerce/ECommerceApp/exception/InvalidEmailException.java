package com.ecommerce.ECommerceApp.exception;

public class InvalidEmailException extends RuntimeException {
    public InvalidEmailException(String message) {
        super(message);
    }
}

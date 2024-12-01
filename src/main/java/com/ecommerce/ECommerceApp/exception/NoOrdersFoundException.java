package com.ecommerce.ECommerceApp.exception;

//check is this best practice?
public class NoOrdersFoundException extends RuntimeException {
        public NoOrdersFoundException(String message) {
            super(message);
        }
    }


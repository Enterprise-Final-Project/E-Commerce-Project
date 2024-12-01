package com.ecommerce.ECommerceApp.model;

/**
 * Enum representing different types of accounts in the e-commerce application.
 */
public enum AccountType {
    USER("ROLE_USER"),
    SUPPLIER_USER("ROLE_SUPPLIER_USER"),
    SUPPLIER_ADMIN("ROLE_SUPPLIER_ADMIN"),
    ADMIN("ROLE_ADMIN");

    private final String roleName;

    AccountType(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleName() {
        return roleName;
    }
    }

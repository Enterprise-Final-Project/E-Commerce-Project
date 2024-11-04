package com.ecommerce.ECommerceApp.model;

public class Admin extends User {
    public Admin(String firstName, String lastName, PhoneNumber phoneNumber, Email email, String password, Address mailingAddress, Address shippingAddress, Payment paymentMethod, AccountType accountType, String adminLevel) {
        super(firstName, lastName, phoneNumber, email, password, mailingAddress, shippingAddress, paymentMethod, accountType);
    }
}
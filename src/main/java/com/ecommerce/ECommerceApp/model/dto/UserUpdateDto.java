package com.ecommerce.ECommerceApp.model.dto;

import com.ecommerce.ECommerceApp.model.*;

public class UserUpdateDto {
    private String firstName;
    private String lastName;
    private PhoneNumber phoneNumber;
    private Email email;
    private String password;
    private Address mailingAddress;
    private Address shippingAddress;
    private Payment paymentMethod;
    private AccountType accountType;

    // Constructors
    public UserUpdateDto() {
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    public Email getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public Address getMailingAddress() {
        return mailingAddress;
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public Payment getPaymentMethod() {
        return paymentMethod;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    // Setters
    public void setFirstName(String firstName) {
        if (firstName != null && !firstName.isBlank()) {
            this.firstName = firstName.trim();
        }
    }

    public void setLastName(String lastName) {
        if (lastName != null && !lastName.isBlank()) {
            this.lastName = lastName.trim();
        }
    }

    public void setPhoneNumber(PhoneNumber phoneNumber) {
//        if (phoneNumber != null && !phoneNumber.isBlank()) {
//            this.phoneNumber = phoneNumber.trim();
//        }
        if (phoneNumber != null) {
            this.phoneNumber = phoneNumber;
        }
    }

    public void setEmail(Email email) {
//        if (email != null && !email.isBlank()) {
//            this.email = email.trim();
//        }
        if (email != null ) {
            this.email = email;
        }
    }

    public void setPassword(String password) {
        if (password != null && !password.isBlank()) {
            this.password = password.trim();
        }
    }

    public void setMailingAddress(Address mailingAddress) {
//        if (mailingAddress != null && !mailingAddress.isBlank()) {
//            this.mailingAddress = mailingAddress.trim();
//        }
        if (mailingAddress != null) {
            this.mailingAddress = mailingAddress;
        }
    }

    public void setShippingAddress(Address shippingAddress) {
//        if (shippingAddress != null && !shippingAddress.isBlank()) {
//            this.shippingAddress = shippingAddress.trim();
//        }
        if (shippingAddress != null) {
            this.shippingAddress = shippingAddress;
        }
    }

    public void setPaymentMethod(Payment paymentMethod) {
//        if (paymentMethod != null && !paymentMethod.isBlank()) {
//            this.paymentMethod = paymentMethod.trim();
//        }
        if (paymentMethod != null) {
            this.paymentMethod = paymentMethod;
        }
    }

    public void setAccountType(AccountType accountType) {
        if (accountType != null) {
            this.accountType = accountType;
        }
    }
}
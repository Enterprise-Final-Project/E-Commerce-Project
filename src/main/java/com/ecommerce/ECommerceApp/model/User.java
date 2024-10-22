package com.ecommerce.ECommerceApp.model;
import java.util.UUID;

public class User {

    //db details
    public String userID;
    public Boolean active;

    //user account details
    public String firstName;
    public String lastName;
    public PhoneNumber phoneNumber;
    public Email email;
    private String password;


    //payment details
    public Address mailingAddress;
    public Address shippingAddress;
    public Payment paymentMethod;
    public AccountType accountType;

    //constructor
    public User(String firstName, String lastName, PhoneNumber phoneNumber, Email email, String password, Address mailingAddress, Address shippingAddress, Payment paymentMethod, AccountType accountType){
        this.userID = generateUniqueID();
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.password = password;

        this.mailingAddress = mailingAddress;
        this.shippingAddress = shippingAddress;
        this.paymentMethod = paymentMethod;
        this.accountType = accountType;

    }

    //getters
    public String getUserID(){
        return this.userID;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getFullName(){
        return this.firstName + " " + this.lastName;
    }

    //setter
    private void setNewPassword(String password){
        this.password = password;
    }
    //database handler
    private void setActive(boolean active){
        this.active = active;
    }
    //updates information for the field for the HTML class
    private void updateInformation(String firstName, String lastName, PhoneNumber phoneNumber, Email email, String password, Address mailingAddress, Address shippingAddress, Payment paymentMethod, AccountType accountType){
        //if fields are left blank, they will not update
        if (firstName != null && !firstName.isBlank()) {
            this.firstName = firstName;
        }
        if (lastName != null && !lastName.isBlank()) {
            this.lastName = lastName;
        }
        if (phoneNumber != null) {
            this.phoneNumber = phoneNumber;
        }
        if (email != null) {
            this.email = email;
        }
        if (password != null && !password.isBlank()) {
            this.password = password;
        }
        if (mailingAddress != null) {
            this.mailingAddress = mailingAddress;
        }
        if (shippingAddress != null) {
            this.shippingAddress = shippingAddress;
        }
        if (paymentMethod != null) {
            this.paymentMethod = paymentMethod;
        }
        if (accountType != null) {
            this.accountType = accountType;
        }
    }

    // generate a unique UUID for the db
    private String generateUniqueID() {
        return UUID.randomUUID().toString();
    }

}

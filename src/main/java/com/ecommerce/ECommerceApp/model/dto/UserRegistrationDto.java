package com.ecommerce.ECommerceApp.model.dto;
import com.ecommerce.ECommerceApp.model.Email;
import com.ecommerce.ECommerceApp.model.AccountType;

public class UserRegistrationDto {
    private String firstName;
    private String lastName;
    private Email email;
    private String password;
    private AccountType accountType;

    // Constructors
    public UserRegistrationDto() {}

    // getters
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public Email getEmail(){
    return email;
    }
    public String getPassword(){
        return password;
    }
    public AccountType getAccountType(){
        return accountType;
    }

    //setters
    public void setFirstName(){}
    public void setLastName() {}
    public void setEmail() {}
    public void setPassword() {}
    public void setAccountType() {}
}

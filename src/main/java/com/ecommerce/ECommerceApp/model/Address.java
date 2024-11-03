package com.ecommerce.ECommerceApp.model;

/**
 * Represents street, city, state, zip code, and country.
 * Utilized for mailing & shipping information in the ECommerce system.
 */
public class Address {
    private String street;
    private String city;
    private String state;
    private String zipCode;
    private String country;

    // Constructor
    public Address(String street, String city, String state, String postalCode, String country) {
        setStreet(street);
        setCity(city);
        setState(state);
        setZipCode(postalCode);
        setCountry(country);
    }

    // Getters and Setters with validation
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String postalCode) {
        this.zipCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    // Override toString to display the address for Address fields
    @Override
    public String toString() {
        return street + ", " + city + ", " + state + " " + zipCode + ", " + country;
    }
}

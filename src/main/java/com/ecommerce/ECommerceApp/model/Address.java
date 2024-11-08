package com.ecommerce.ECommerceApp.model;

/**
 * Represents an address in the e-commerce application.
 */
public class Address {
    private String street;
    private String city;
    private String state;
    private String zipCode;
    private String country;

    /**
     * Constructs a new Address with the specified details.
     *
     * @param street the street address
     * @param city the city
     * @param state the state
     * @param postalCode the postal code
     * @param country the country
     */
    public Address(String street, String city, String state, String postalCode, String country) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = postalCode;
        this.country = country;
    }

    /**
     * Gets the street address.
     *
     * @return the street address
     */
    public String getStreet() {
        return street;
    }

    /**
     * Sets the street address.
     *
     * @param street the street address
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * Gets the city.
     *
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the city.
     *
     * @param city the city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Gets the state.
     *
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the state.
     *
     * @param state the state
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Gets the postal code.
     *
     * @return the postal code
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * Sets the postal code.
     *
     * @param postalCode the postal code
     */
    public void setZipCode(String postalCode) {
        this.zipCode = postalCode;
    }

    /**
     * Gets the country.
     *
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the country.
     *
     * @param country the country
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * Returns a string representation of the address.
     *
     * @return a string representation of the address
     */
    @Override
    public String toString() {
        return street + ", " + city + ", " + state + " " + zipCode + ", " + country;
    }
}
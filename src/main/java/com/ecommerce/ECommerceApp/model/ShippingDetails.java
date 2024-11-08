package com.ecommerce.ECommerceApp.model;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

/**
 * Represents the shipping details in the e-commerce application.
 */
@Component
public class ShippingDetails {
    private String shippingAddress;
    private LocalDateTime deliveryDate;
    private ShippingType shippingType;

    /**
     * Gets the shipping address.
     *
     * @return the shipping address
     */
    public String getShippingAddress() {
        return shippingAddress;
    }

    /**
     * Sets the shipping address.
     *
     * @param shippingAddress the shipping address
     */
    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    /**
     * Gets the delivery date.
     *
     * @return the delivery date
     */
    public LocalDateTime getDeliveryDate() {
        return deliveryDate;
    }

    /**
     * Sets the delivery date.
     *
     * @param deliveryDate the delivery date
     */
    public void setDeliveryDate(LocalDateTime deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    /**
     * Gets the shipping type.
     *
     * @return the shipping type
     */
    public ShippingType getShippingType() {
        return shippingType;
    }

    /**
     * Sets the shipping type.
     *
     * @param shippingType the shipping type
     */
    public void setShippingType(ShippingType shippingType) {
        this.shippingType = shippingType;
    }
}
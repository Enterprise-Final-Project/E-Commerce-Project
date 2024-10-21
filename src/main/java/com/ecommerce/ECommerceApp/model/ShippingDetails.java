package com.ecommerce.ECommerceApp.model;

import org.springframework.stereotype.Component;
import java.time.LocalDateTime;

@Component
public class ShippingDetails {
    private String shippingAddress;
    private LocalDateTime deliveryDate;
    private ShippingType shippingType;

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public LocalDateTime getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDateTime deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public ShippingType getShippingType() {
        return shippingType;
    }

    public void setShippingType(ShippingType shippingType) {
        this.shippingType = shippingType;
    }
}
package com.ecommerce.ECommerceApp.model;

import java.time.LocalDateTime;

public interface ShippingDetails {
    String getShippingAddress();
    void setShippingAddress(String shippingAddress);
    
    LocalDateTime getDeliveryDate();
    void setDeliveryDate(LocalDateTime deliveryDate);
    
    ShippingType getShippingType();
    void setShippingType(ShippingType shippingType);
}

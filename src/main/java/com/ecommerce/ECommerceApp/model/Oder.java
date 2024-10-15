package com.ecommerce.ECommerceApp.model;

public interface Order{
    int getOrderID();
    void setOrderID(int orderID);

    dateTime getOrderDate();
    void setOrderDate(dateTime orderDate);

    int getUserID();
    void setUserID(int userID);

    float getTotalAmount();
    void setTotalAmount(float totalAmount);
}
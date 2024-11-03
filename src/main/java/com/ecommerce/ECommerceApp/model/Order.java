package com.ecommerce.ECommerceApp.model;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class Order{
    private int orderID;
    private LocalDateTime orderDate;
    private int userID;
    private float totalAmount;

    public Order(int orderID, LocalDateTime orderDate, int userID, float totalAmount) {
        this.orderID = orderID;
        this.orderDate = orderDate;
        this.userID = userID;
        this.totalAmount = totalAmount;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public int getUserID() {
        return userID;
    }   

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public float getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(float totalAmount) {
        this.totalAmount = totalAmount;
    }


}
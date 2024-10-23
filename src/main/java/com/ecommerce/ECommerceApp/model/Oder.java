package com.ecommerce.ECommerceApp.model;

@Component
public class Order{
    private int orderID;
    private dateTime orderDate;
    private int userID;
    private float totalAmount;

    public Order(int orderID, dateTime orderDate, int userID, float totalAmount) {
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

    public dateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(dateTime orderDate) {
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
package com.ecommerce.ECommerceApp.model;
import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Represents an order in the e-commerce application.
 */
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @OneToOne
    @JoinColumn(name = "cart_id", nullable = false)
    private Cart cart;

    private LocalDateTime orderDate;
    private int userID;
    private BigDecimal totalAmount;
    private String status;

    // Default constructor
    public Order() {}

    /**
     * Constructs a new Order with the specified details.
     *
     * @param orderID the order ID
     * @param orderDate the date and time of the order
     * @param userID the user ID associated with the order
     * @param totalAmount the total amount of the order
     */
    public Order(int orderID, LocalDateTime orderDate, int userID, BigDecimal totalAmount) {
        this.orderID = orderID;
        this.orderDate = orderDate;
        this.userID = userID;
        this.totalAmount = totalAmount;
    }

    /**
     * Gets the order ID.
     *
     * @return the order ID
     */
    public int getOrderID() {
        return orderID;
    }

    /**
     * Sets the order ID.
     *
     * @param orderID the order ID
     */
    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    /**
     * Gets the date and time of the order.
     *
     * @return the date and time of the order
     */
    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    /**
     * Sets the date and time of the order.
     *
     * @param orderDate the date and time of the order
     */
    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    /**
     * Gets the user ID associated with the order.
     *
     * @return the user ID associated with the order
     */
    public int getUserID() {
        return userID;
    }

    /**
     * Sets the user ID associated with the order.
     *
     * @param userID the user ID associated with the order
     */
    public void setUserID(int userID) {
        this.userID = userID;
    }

    /**
     * Gets the total amount of the order.
     *
     * @return the total amount of the order
     */
    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets the total amount of the order.
     *
     * @param totalAmount the total amount of the order
     */
    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public Cart getCart() {
        return cart;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status;}
    }
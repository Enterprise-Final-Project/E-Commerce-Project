package com.ecommerce.ECommerceApp.model;

import org.springframework.stereotype.Component;

import javax.persistence.*;

/**
 * Represents an item in the shopping cart.
 */
@Entity
@Component
public class CartItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "productID")
    private Product product;
    private int quantity;
    private double price;

    /**
     * Gets the product ID.
     *
     * @return the product ID
     */
    public int getProductID() {
        return product.getProductID();
    }

    /**
     * Sets the product ID.
     *
     * @param productID the product ID
     */
    public void setProductID(int productID) {
        this.product.setProductID(productID);
    }

    /**
     * Gets the quantity of the product.
     *
     * @return the quantity of the product
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Sets the quantity of the product.
     *
     * @param quantity the quantity of the product
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * Gets the price of the product.
     *
     * @return the price of the product
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets the price of the product.
     *
     * @param price the price of the product
     */
    public void setPrice(double price) {
        this.price = price;
    }
}
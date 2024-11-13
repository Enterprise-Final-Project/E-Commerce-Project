package com.ecommerce.ECommerceApp.model;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

/**
 * Represents an item in the shopping cart.
 */
@Component
public class CartItem {
    private int productID;
    private int quantity;
    private BigDecimal price;

    /**
     * Gets the product ID.
     *
     * @return the product ID
     */
    public int getProductID() {
        return productID;
    }

    /**
     * Sets the product ID.
     *
     * @param productID the product ID
     */
    public void setProductID(int productID) {
        this.productID = productID;
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
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * Sets the price of the product.
     *
     * @param price the price of the product
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
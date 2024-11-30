package com.ecommerce.ECommerceApp.model;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 * Represents a seller in the e-commerce application.
 */
@Component
public class Seller {

    private final List<Integer> productIDList = new ArrayList<>();
    private final List<Integer> orderFulfillment = new ArrayList<>();

    /**
     * Gets the list of product IDs associated with the seller.
     *
     * @return the list of product IDs
     */
    public List<Integer> getProductIDList() {
        return productIDList;
    }

    /**
     * Adds a product ID to the seller's list of products.
     *
     * @param productID the product ID to add
     */
    public void addProduct(int productID) {
        productIDList.add(productID);
    }

    /**
     * Removes a product ID from the seller's list of products.
     *
     * @param productID the product ID to remove
     */
    public void removeProduct(int productID) {
        productIDList.remove(Integer.valueOf(productID));
    }

    /**
     * Gets the list of order IDs associated with the seller's order fulfillment.
     *
     * @return the list of order IDs
     */
    public List<Integer> getOrderFulfillmentList() {
        return orderFulfillment;
    }

    /**
     * Adds an order ID to the seller's list of order fulfillments.
     *
     * @param orderID the order ID to add
     */
    public void addOrder(int orderID) {
        orderFulfillment.add(orderID);
    }

    /**
     * Removes an order ID from the seller's list of order fulfillments.
     *
     * @param orderID the order ID to remove
     */
    public void removeOrder(int orderID) {
        orderFulfillment.remove(Integer.valueOf(orderID));
    }
}
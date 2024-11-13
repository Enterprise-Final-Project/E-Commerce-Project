package com.ecommerce.ECommerceApp.model;

import java.util.List;

import org.springframework.stereotype.Component;

/**
 * Represents a buyer in the e-commerce application.
 */
@Component
public class Buyer {
    private List<Integer> cart;
    private List<Integer> orderHistory;
    private List<Integer> wishList;

    /**
     * Gets the list of product IDs in the buyer's cart.
     * 
     * @return the cart as a list of product IDs
     */
    public List<Integer> getCart(){
        return cart;
    }

    /**
     * Adds a product to the buyer's cart.
     * 
     * @param productID the ID of the product to add
     */
    public void addToCart(int productID) {
        cart.add(productID);
    }
    
    /**
     * Removes a product from the buyer's cart.
     * 
     * @param productID the ID of the product to remove
     */
    public void removeFromCart(int productID) {
        cart.remove(Integer.valueOf(productID));
    }

    /**
     * Gets the list of order IDs in the buyer's order history.
     * 
     * @return the order history as a list of order IDs
     */
    public List<Integer> getOrderHistory(){
        return orderHistory;
    }

    /**
     * Adds an order to the buyer's order history.
     * 
     * @param orderID the ID of the order to add
     */
    public void addToOrderHistory(int orderID) {
        orderHistory.add(orderID);
    }

    /**
     * Removes an order from the buyer's order history.
     * 
     * @param orderID the ID of the order to remove
     */
    public void removeFromOrderHistory(int orderID) {
        orderHistory.remove(Integer.valueOf(orderID));
    }

    /**
     * Gets the list of product IDs in the buyer's wish list.
     * 
     * @return the wish list as a list of product IDs
     */
    public List<Integer> getWishList(){
        return wishList;
    }

    /**
     * Adds a product to the buyer's wish list.
     * 
     * @param productID the ID of the product to add
     */
    public void addToWishList(int productID) {
        wishList.add(productID);
    }

    /**
     * Removes a product from the buyer's wish list.
     * 
     * @param productID the ID of the product to remove
     */
    public void removeFromWishList(int productID) {
        wishList.remove(Integer.valueOf(productID));
    }
}

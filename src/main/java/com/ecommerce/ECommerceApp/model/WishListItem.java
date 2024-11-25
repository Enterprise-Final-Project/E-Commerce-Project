package com.ecommerce.ECommerceApp.model;


import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Component
@Table(name="wishlist_Item")
public class WishListItem {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Itemid;

    @ManyToOne
    @JoinColumn(name = "productID", referencedColumnName = "id")
    private Product product;
    private int quantity;
    private double price;


    public Product getProduct() {
        return product;
    }

    /**
     * Sets the product ID.
     *
     * @param product the product
     */
    public void setProduct(Product product) {
        this.product = product;
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

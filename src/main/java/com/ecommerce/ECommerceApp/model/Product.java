package com.ecommerce.ECommerceApp.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Represents a product in the e-commerce application.
 */
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private double price;
    private String deliveryTime;
    private int stock;

    @Enumerated(EnumType.STRING)
    private Category category;

    @Enumerated(EnumType.STRING)
    private Category.Subcategory subcategory;

    public Product() {
    }

    /**
     * Constructs a new Product with the specified details.
     *
     * @param productID the product ID
     * @param productName the product name
     * @param productDescription the product description
     * @param productPrice the product price
     * @param productStock the product stock
     * @param productCategory the product category
     * @param productSubCategory the product subcategory
     * @param deliveryTime the delivery time
     */
    public Product(int productID, String productName, String productDescription, float productPrice, int productStock,
            Category productCategory, Category.Subcategory productSubCategory, String deliveryTime) {
        this.id = Long.valueOf(productID);
        this.name = productName;
        this.description = productDescription;
        this.price = productPrice;
        this.stock = productStock;
        this.category = productCategory;
        this.subcategory = productSubCategory;
        this.deliveryTime = deliveryTime;
    }

    /**
     * Gets the product ID as an Long.
     *
     * @return the product ID as an Long
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the product ID as an Long.
     *
     * @param id the product ID as an Long
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Gets the product name.
     *
     * @return the product name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the product name.
     *
     * @param name the product name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the product description.
     *
     * @return the product description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the product description.
     *
     * @param description the product description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Gets the product price as a float.
     *
     * @return the product price as a float
     */
    public float getPrice() {
        return (float) price;
    }

    /**
     * Sets the product price as a float.
     *
     * @param price the product price as a float
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * Gets the delivery time.
     *
     * @return the delivery time
     */
    public String getDeliveryTime() {
        return deliveryTime;
    }

    /**
     * Sets the delivery time.
     *
     * @param deliveryTime the delivery time
     */
    public void setDeliveryTime(String deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    /**
     * Gets the product stock.
     *
     * @return the product stock
     */
    public int getStock() {
        return stock;
    }

    /**
     * Sets the product stock.
     *
     * @param stock the product stock
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

    /**
     * Gets the product category.
     *
     * @return the product category
     */
    public Category getCategory() {
        return category;
    }

    /**
     * Sets the product category.
     *
     * @param category the product category
     */
    public void setCategory(Category category) {
        this.category = category;
    }

    /**
     * Gets the product subcategory.
     *
     * @return the product subcategory
     */
    public Category.Subcategory getSubCategory() {
        return subcategory;
    }

    /**
     * Sets the product subcategory.
     *
     * @param subcategory the product subcategory
     */
    public void setSubCategory(Category.Subcategory subcategory) {
        this.subcategory = subcategory;
    }
}
package com.ecommerce.ECommerceApp.model;

import javax.persistence.Entity;
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

    private String category;
    private String subcategory;

    /**
     * Default constructor.
     */
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
     */
    public Product(int productID, String productName, String productDescription, float productPrice, int productStock,
            String productCategory, String productSubCategory) {
        this.id = Long.valueOf(productID);
        this.name = productName;
        this.description = productDescription;
        this.price = productPrice;
        this.stock = productStock;
        this.category = productCategory;
        this.subcategory = productSubCategory;
    }

    /**
     * Gets the product ID as an integer.
     *
     * @return the product ID as an integer
     */
    public int getProductID() {
        return id.intValue();
    }

    /**
     * Sets the product ID as an integer.
     *
     * @param id the product ID as an integer
     */
    public void setProductID(int id) {
        this.id = Long.valueOf(id);
    }

    /**
     * Gets the product name.
     *
     * @return the product name
     */
    public String getProductName() {
        return name;
    }

    /**
     * Sets the product name.
     *
     * @param name the product name
     */
    public void setProductName(String name) {
        this.name = name;
    }

    /**
     * Gets the product description.
     *
     * @return the product description
     */
    public String getProductDescription() {
        return description;
    }

    /**
     * Sets the product description.
     *
     * @param description the product description
     */
    public void setProductDescription(String description) {
        this.description = description;
    }

    /**
     * Gets the product price as a float.
     *
     * @return the product price as a float
     */
    public float getProductPrice() {
        return (float) price;
    }

    /**
     * Sets the product price as a float.
     *
     * @param price the product price as a float
     */
    public void setProductPrice(float price) {
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
    public int getProductStock() {
        return stock;
    }

    /**
     * Sets the product stock.
     *
     * @param stock the product stock
     */
    public void setProductStock(int stock) {
        this.stock = stock;
    }

    /**
     * Gets the product subcategory.
     *
     * @return the product subcategory
     */
    public String getSubCategory() {
        return subcategory;
    }

    /**
     * Sets the product subcategory.
     *
     * @param subcategory the product subcategory
     */
    public void setSubCategory(String subcategory) {
        this.subcategory = subcategory;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSubcategory() {
        return subcategory;
    }

    public void setSubcategory(String subcategory) {
        this.subcategory = subcategory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
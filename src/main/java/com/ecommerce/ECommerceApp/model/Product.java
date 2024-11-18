package com.ecommerce.ECommerceApp.model;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

/**
 * Represents a product in the e-commerce application.
 */
@Component
public class Product {
    private int productID;
    private String productName;
    private String productDescription;
    private BigDecimal productPrice;
    private int productStock;
    private Category productCategory;
    private Category.Subcategory productSubCategory;
    private String[] productImage;

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
     * @param productImage the product images
     */
    public Product(int productID, String productName, String productDescription, float productPrice, int productStock,
                   Category productCategory, Category.Subcategory productSubCategory, String[] productImage) {
        this.productID = productID;
        this.productName = productName;
        this.productDescription = productDescription;
        this.productPrice = productPrice;
        this.productStock = productStock;
        this.productCategory = productCategory;
        this.productSubCategory = productSubCategory;
        this.productImage = productImage;
    }

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
     * Gets the product name.
     *
     * @return the product name
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Sets the product name.
     *
     * @param productName the product name
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * Gets the product description.
     *
     * @return the product description
     */
    public String getProductDescription() {
        return productDescription;
    }

    /**
     * Sets the product description.
     *
     * @param productDescription the product description
     */
    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    /**
     * Gets the product price.
     *
     * @return the product price
     */
    public BigDecimal getProductPrice() {
        return productPrice;
    }

    /**
     * Sets the product price.
     *
     * @param productPrice the product price
     */
    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    /**
     * Gets the product stock.
     *
     * @return the product stock
     */
    public int getProductStock() {
        return productStock;
    }

    /**
     * Sets the product stock.
     *
     * @param productStock the product stock
     */
    public void setProductStock(int productStock) {
        this.productStock = productStock;
    }

    /**
     * Gets the product category.
     *
     * @return the product category
     */
    public Category getProductCategory() {
        return productCategory;
    }

    /**
     * Sets the product category.
     *
     * @param productCategory the product category
     */
    public void setProductCategory(Category productCategory) {
        this.productCategory = productCategory;
    }

    /**
     * Gets the product subcategory.
     *
     * @return the product subcategory
     */
    public Category.Subcategory getProductSubCategory() {
        return productSubCategory;
    }

    /**
     * Sets the product subcategory.
     *
     * @param productSubCategory the product subcategory
     */
    public void setProductSubCategory(Category.Subcategory productSubCategory) {
        this.productSubCategory = productSubCategory;
    }

    /**
     * Gets the product images.
     *
     * @return the product images
     */
    public String[] getProductImage() {
        return productImage;
    }

    /**
     * Sets the product images.
     *
     * @param productImage the product images
     */
    public void setProductImage(String[] productImage) {
        this.productImage = productImage;
    }
}
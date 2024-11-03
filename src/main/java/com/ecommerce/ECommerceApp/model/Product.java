package com.ecommerce.ECommerceApp.model;

import org.springframework.stereotype.Component;

import java.nio.file.Path;
import java.util.List;

/**
 * Represents a product in the ECommerce system.
 * Contains: productID, productName, productDescription, ProductPrice, productStock, productCategory, productSubcategory
 */
@Component
public class Product {
    private int productID;
    private String productName;
    private String productDescription;
    private float productPrice;
    private int productStock;
    private Category productCategory;
    private Category productSubCategory;
    private List<Path> productImage;

    /**
     * Grabs associated productID
     * @return the productID grabbed
     */
    public int getProductID() {
        return productID;
    }

    /**
     * Sets the productID associated with Product
     * @param productID the productID to be set
     */
    public void setProductID(int productID) {
        this.productID = productID;
    }

    /**
     * Grab associated product name
     * @return the product name associated
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Sets the new product name.
     * @param productName the new name to be used for the product
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * Get the current products description
     * @return the description found in the product
     */
    public String getProductDescription() {
        return productDescription;
    }

    /**
     * Replaces or creates product description associated with a product
     * @param productDescription the new or to be created name for the product description
     */
    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    /**
     * Grab the current product's price.
     * @return the product's price found
     */
    public float getProductPrice() {
        return productPrice;
    }

    /**
     * Sets the price associated with the product.
     * @param productPrice the price to be made or modified
     */
    public void setProductPrice(float productPrice) {
        this.productPrice = productPrice;
    }

    /**
     * Grabs current amount of product in stock.
     * @return the amount found of a product
     */
    public int getProductStock() {
        return productStock;
    }

    /**
     * Sets/Replaces the associated amount of product in stock
     * @param productStock the stock available of a given product
     */
    public void setProductStock(int productStock) {
        this.productStock = productStock;
    }

    /**
     * Grabs the category associated with the product
     * @return the category associated with the product
     */
    public Category getProductCategory() {
        return productCategory;
    }

    /**
     * Creates or replaces the product category associated with the product.
     * @param productCategory the category to be added from the enumerator Category
     */
    public void setProductCategory(Category productCategory) {
        this.productCategory = productCategory;
    }

    /**
     * Grabs the subcategory of a product.
     * @return the subcategory found
     */
    public Category getProductSubCategory() {
        return productSubCategory;
    }

    /**
     * Sets the subcategory of a product from the Category enumerator and its subcategories.
     * @param productSubCategory the selected subcategory to assign
     */
    public void setProductSubCategory(Category productSubCategory) {
        this.productSubCategory = productSubCategory;
    }
}

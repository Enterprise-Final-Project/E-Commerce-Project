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


    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public float getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(float productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductStock() {
        return productStock;
    }

    public void setProductStock(int productStock) {
        this.productStock = productStock;
    }

    public Category getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(Category productCategory) {
        this.productCategory = productCategory;
    }

    public Category getProductSubCategory() {
        return productSubCategory;
    }   

    public void setProductSubCategory(Category productSubCategory) {
        this.productSubCategory = productSubCategory;
    }
}

package com.ecommerce.ECommerceApp.model;

import org.springframework.stereotype.Component;

import java.nio.file.Path;
import java.util.List;

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

    public string getProductName() {
        return productName;
    }

    public void setProductName(string productName) {
        this.productName = productName;
    }

    public string getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(string productDescription) {
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

    public choice getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(choice productCategory) {
        this.productCategory = productCategory;
    }

    public choice getProductSubCategory() {
        return productSubCategory;
    }   

    public void setProductSubCategory(choice productSubCategory) {
        this.productSubCategory = productSubCategory;
    }
}

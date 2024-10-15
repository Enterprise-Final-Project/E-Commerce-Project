package com.ecommerce.ECommerceApp.model;

public interface Product {
    int getProductID();
    void setProductID(int productID);

    string getProductName();
    void setProductName(string productName);

    string getProductDescription();
    void setProductDescription(string productDescription);

    float getProductPrice();
    void setProductPrice(float productPrice);

    int getProductStock();
    void setProductStock(int productStock);

    choice getProductCategory();
    void setProductCategory(choice productCategory);

    choice getProductSubCategory();
    void setProductSubCategory(choice productSubCategory);

    array getProductImage();
    void setProductImage(image productImage);
}
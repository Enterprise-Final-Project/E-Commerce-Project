package com.ecommerce.ECommerceApp.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Unit tests for the {@link Product} class.
 */
public class ProductTest {
    private Product product;

    /**
     * Sets up the test environment before each test.
     */
    @BeforeEach
    public void setUp() {
        product = new Product(
            1, 
            "product", 
            "description", 
            3.0f, 
            1, 
            "clothing",
                    "shirt"
                    
        );
    }

    /**
     * Tests the {@link Product#getProductID()} method.
     */
    @Test
    public void testGetProductID() {
        product.setProductID(1);
        assert product.getProductID() == 1;
    }

    /**
     * Tests the {@link Product#setProductID(int)} method.
     */
    @Test
    public void testSetProductID() {
        product.setProductID(1);
        assert product.getProductID() == 1;
    }

    /**
     * Tests the {@link Product#getProductName()} method.
     */
    @Test
    public void testGetProductName() {
        product.setProductName("product");
        assert product.getProductName().equals("product");
    }

    /**
     * Tests the {@link Product#setProductName(String)} method.
     */
    @Test
    public void testSetProductName() {
        product.setProductName("product");
        assert product.getProductName().equals("product");
    }

    /**
     * Tests the {@link Product#getProductDescription()} method.
     */
    @Test
    public void testGetProductDescription() {
        product.setProductDescription("description");
        assert product.getProductDescription().equals("description");
    }

    /**
     * Tests the {@link Product#setProductDescription(String)} method.
     */
    @Test
    public void testSetProductDescription() {
        product.setProductDescription("description");
        assert product.getProductDescription().equals("description");
    }

    /**
     * Tests the {@link Product#getProductPrice()} method.
     */
    @Test
    public void testGetProductPrice() {
        product.setProductPrice(3.0f);
        assert product.getProductPrice() == 3.0f;
    }

    /**
     * Tests the {@link Product#setProductPrice(float)} method.
     */
    @Test
    public void testSetProductPrice() {
        product.setProductPrice(3.0f);
        assert product.getProductPrice() == 3.0f;
    }

    /**
     * Tests the {@link Product#getProductStock()} method.
     */
    @Test
    public void testGetProductStock() {
        product.setProductStock(1);
        assert product.getProductStock() == 1;
    }

    /**
     * Tests the {@link Product#setProductStock(int)} method.
     */
    @Test
    public void testSetProductStock() {
        product.setProductStock(1);
        assert product.getProductStock() == 1;
    }

    /**
     * Tests the {@link Product#getProductCategory()} method.
     */
    @Test
    public void testGetProductCategory() {
        product.setCategory("clothing");
        assert product.getCategory().equals("clothing");
    }

    /**
     * Tests the {@link Product#setProductCategory(Category)} method.
     */
    @Test
    public void testSetProductCategory() {
        product.setCategory("clothing");
        assert product.getCategory().equals("clothing");
    }

    /**
     * Tests the {@link Product#getProductSubCategory()} method.
     */
    @Test
    public void testGetProductSubCategory() {
        product.setSubCategory("phone");
        assert product.getSubCategory().equals("phone");
    }

    /**
     * Tests the {@link Product#setProductSubCategory(Category.Subcategory)} method.
     */
    @Test
    public void testSetProductSubCategory() {
        product.setSubCategory("phone");
        assert product.getSubCategory().equals("phone");
    }
}
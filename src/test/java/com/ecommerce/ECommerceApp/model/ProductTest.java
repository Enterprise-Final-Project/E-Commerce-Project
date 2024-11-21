package com.ecommerce.ECommerceApp.model;

import java.util.Objects;

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
            Category.ELECTRONICS, 
            Category.Subcategory.SMARTPHONE,
            "1-2 days"
        );
    }

    /**
     * Tests the {@link Product#getProductID()} method.
     */
    @Test
    public void testGetProductID() {
        product.setId(Long.valueOf(1));
        assert Objects.equals(product.getId(), Long.valueOf(1));
    }

    /**
     * Tests the {@link Product#setProductID(int)} method.
     */
    @Test
    public void testSetProductID() {
        product.setId(Long.valueOf(1));
        assert Objects.equals(product.getId(), Long.valueOf(1));
    }

    /**
     * Tests the {@link Product#getProductName()} method.
     */
    @Test
    public void testGetProductName() {
        product.setName("product");
        assert product.getName().equals("product");
    }

    /**
     * Tests the {@link Product#setProductName(String)} method.
     */
    @Test
    public void testSetProductName() {
        product.setName("product");
        assert product.getName().equals("product");
    }

    /**
     * Tests the {@link Product#getProductDescription()} method.
     */
    @Test
    public void testGetProductDescription() {
        product.setDescription("description");
        assert product.getDescription().equals("description");
    }

    /**
     * Tests the {@link Product#setProductDescription(String)} method.
     */
    @Test
    public void testSetProductDescription() {
        product.setDescription("description");
        assert product.getDescription().equals("description");
    }

    /**
     * Tests the {@link Product#getProductPrice()} method.
     */
    @Test
    public void testGetProductPrice() {
        product.setPrice(3.0f);
        assert product.getPrice() == 3.0f;
    }

    /**
     * Tests the {@link Product#setProductPrice(float)} method.
     */
    @Test
    public void testSetProductPrice() {
        product.setPrice(3.0f);
        assert product.getPrice() == 3.0f;
    }

    /**
     * Tests the {@link Product#getProductStock()} method.
     */
    @Test
    public void testGetProductStock() {
        product.setStock(1);
        assert product.getStock() == 1;
    }

    /**
     * Tests the {@link Product#setProductStock(int)} method.
     */
    @Test
    public void testSetProductStock() {
        product.setStock(1);
        assert product.getStock() == 1;
    }

    /**
     * Tests the {@link Product#getProductCategory()} method.
     */
    @Test
    public void testGetProductCategory() {
        product.setCategory(Category.ELECTRONICS);
        assert product.getCategory().equals(Category.ELECTRONICS);
    }

    /**
     * Tests the {@link Product#setProductCategory(Category)} method.
     */
    @Test
    public void testSetProductCategory() {
        product.setCategory(Category.ELECTRONICS);
        assert product.getCategory().equals(Category.ELECTRONICS);
    }

    /**
     * Tests the {@link Product#getProductSubCategory()} method.
     */
    @Test
    public void testGetProductSubCategory() {
        product.setSubCategory(Category.Subcategory.SMARTPHONE);
        assert product.getSubCategory().equals(Category.Subcategory.SMARTPHONE);
    }

    /**
     * Tests the {@link Product#setProductSubCategory(Category.Subcategory)} method.
     */
    @Test
    public void testSetProductSubCategory() {
        product.setSubCategory(Category.Subcategory.SMARTPHONE);
        assert product.getSubCategory().equals(Category.Subcategory.SMARTPHONE);
    }
}

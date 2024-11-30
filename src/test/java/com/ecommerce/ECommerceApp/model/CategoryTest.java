package com.ecommerce.ECommerceApp.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Unit tests for the {@link Category} class.
 */
public class CategoryTest {
    @Autowired
    private Category category;

    /**
     * Sets up the test environment before each test.
     */
    @BeforeEach
    public void setUp() {
        category = Category.ELECTRONICS;
    }

    /**
     * Tests the {@link Category#getSubcategories()} method for the ELECTRONICS category.
     */
    @Test
    public void testGetSubcategories() {
        assertEquals(3, category.getSubcategories().length);
    }

    /**
     * Tests the {@link Category#getSubcategories()} method for the FURNITURE category.
     */
    @Test
    public void testGetSubcategoriesForFurniture() {
        category = Category.FURNITURE;
        assertEquals(3, category.getSubcategories().length);
    }

    /**
     * Tests the {@link Category#getSubcategories()} method for the CLOTHING category.
     */
    @Test
    public void testGetSubcategoriesForClothing() {
        category = Category.CLOTHING;
        assertEquals(3, category.getSubcategories().length);
    }
}

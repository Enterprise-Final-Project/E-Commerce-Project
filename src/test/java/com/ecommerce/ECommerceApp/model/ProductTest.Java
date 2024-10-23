package com.ecommerce.ECommerceApp.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ProductTest {
    @Autowired
    private Product product;

    @Test
    public void testGetProductID() {
        product.setProductID(1);
        assertEquals(1, product.getProductID());
    }
    

    @Test
    public void testGetProductName() {
        product.setProductName("Product Name");
        assertEquals("Product Name", product.getProductName());
    }
    

    @Test
    public void testGetProductDescription() {
        product.setProductDescription("Product Description");
        assertEquals("Product Description", product.getProductDescription());
    }
    @Test
   

    @Test
    public void testGetProductPrice() {
        product.setProductPrice(3.0);
        assertEquals(3.0, product.getProductPrice());
    }

    @Test
    public void testGetProductStock() {
        product.setProductStock(10);
        assertEquals(10, product.getProductStock());
    }

    @Test
    public void testGetProductCategory() {
        product.setProductCategory("Category");
        assertEquals("Category", product.getProductCategory());
    }

    @Test
    public void testGetProductSubCategory() {
        product.setProductSubCategory("Sub Category");
        assertEquals("Sub Category", product.getProductSubCategory());
    }

    @Test
    public void testGetProductImage() {
        product.setProductImage("Image");
        assertEquals("Image", product.getProductImage());
    }


}

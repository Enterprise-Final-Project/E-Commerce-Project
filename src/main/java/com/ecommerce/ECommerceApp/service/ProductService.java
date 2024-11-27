package com.ecommerce.ECommerceApp.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.ECommerceApp.model.Product;
import com.ecommerce.ECommerceApp.repository.ProductRepository;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    private static final Logger logger = LoggerFactory.getLogger(ProductService.class);

    public List<Product> searchProducts(String query) {
        logger.info("Searching for products with query: {}", query);
        List<Product> products = productRepository.findByNameContainingIgnoreCase(query);
        if (products == null) {
            logger.warn("Product repository returned null for query: {}", query);
        } else {
            logger.info("Found products: {}", products);
        }
        logger.info("Returning products: {}", products);
        return products;
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
}
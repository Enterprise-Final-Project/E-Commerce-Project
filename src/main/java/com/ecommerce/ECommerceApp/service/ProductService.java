package com.ecommerce.ECommerceApp.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.ECommerceApp.model.Product;
import com.ecommerce.ECommerceApp.repository.ProductRepository;

/**
 * Service class for managing products.
 */
@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    private static final Logger logger = LoggerFactory.getLogger(ProductService.class);

    /**
     * Searches for products that contain the given query in their name.
     *
     * @param query the search query
     * @return a list of products that match the search query
     */
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

    /**
     * Retrieves all products.
     *
     * @return a list of all products
     */
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    /**
     * Retrieves a product by its ID.
     *
     * @param id the ID of the product
     * @return the product with the given ID, or null if not found
     */
    public Product getProductById(Long id) {
        return productRepository.findById(id).orElse(null);
    }
}
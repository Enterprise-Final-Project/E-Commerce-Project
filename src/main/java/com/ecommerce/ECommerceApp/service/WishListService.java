package com.ecommerce.ECommerceApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.ECommerceApp.model.Product;
import com.ecommerce.ECommerceApp.model.WishlistItem;
import com.ecommerce.ECommerceApp.repository.ProductRepository;
import com.ecommerce.ECommerceApp.repository.WishItemRepository;

@Service
public class WishListService {

    @Autowired
    private WishItemRepository wishItemRepository;

    @Autowired
    private ProductRepository productRepository;

    public List<WishlistItem> getAllItems() {
        return wishItemRepository.findAll();
    }

    public void addToWishlist(Long productId) {
        Product product = productRepository.findById(productId).orElseThrow(() -> new IllegalArgumentException("Invalid product ID"));
        WishlistItem wishListItem = new WishlistItem();
        wishListItem.setProduct(product);
        wishItemRepository.save(wishListItem);
    }

    public void removeFromWishlist(Long productId) {
        List<WishlistItem> items = wishItemRepository.findByProductId(productId);
        if (!items.isEmpty()) {
            wishItemRepository.delete(items.get(0));
        }
    }

}

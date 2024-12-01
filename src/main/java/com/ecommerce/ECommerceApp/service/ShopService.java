package com.ecommerce.ECommerceApp.service;

import com.ecommerce.ECommerceApp.repository.CartRepository;
import com.ecommerce.ECommerceApp.repository.WishlistRepository;
import org.springframework.stereotype.Service;
import com.ecommerce.ECommerceApp.model.Cart;
import com.ecommerce.ECommerceApp.model.Wishlist;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ShopService {

    private final CartRepository cartRepository;
    private final WishlistRepository wishlistRepository;

    public ShopService(CartRepository cartRepository,WishlistRepository wishlistRepository) {
        this.cartRepository = cartRepository;
        this.wishlistRepository = wishlistRepository;

    }

    @Transactional
    public Cart getCartWithItems(Long cartId) {
        return cartRepository.findById(cartId)
                .orElseThrow(() -> new RuntimeException("Cart not found"));
    }
    @Transactional
    public Wishlist getWishlistWithItems(Long wishlistId) {
        return wishlistRepository.findById(wishlistId)
                .orElseThrow(() -> new RuntimeException("Wishlist not found"));
    }
}

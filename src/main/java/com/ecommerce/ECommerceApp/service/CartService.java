package com.ecommerce.ECommerceApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.ECommerceApp.model.CartItem;
import com.ecommerce.ECommerceApp.model.Product;
import com.ecommerce.ECommerceApp.repository.CartItemRepository;
import com.ecommerce.ECommerceApp.repository.ProductRepository;

@Service
public class CartService {
    @Autowired
    private CartItemRepository cartItemRepository;

    @Autowired
    private ProductRepository productRepository;

    public List<CartItem> getAllItems() {
        return cartItemRepository.findAll();
    }

    public void addToCart(Long productId) {
        Product product = productRepository.findById(productId).orElseThrow(() -> new IllegalArgumentException("Invalid product ID"));
        CartItem cartItem = new CartItem();
        cartItem.setProduct(product);
        cartItem.setQuantity(1); // default quantity
        cartItem.setPrice(product.getPrice());
        cartItemRepository.save(cartItem);
    }

    public void removeFromCart(Long productId) {
        List<CartItem> cartItems = cartItemRepository.findByProductId(productId);
        if (!cartItems.isEmpty()) {
            cartItemRepository.delete(cartItems.get(0));
        }
    }

    public void clearCart() {
        cartItemRepository.deleteAll();
    }

    public double getTotalAmount() {
        return cartItemRepository.findAll().stream()
                                 .mapToDouble(item -> item.getPrice() * item.getQuantity())
                                 .sum();
    }
}

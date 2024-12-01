package com.ecommerce.ECommerceApp.service;

import com.ecommerce.ECommerceApp.model.Order;
import com.ecommerce.ECommerceApp.model.User;
import com.ecommerce.ECommerceApp.model.Cart;
import com.ecommerce.ECommerceApp.repository.CartRepository;
import com.ecommerce.ECommerceApp.repository.WishlistRepository;
import com.ecommerce.ECommerceApp.repository.OrderRepository;

import org.springframework.stereotype.Service;

import com.ecommerce.ECommerceApp.model.Wishlist;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Service
public class ShopService {

    private final CartRepository cartRepository;
    private final WishlistRepository wishlistRepository;
    private final OrderRepository orderRepository;

    public ShopService(CartRepository cartRepository,WishlistRepository wishlistRepository, OrderRepository orderRepository) {
        this.cartRepository = cartRepository;
        this.wishlistRepository = wishlistRepository;
        this.orderRepository = orderRepository;

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

    @Transactional
    public Order placeOrder(User user) {
        Cart cart = user.getCart();

        if (cart == null || cart.getItems().isEmpty()) {
            throw new IllegalStateException("Cannot order with no items");
        }
        //replace with calculate cart
        BigDecimal totalPrice = new BigDecimal(100);// = cart.calculateTotalPrice();

        Order order = new Order();
        order.setUser(user);
        order.setCart(cart);
        order.setOrderDate(LocalDateTime.now());
        order.setStatus("PENDING");
        order.setTotalAmount(totalPrice);

        // save
        Order savedOrder = orderRepository.save(order);

        // clear cart
        //cartService.clearCart(cart);

        return savedOrder;
    }
}

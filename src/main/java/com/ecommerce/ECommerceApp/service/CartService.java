package com.ecommerce.ECommerceApp.service;

import com.ecommerce.ECommerceApp.model.CartItem;
import com.ecommerce.ECommerceApp.repository.CartItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {
    @Autowired
    private CartItemRepository cartItemRepository;

    public List<CartItem> getAllItems() {
        return cartItemRepository.findAll();
    }
}

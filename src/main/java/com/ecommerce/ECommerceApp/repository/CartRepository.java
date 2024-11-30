package com.ecommerce.ECommerceApp.repository;

import com.ecommerce.ECommerceApp.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Long> {
//        List<Cart> findById(Long CartId);
    }


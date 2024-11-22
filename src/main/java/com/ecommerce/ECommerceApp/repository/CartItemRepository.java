package com.ecommerce.ECommerceApp.repository;

import com.ecommerce.ECommerceApp.model.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {

}

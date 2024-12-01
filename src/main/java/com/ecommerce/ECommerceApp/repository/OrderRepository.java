package com.ecommerce.ECommerceApp.repository;

import com.ecommerce.ECommerceApp.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
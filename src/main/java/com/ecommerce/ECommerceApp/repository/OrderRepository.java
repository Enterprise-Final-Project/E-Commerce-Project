package com.ecommerce.ECommerceApp.repository;

import com.ecommerce.ECommerceApp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.ECommerceApp.model.Order;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Integer> {
    List<Order> findByUser(User user);
}
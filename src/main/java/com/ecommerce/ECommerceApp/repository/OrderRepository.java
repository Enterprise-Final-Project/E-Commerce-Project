
package com.ecommerce.ECommerceApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.ECommerceApp.model.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {
}
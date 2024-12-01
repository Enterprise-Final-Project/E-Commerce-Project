package com.ecommerce.ECommerceApp.repository;

import com.ecommerce.ECommerceApp.model.Email;
import com.ecommerce.ECommerceApp.model.Order;
import com.ecommerce.ECommerceApp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;

public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findByUser(User user);
}
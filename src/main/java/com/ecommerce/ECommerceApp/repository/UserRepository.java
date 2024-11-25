package com.ecommerce.ECommerceApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.ECommerceApp.model.User;

/**
 * Repository interface for User entities.
 * Provides CRUD operations and query methods for User entities.
 */
public interface UserRepository extends JpaRepository<User, String> {
}
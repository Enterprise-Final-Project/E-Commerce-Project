package com.ecommerce.ECommerceApp.repository;

import com.ecommerce.ECommerceApp.model.Email;
import com.ecommerce.ECommerceApp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(Email email);
    Optional<User> findById(Long userId);
}


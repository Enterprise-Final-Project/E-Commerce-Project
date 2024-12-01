package com.ecommerce.ECommerceApp.repository;

import com.ecommerce.ECommerceApp.model.Wishlist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WishlistRepository extends JpaRepository<Wishlist, Long> {
}

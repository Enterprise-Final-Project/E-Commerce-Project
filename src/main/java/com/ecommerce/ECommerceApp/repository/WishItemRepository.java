package com.ecommerce.ECommerceApp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.ECommerceApp.model.WishlistItem;

@Repository
public interface WishItemRepository extends JpaRepository<WishlistItem, Long> {
    List<WishlistItem> findByProductId(Long productId);
}

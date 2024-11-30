package com.ecommerce.ECommerceApp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.ECommerceApp.model.WishListItem;

@Repository
public interface WishItemRepository extends JpaRepository<WishListItem, Long> {
    List<WishListItem> findByProductId(Long productId);
}

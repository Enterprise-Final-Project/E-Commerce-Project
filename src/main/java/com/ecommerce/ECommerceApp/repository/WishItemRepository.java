package com.ecommerce.ECommerceApp.repository;

import com.ecommerce.ECommerceApp.model.CartItem;
import com.ecommerce.ECommerceApp.model.WishListItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WishItemRepository extends JpaRepository<WishListItem, Long> {

}

package com.ecommerce.ECommerceApp.service;

import com.ecommerce.ECommerceApp.model.CartItem;
import com.ecommerce.ECommerceApp.model.WishListItem;
import com.ecommerce.ECommerceApp.repository.CartItemRepository;
import com.ecommerce.ECommerceApp.repository.WishItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WishListService {

    @Autowired
    private WishItemRepository wishItemRepository;


    public List<WishListItem> getAllItems() {
        return wishItemRepository.findAll();
    }



}

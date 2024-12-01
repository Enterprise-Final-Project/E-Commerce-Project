package com.ecommerce.ECommerceApp.controller;

import com.ecommerce.ECommerceApp.model.Cart;
import com.ecommerce.ECommerceApp.model.User;
import com.ecommerce.ECommerceApp.model.Wishlist;
import com.ecommerce.ECommerceApp.service.ShopService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.security.core.annotation.AuthenticationPrincipal;

@Controller
public class ShopController {

    //cart
    private final ShopService shopService;

    public ShopController(ShopService shopService) {
        this.shopService = shopService;
    }

    @GetMapping("/cart")
    public String getCart(Model model, @AuthenticationPrincipal User user) {
        if (user != null) {
            Cart cart = shopService.getCartWithItems(user.getCart().getId());
            model.addAttribute("cart", cart);
        } else {
            model.addAttribute("cart", new Cart()); // empty
        }
        return "cart";
    }

    //wishlist
    @GetMapping("/wishlist")
    public String getWishlist(Model model, @AuthenticationPrincipal User user) {
        if (user != null) {
            Wishlist wishlist = shopService.getWishlistWithItems(user.getWishlist().getId());
            model.addAttribute("wishlist", wishlist);
        } else {
            model.addAttribute("wishlist", new Wishlist()); //empty
        }
        return "wishlist";
    }
}

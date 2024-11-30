package com.ecommerce.ECommerceApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ecommerce.ECommerceApp.service.WishListService;

@Controller
public class WishListController {

    @Autowired
    private WishListService wishListService;

    @PostMapping("/wishlist/add")
    public String addToWishlist(@RequestParam Long productId, RedirectAttributes redirectAttributes) {
        wishListService.addToWishlist(productId);
        redirectAttributes.addFlashAttribute("message", "Product added to wishlist successfully!");
        return "redirect:/";
    }

    @PostMapping("/wishlist/remove")
    public String removeFromWishlist(@RequestParam Long productId, RedirectAttributes redirectAttributes) {
        wishListService.removeFromWishlist(productId);
        redirectAttributes.addFlashAttribute("message", "Product removed from wishlist successfully!");
        return "redirect:/wishlist";
    }
}
package com.ecommerce.ECommerceApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ecommerce.ECommerceApp.service.CartService;

@Controller
public class CartController {

    @Autowired
    private CartService cartService;

    @PostMapping("/cart/add")
    public String addToCart(@RequestParam Long productId, RedirectAttributes redirectAttributes) {
        cartService.addToCart(productId);
        redirectAttributes.addFlashAttribute("message", "Product added to cart successfully!");
        return "redirect:/";
    }

    @PostMapping("/cart/remove")
    public String removeFromCart(@RequestParam Long productId, RedirectAttributes redirectAttributes) {
        cartService.removeFromCart(productId);
        redirectAttributes.addFlashAttribute("message", "Product removed from cart successfully!");
        return "redirect:/cart";
    }
}
package com.ecommerce.ECommerceApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EcommerceController {

    @GetMapping({"/", "/landing"})
    public String landing() {
        return "landing";
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }
    @GetMapping("/account")
    public String account() {
        return "account";
    }
    @GetMapping("/admin")
    public String admin() {
        return "admin";
    }
    @GetMapping("/cart")
    public String cart() {
        return "cart";
    }
    @GetMapping("/checkout")
    public String checkout() {
        return "checkout";
    }
    @GetMapping("/confirmation")
    public String confirmation() {
        return "confirmation";
    }
    @GetMapping("/login_page")
    public String login_page() {
        return "login_page";
    }
    @GetMapping("/past_orders")
    public String past_orders() {
        return "past_orders";
    }
    @GetMapping("/product_details")
    public String product_details() {
        return "product_details";
    }
    @GetMapping("/storefront_fufillment")
    public String storefront_fufillment() {
        return "storefront_fufillment";
    }
    @GetMapping("/storefront_management")
    public String storefront_management() {
        return "storefront_management";
    }
    @GetMapping("/wishlist")
    public String wishlist() {
        return "wishlist";
    }

}

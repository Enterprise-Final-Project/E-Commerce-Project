package com.ecommerce.ECommerceApp.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/login_page")
    public String loginPage() {
        return "login_page";
    }

    @GetMapping("/register")
    public String register() {
        return "register";
    }

    @GetMapping("/forgot_password")
    public String forgotPassword() {
        return "forgot_password";
    }
}



package com.ecommerce.ECommerceApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @GetMapping("/admin")
    public String admin() {
        return "admin";
    }
}

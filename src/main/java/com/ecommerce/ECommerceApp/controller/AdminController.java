package com.ecommerce.ECommerceApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
public class AdminController {
    /**
     * Handles requests to the admin page.
     *
     * @return the name of the admin page view
     */
    @GetMapping("/admin")
    public String admin() {
        return "admin";
    }
}

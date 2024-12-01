package com.ecommerce.ECommerceApp.controller;
import com.ecommerce.ECommerceApp.model.Order;
import com.ecommerce.ECommerceApp.model.User;
import com.ecommerce.ECommerceApp.service.ShopService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class OrderController {

    private final ShopService orderService;

    public OrderController(ShopService orderService) {
        this.orderService = orderService;
    }

    /**
     * Handles requests to the past orders page.
     *
     * @return the name of the past orders page view
     */
    @GetMapping("/past_orders")
    public String getOrderHistory(@ModelAttribute("currentUser") User currentUser, Model model) {
        if (currentUser == null) {
            throw new IllegalStateException("User is not authenticated");
        }
        List<Order> orders = orderService.getOrdersForCurrentUser(currentUser);
        model.addAttribute("orders", orders);

        return "order_history";
    }

    // Show order details
    @GetMapping("/orders/{orderId}")
    public String getOrderDetails(@PathVariable Long orderId, Model model) {
        Order order = orderService.getOrderById(orderId);
        model.addAttribute("order", order);
        return "past_order_details";
    }
}

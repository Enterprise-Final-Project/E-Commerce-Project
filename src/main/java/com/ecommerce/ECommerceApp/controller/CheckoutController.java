package com.ecommerce.ECommerceApp.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ecommerce.ECommerceApp.model.Order;
import com.ecommerce.ECommerceApp.repository.OrderRepository;
import com.ecommerce.ECommerceApp.service.CartService;

@Controller
public class CheckoutController {

    @Autowired
    private CartService cartService;

    @Autowired
    private OrderRepository orderRepository;

    @PostMapping("/checkout/complete")
    public String completeCheckout(@RequestParam String firstName, @RequestParam String lastName, 
                                   @RequestParam String address, @RequestParam String paymentMethod, 
                                   RedirectAttributes redirectAttributes) {
        // Create and save the order
        Order order = new Order();
        order.setOrderDate(LocalDateTime.now());
        order.setUserID(1); // Nathan: Change later after auth
        order.setTotalAmount((float) cartService.getTotalAmount());
        orderRepository.save(order);

        // Clear the cart
        cartService.clearCart();

        redirectAttributes.addFlashAttribute("message", "Purchase completed successfully!");
        return "redirect:/";
    }
}
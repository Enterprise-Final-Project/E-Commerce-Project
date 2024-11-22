package com.ecommerce.ECommerceApp.controller;

import java.text.AttributedString;
import java.util.List;

import com.ecommerce.ECommerceApp.model.CartItem;
import com.ecommerce.ECommerceApp.repository.CartItemRepository;
import com.ecommerce.ECommerceApp.repository.ProductRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ecommerce.ECommerceApp.model.Product;
import com.ecommerce.ECommerceApp.service.ProductService;

/**
 * Controller class for handling e-commerce related requests.
 */
@Controller
public class EcommerceController {

    private static final Logger logger = LoggerFactory.getLogger(EcommerceController.class);

    @Autowired
    private ProductService productService;

    /**
     * Handles requests to the landing page.
     *
     * @return the name of the landing page view
     */
    @GetMapping({"/", "/landing"})
    public String landing() {
        return "landing";
    }

    /**
     * Handles requests to the about page.
     *
     * @return the name of the about page view
     */
    @GetMapping("/about")
    public String about() {
        return "about";
    }

    /**
     * Handles requests to the account page.
     *
     * @return the name of the account page view
     */
    @GetMapping("/account")
    public String account() {
        return "account";
    }

    /**
     * Handles requests to the admin page.
     *
     * @return the name of the admin page view
     */
    @GetMapping("/admin")
    public String admin() {
        return "admin";
    }

    /**
     * Handles requests to the cart page.
     *
     * @return the name of the cart page view
     */
    @GetMapping("/cart")
    public String cart(Model model) {


        List<Product> products  = productService.getAllProducts();

        model.addAttribute("CartItems", products);

        return "cart";
    }


    /**
     * Handles requests to the checkout page.
     *
     * @return the name of the checkout page view
     */
    @GetMapping("/checkout")
    public String checkout() {
        return "checkout";
    }

    /**
     * Handles requests to the confirmation page.
     *
     * @return the name of the confirmation page view
     */
    @GetMapping("/confirmation")
    public String confirmation() {
        return "confirmation";
    }

    /**
     * Handles requests to the login page.
     *
     * @return the name of the login page view
     */
    @GetMapping("/login_page")
    public String login_page() {
        return "login_page";
    }

    /**
     * Handles requests to the past orders page.
     *
     * @return the name of the past orders page view
     */
    @GetMapping("/past_orders")
    public String past_orders() {
        return "past_orders";
    }

    /**
     * Handles requests to the product details page.
     *
     * @return the name of the product details page view
     */
    @GetMapping("/product_details")
    public String product_details() {
        return "product_details";
    }

    /**
     * Handles requests to the storefront fulfillment page.
     *
     * @return the name of the storefront fulfillment page view
     */
    @GetMapping("/storefront_fufillment")
    public String storefront_fufillment() {
        return "storefront_fufillment";
    }

    /**
     * Handles requests to the storefront management page.
     *
     * @return the name of the storefront management page view
     */
    @GetMapping("/storefront_management")
    public String storefront_management() {
        return "storefront_management";
    }

    /**
     * Handles requests to the wishlist page.
     *
     * @return the name of the wishlist page view
     */
    @GetMapping("/wishlist")
    public String wishlist() {
        return "wishlist";
    }

    /**
     * Handles search requests.
     *
     * @param query the search query
     * @param model the model to hold search results
     * @return the name of the landing page view with search results
     */
    @GetMapping("/search")
    public String search(@RequestParam("query") String query, Model model) {
        logger.info("Search query: {}", query);
        try {
            List<Product> products = productService.searchProducts(query);
            logger.info("Search results: {}", products);
            model.addAttribute("searchResults", products);
        } catch (Exception e) {
            logger.error("Error occurred while searching for products", e);
            model.addAttribute("errorMessage", "An error occurred while searching for products. Please try again.");
        }
        return "landing";
    }

}
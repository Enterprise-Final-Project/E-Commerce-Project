package com.ecommerce.ECommerceApp.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import com.ecommerce.ECommerceApp.model.User;

//stores the current loggedin user
@ControllerAdvice
public class GlobalController {

    @ModelAttribute
    public void addUserToModel(Model model) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication != null && authentication.isAuthenticated() &&
                !authentication.getPrincipal().equals("anonymousUser")) {
            Object principal = authentication.getPrincipal();
            if (principal instanceof User) {
                User user = (User) principal;
                model.addAttribute("loggedInUser", user);
                model.addAttribute("firstName", user.getFirstName());
                model.addAttribute("roles", user.getRole());
            }
        }
    }
    //debug
    public void testStuff(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        System.out.println("MMMMM Authentication: " + authentication);
        System.out.println("MMMMM Principal: " + authentication.getPrincipal());
        System.out.println("MMMMM Authorities: " + authentication.getAuthorities());
    }

//    public void addUserToModel(Model model) {
//        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//        if (authentication != null && authentication.isAuthenticated() &&
//                !authentication.getPrincipal().equals("anonymousUser")) {
//            model.addAttribute("loggedInUser", authentication.getPrincipal());
//            System.out.println("Authenticated principal: " + principal);
//        }
//    }
}

package com.ecommerce.ECommerceApp.controller;

import com.ecommerce.ECommerceApp.repository.UserRepository;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import com.ecommerce.ECommerceApp.model.User;

//stores the current loggedin user
@ControllerAdvice
public class GlobalController {

    private final UserRepository userRepository;

    public GlobalController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @ModelAttribute("currentUser")
    public void addUserToModel(Model model) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication != null && authentication.isAuthenticated() &&
                !authentication.getPrincipal().equals("anonymousUser")) {
            Object principal = authentication.getPrincipal();
            if (principal instanceof User) {
                User user = (User) principal;
                //get user from database for global usage
                User managedUser = userRepository.findById(user.getUserID())
                        .orElseThrow(() -> new IllegalStateException("User not found in the database"));

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

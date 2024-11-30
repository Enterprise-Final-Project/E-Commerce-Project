package com.ecommerce.ECommerceApp.controller;

import com.ecommerce.ECommerceApp.model.dto.UserRegistrationDto;
import com.ecommerce.ECommerceApp.model.dto.UserUpdateDto;
import com.ecommerce.ECommerceApp.service.UserService;
import com.ecommerce.ECommerceApp.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

@Controller
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    /**
     * Handles requests to the account page.
     *
     * @return the name of the account page view
     */
    @GetMapping("/account")
    public String getAccountPage(@AuthenticationPrincipal User user, Model model) {
        model.addAttribute("user", user);
        return "account";
    }

    //handles the register page
    @PostMapping("/register")
    public String registerUser(@ModelAttribute UserRegistrationDto userDto, BindingResult result, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("user", userDto);
            return "register";
        }
        userService.registerUser(
                userDto.getFirstName(),
                userDto.getLastName(),
                userDto.getEmail(),
                userDto.getPassword()
        );
        return "redirect:/login"; // Redirect to login page after successful registration
    }


    //update user
    @PostMapping("/update")
    public String updateAccount(@AuthenticationPrincipal User authenticatedUser,
                                @ModelAttribute User updatedUserDetails,
                                BindingResult bindingResult,
                                Model model) {
        if (bindingResult.hasErrors()) {
            // for validation redirect
            model.addAttribute("user", updatedUserDetails);
            return "account";
        }

        try {
            User updatedUser = new User.Builder(
                    updatedUserDetails.firstName,
                    updatedUserDetails.lastName,
                    updatedUserDetails.email,
                    authenticatedUser.getPassword())
                    .withPhoneNumber(updatedUserDetails.phoneNumber)
                    .withMailingAddress(updatedUserDetails.mailingAddress)
                    .withShippingAddress(updatedUserDetails.shippingAddress)
                    .build();

            // update the user in the service layer
            userService.updateUser(authenticatedUser.getUserID(), updatedUser);
            model.addAttribute("successMessage", "Account updated successfully!");
        } catch (Exception e) {
            model.addAttribute("errorMessage", "Failed to update account: " + e.getMessage());
        }

        return "account";
    }




    //admin update
    @PutMapping("/{userId}")
    @ResponseBody
    public ResponseEntity<String> updateUser(@PathVariable Long userId, @RequestBody UserUpdateDto dto) {
        User.Builder updatedData = new User.Builder(dto.getFirstName(), dto.getLastName(), dto.getEmail(), dto.getPassword())
                .withPhoneNumber(dto.getPhoneNumber())
                .withMailingAddress(dto.getMailingAddress())
                .withShippingAddress(dto.getShippingAddress())
                .withPaymentMethod(dto.getPaymentMethod())
                .withAccountType(dto.getAccountType());

        userService.adminUpdateUser(userId, updatedData);
        return ResponseEntity.ok("User updated successfully!");
    }
}

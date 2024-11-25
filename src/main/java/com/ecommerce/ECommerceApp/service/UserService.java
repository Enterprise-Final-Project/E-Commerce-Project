package com.ecommerce.ECommerceApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.ECommerceApp.model.User;
import com.ecommerce.ECommerceApp.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    /**
     * Saves a user to the repository.
     * 
     * @param user the user to save
     */
    public void saveUser(User user) {
        userRepository.save(user);
    }

    /**
     * Updates an existing user in the repository.
     * 
     * @param user the user to update
     * @throws IllegalArgumentException if the user ID is null
     */
    public void updateUser(User user) {
        if (user.getUserID() != null) {
            userRepository.save(user);
        } else {
            throw new IllegalArgumentException("User ID cannot be null");
        }
    }

    /**
     * Deletes a user from the repository by their ID.
     * 
     * @param userId the ID of the user to delete
     */
    public void deleteUser(String userId) {
        userRepository.deleteById(userId);
    }

    /**
     * Retrieves all users from the repository.
     * 
     * @return a list of all users
     */
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
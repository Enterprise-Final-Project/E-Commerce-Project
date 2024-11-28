package com.ecommerce.ECommerceApp.service;

import com.ecommerce.ECommerceApp.model.AccountType;
import com.ecommerce.ECommerceApp.model.Email;
import com.ecommerce.ECommerceApp.model.User;
import com.ecommerce.ECommerceApp.repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class UserService {
        private final UserRepository userRepository;
        private final PasswordEncoder passwordEncoder;

        public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
            this.userRepository = userRepository;
            this.passwordEncoder = passwordEncoder;
        }

        /**
         * Registers a new user using the Builder pattern.
         *
         * @param firstName  the user's first name
         * @param lastName   the user's last name
         * @param email      the user's email
         * @param rawPassword the raw password to be hashed
         * @param accountType the account type (default is USER)
         * @return the saved User object
         */
        public User registerUser(String firstName, String lastName, Email email, String rawPassword, AccountType accountType) {
            // Hash the password
            String hashedPassword = passwordEncoder.encode(rawPassword);

            // Build the user object using the Builder
            User user = new User.Builder(firstName, lastName, email, hashedPassword)
                    .withAccountType(accountType) // Optional: default is USER
                    .build();

            // Save the user to the database
            return userRepository.save(user);
        }

        /**
         * Finds a user by their email.
         *
         * @param email the email of the user
         * @return an Optional containing the User if found
         */
        public Optional<User> findByEmail(Email email) {
            return userRepository.findByEmail(email);
        }

        /**
         * Updates user information.
         *
         * @param userId      the ID of the user to update
         * @param updatedData the updated data for the user
         */
        public void adminUpdateUser(Long userId, User.Builder updatedData) {
            User user = userRepository.findById(userId)
                    .orElseThrow(() -> new RuntimeException("User not found"));

            // Apply updates using the builder
            user.updateInformation(
                    updatedData.firstName,
                    updatedData.lastName,
                    updatedData.phoneNumber,
                    updatedData.email,
                    updatedData.password != null ? passwordEncoder.encode(updatedData.password) : null,
                    updatedData.mailingAddress,
                    updatedData.shippingAddress,
                    updatedData.accountType
            );

            // Save updated user
            userRepository.save(user);
        }

    public void updateUser(Long userId, User updatedData) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found"));

        // Apply updates using the builder
        user.updateInformation(
                updatedData.firstName,
                updatedData.lastName,
                updatedData.phoneNumber,
                updatedData.email,
                updatedData.getPassword() != null ? passwordEncoder.encode(updatedData.getPassword()) : null,
                updatedData.mailingAddress,
                updatedData.shippingAddress,
                updatedData.accountType
        );

        // Save updated user
        userRepository.save(user);
    }
}

package com.ecommerce.ECommerceApp.config;

import com.ecommerce.ECommerceApp.model.*;
import com.ecommerce.ECommerceApp.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class UserDataLoader {

    @Bean
    CommandLineRunner initUser(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        return args -> {
            // Check if the  user already exists
            Email userEmail = new Email("user@example.com"); // Create an `Email` object
            if (userRepository.findByEmail(userEmail).isEmpty()) {
                // Use the Builder pattern to create an admin user
                User testUser = new User.Builder("test", "User", userEmail,passwordEncoder.encode("user123"))
                        .withAccountType(AccountType.USER)
                        .withPhoneNumber(new com.ecommerce.ECommerceApp.model.PhoneNumber("+1-555-555-5555")) // Optional
                        .withMailingAddress(new com.ecommerce.ECommerceApp.model.Address("123 User Street", "UserCity", "UserState", "12345", "AdminCountry")) // Optional
                        .build();

                Payment payment = new Payment(PaymentType.CREDIT, PaymentStatus.NOTPAYED);
                payment.setUser(testUser);
                testUser.addPayment(payment);

                userRepository.save(testUser);
                System.out.println("Regular user created: username=user@example.com, password=user123");
            }
        };
    }
}
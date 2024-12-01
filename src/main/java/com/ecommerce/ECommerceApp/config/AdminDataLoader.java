package com.ecommerce.ECommerceApp.config;

import com.ecommerce.ECommerceApp.model.Payment;
import com.ecommerce.ECommerceApp.model.User;
import com.ecommerce.ECommerceApp.model.AccountType;
import com.ecommerce.ECommerceApp.model.Email;
import com.ecommerce.ECommerceApp.model.PaymentType;
import com.ecommerce.ECommerceApp.model.PaymentStatus;
import com.ecommerce.ECommerceApp.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class AdminDataLoader {

    @Bean
    CommandLineRunner initAdmin(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        return args -> {
            // Check if the admin user already exists
            Email adminEmail = new Email("admin@example.com");
            if (userRepository.findByEmail(adminEmail).isEmpty()) {
                // Use the Builder pattern to create an admin user
                User admin = new User.Builder("Admin", "User", adminEmail, passwordEncoder.encode("admin123"))
                        .withAccountType(AccountType.ADMIN)
                        .withPhoneNumber(new com.ecommerce.ECommerceApp.model.PhoneNumber("+1-555-555-5555")) // Optional
                        .withMailingAddress(new com.ecommerce.ECommerceApp.model.Address("123 Admin Street", "AdminCity", "AdminState", "12345", "AdminCountry")) // Optional
                        .build();
                Payment payment = new Payment(PaymentType.CREDIT, PaymentStatus.NOTPAYED);
                payment.setUser(admin);
                admin.addPayment(payment);

                userRepository.save(admin);
                System.out.println("Admin user created: username=admin@example.com, password=admin123");
            }
        };
    }
}
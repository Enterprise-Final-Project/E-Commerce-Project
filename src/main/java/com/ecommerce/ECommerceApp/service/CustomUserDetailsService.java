package com.ecommerce.ECommerceApp.service;

import com.ecommerce.ECommerceApp.model.Email;
import com.ecommerce.ECommerceApp.repository.UserRepository;
import org.springframework.security.core.userdetails.*;
import org.springframework.stereotype.Service;
import com.ecommerce.ECommerceApp.model.User;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    public CustomUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        // Fetch user from the database using their email
        User user = userRepository.findByEmail(new Email(email))
                .orElseThrow(() -> new UsernameNotFoundException("User not found with email: " + email));
        // return the User as the principal
        return user;
    }

}

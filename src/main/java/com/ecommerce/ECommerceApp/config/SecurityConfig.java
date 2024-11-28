package com.ecommerce.ECommerceApp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import com.ecommerce.ECommerceApp.service.CustomUserDetailsService;
import org.springframework.security.access.hierarchicalroles.RoleHierarchy;
import org.springframework.security.access.hierarchicalroles.RoleHierarchyImpl;
import org.springframework.security.access.vote.RoleHierarchyVoter;

//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;


//@EnableGlobalMethodSecurity(prePostEnabled = true)
@Configuration
public class SecurityConfig {

    private final CustomUserDetailsService customUserDetailsService;

    public SecurityConfig(CustomUserDetailsService customUserDetailsService) {
        this.customUserDetailsService = customUserDetailsService;
    }

    //inherited permissions by hierarchy
    @Bean
    public RoleHierarchy roleHierarchy() {
        RoleHierarchyImpl roleHierarchy = new RoleHierarchyImpl();
        roleHierarchy.setHierarchy("ROLE_ADMIN > ROLE_SUPPLIER_ADMIN \n" +
                "ROLE_SUPPLIER_ADMIN > ROLE_SUPPLIER_USER \n" +
                "ROLE_SUPPLIER_USER > ROLE_USER");
        return roleHierarchy;
    }

    @Bean
    public RoleHierarchyVoter roleHierarchyVoter(RoleHierarchy roleHierarchy) {
        return new RoleHierarchyVoter(roleHierarchy);
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/admin/**").hasRole("ADMIN")
                .antMatchers("/supplier_user/**", "/storefront_management", "/storefront_fulfillment").hasRole("SUPPLIER_USER")
                .antMatchers("/supplier_admin/**", "/storefront_management", "/storefront_fulfillment").hasRole("SUPPLIER_ADMIN")
                .antMatchers("/user/**", "/account", "/cart", "/checkout","/confirmation", "past_orders", "product_details", "/wishlist").hasRole("USER")
                .antMatchers("/login_page","/about","/landing", "/register", "/forgot_password", "/css/**", "/js/**", "/images/**").permitAll()
                .anyRequest().authenticated()
                .and()
                .formLogin()
                    .loginPage("/login_page")
                    .loginProcessingUrl("/perform_login")
                    .usernameParameter("email")
                    .defaultSuccessUrl("/landing", true)
                    .failureUrl("/login_page?error=true")
                .permitAll()
                .and()
                .logout()
                    .logoutUrl("/logout")
                    .logoutSuccessUrl("/login_page?logout")
                    .invalidateHttpSession(true)
                    .deleteCookies("JSESSIONID")
                    .permitAll()
                .and()
                    .csrf().disable();

        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public AuthenticationManager authManager(HttpSecurity http) throws Exception {
        return http.getSharedObject(AuthenticationManagerBuilder.class)
                .userDetailsService(customUserDetailsService)
                .passwordEncoder(passwordEncoder())
                .and()
                .build();
    }
}

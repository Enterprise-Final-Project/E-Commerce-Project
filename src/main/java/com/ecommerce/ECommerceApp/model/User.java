package com.ecommerce.ECommerceApp.model;

import java.util.List;
import java.util.UUID;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import javax.persistence.*;
import java.util.Collection;
import java.util.Collections;
import java.util.*;
/**
 * Represents a user in the e-commerce application.
 */
@Entity
@Table(name = "users")
public class User implements UserDetails{

    // db details
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // For auto-increment IDs
    private Long userID;
    public Boolean active = true;

    // user account details
    public String firstName;
    public String lastName;
    @Embedded
    public PhoneNumber phoneNumber;

    @Embedded
    public Email email;

    protected String password;

    // payment details
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "street", column = @Column(name = "mailing_street")),
            @AttributeOverride(name = "city", column = @Column(name = "mailing_city")),
            @AttributeOverride(name = "state", column = @Column(name = "mailing_state")),
            @AttributeOverride(name = "zipCode", column = @Column(name = "mailing_zip_code")),
            @AttributeOverride(name = "country", column = @Column(name = "mailing_country"))
    })
    public Address mailingAddress;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "street", column = @Column(name = "shipping_street")),
            @AttributeOverride(name = "city", column = @Column(name = "shipping_city")),
            @AttributeOverride(name = "state", column = @Column(name = "shipping_state")),
            @AttributeOverride(name = "zipCode", column = @Column(name = "shipping_zip_code")),
            @AttributeOverride(name = "country", column = @Column(name = "shipping_country"))
    })
    public Address shippingAddress;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Payment> payments = new ArrayList<>();

    //permissions, default is set here
    @Enumerated(EnumType.STRING)
    public AccountType accountType = AccountType.USER;
    //setting empty defaults here
    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private Cart cart = new Cart();
    //setting empty defaults here
    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private Wishlist wishlist = new Wishlist();

    // Default constructor for JPA
    protected User() {}

    /**
     * Constructs a new User with the specified details using the builder.
     *
     * @param builder builder class with the default values
     */
    private User(Builder builder) {
        this.userID = generateUniqueID();
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.phoneNumber = builder.phoneNumber;
        this.email = builder.email;
        this.password = builder.password;
        this.mailingAddress = builder.mailingAddress;
        this.shippingAddress = builder.shippingAddress;
        this.accountType = builder.accountType;

        this.cart = new Cart();
        this.cart.setUser(this);

        this.wishlist = new Wishlist();
        this.wishlist.setUser(this);

        if (builder.payments != null) {
            this.payments.addAll(builder.payments);
            this.payments.forEach(payment -> payment.setUser(this)); // Set the user for each payment
        }
    }

    //default value builder
    //used for default values for initalization
    public static class Builder {
        public String firstName;
        public String lastName;
        public PhoneNumber phoneNumber = null;
        public Email email;
        public String password;
        public Address mailingAddress = null; // Default value
        public Address shippingAddress = null; // Default value
        public Payment paymentMethod = new Payment(PaymentType.CREDIT, PaymentStatus.NOTPAYED); // Default value
        public AccountType accountType = AccountType.USER; // Default value
        public List<Payment> payments = new ArrayList<>(); // Initialize as an empty list



        public Builder(String firstName, String lastName, Email email, String password) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
            this.password = password;
        }

        public Builder withPhoneNumber(PhoneNumber phoneNumber){
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder withMailingAddress(Address mailingAddress) {
            this.mailingAddress = mailingAddress;
            return this;
        }

        public Builder withShippingAddress(Address shippingAddress) {
            this.shippingAddress = shippingAddress;
            return this;
        }

        public Builder withPaymentMethod(Payment paymentMethod) {
            this.paymentMethod = paymentMethod;
            return this;
        }

        public Builder withAccountType(AccountType accountType) {
            this.accountType = accountType;
            return this;
        }
        public Builder withPayments(List<Payment> payments) {
            this.payments = payments;
            return this;
        }

        public Builder addPayment(Payment payment) {
            this.payments.add(payment);
            return this;
        }


        public User build() {
            return new User(this);
        }
    }

    /**
     * Gets the user ID.
     *
     * @return the user ID
     */
    public Long getUserID() {
        return this.userID;
    }

    /**
     * Gets the first name of the user.
     *
     * @return the first name of the user
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * Gets the full name of the user.
     *
     * @return the full name of the user
     */
    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }

    /**
     * Sets a new password for the user.
     *
     * @param password the new password
     */
    protected void setNewPassword(String password) {
        this.password = password;
    }

    /**
     * Sets the active status of the user.
     *
     * @param active the active status
     */
    protected void setActive(boolean active) {
        this.active = active;
    }

    /**
     * Updates the user's information.
     *
     * @param firstName the first name of the user
     * @param lastName the last name of the user
     * @param phoneNumber the phone number of the user
     * @param email the email address of the user
     * @param password the password of the user
     * @param mailingAddress the mailing address of the user
     * @param shippingAddress the shipping address of the user
     * @param accountType the account type of the user
     */
    public void updateInformation(String firstName, String lastName, PhoneNumber phoneNumber, Email email, String password, Address mailingAddress, Address shippingAddress, AccountType accountType) {
        // if fields are left blank, they will not update
        if (firstName != null && !firstName.isBlank()) {
            this.firstName = firstName;
        }
        if (lastName != null && !lastName.isBlank()) {
            this.lastName = lastName;
        }
        if (phoneNumber != null) {
            this.phoneNumber = phoneNumber;
        }
        if (email != null) {
            this.email = email;
        }
        if (password != null && !password.isBlank()) {
            this.password = password;
        }
        if (mailingAddress != null) {
            this.mailingAddress = mailingAddress;
        }
        if (shippingAddress != null) {
            this.shippingAddress = shippingAddress;
        }
        if (accountType != null) {
            this.accountType = accountType;
        }
    }

    /**
     * Generates a unique UUID for the user.
     *
     * @return the unique UUID
     */
    private Long generateUniqueID() {
        return UUID.randomUUID().getMostSignificantBits() & Long.MAX_VALUE;
    }


    //type field
    public boolean hasType(AccountType type){
        return this.accountType == type;
    }


    public String getEmail(){
        return this.email.getEmail();
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        // Map the AccountType to a role
        return Collections.singletonList(new SimpleGrantedAuthority("ROLE_" + accountType.name()));
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return String.valueOf(email); // Use email as the username
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return active;
    }

    public AccountType getAccountType(){
        return this.accountType;
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }

    public void addPayment(Payment payment) {
        this.payments.add(payment);
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
        cart.setUser(this);
    }

    public Wishlist getWishlist() {
        return wishlist;
    }

    public void setWishlist(Wishlist wishlist) {
        this.wishlist = wishlist;
        wishlist.setUser(this);
    }

}
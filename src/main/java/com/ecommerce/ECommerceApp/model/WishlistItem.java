package com.ecommerce.ECommerceApp.model;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
public class WishlistItem extends Product{

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @ManyToOne
        @JoinColumn(name = "wishlist_id", nullable = false)
        private Wishlist wishlist;


        public Long getId() {
            return id;
        }

        public Wishlist getWishlist() {
            return wishlist;
        }

        public void setWishlist(Wishlist wishlist) {
            this.wishlist = wishlist;
        }

}

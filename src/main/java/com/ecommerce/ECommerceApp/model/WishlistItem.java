package com.ecommerce.ECommerceApp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class WishlistItem extends Product{

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @ManyToOne
        @JoinColumn(name = "wishlist_id", nullable = false)
        private Wishlist wishlist;

        @ManyToOne
        @JoinColumn(name = "product_id", nullable = false)
        private Product product;

        public Long getId() {
            return id;
        }

        public Wishlist getWishlist() {
            return wishlist;
        }

        public void setWishlist(Wishlist wishlist) {
            this.wishlist = wishlist;
        }

        public Product getProduct() {
            return product;
        }

        public void setProduct(Product product) {
            this.product = product;
        }

}

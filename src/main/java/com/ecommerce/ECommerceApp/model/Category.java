package com.ecommerce.ECommerceApp.model;

public enum Category {
        ELECTRONICS(new Subcategory[]{
                Subcategory.SMARTPHONE,
                Subcategory.LAPTOP,
                Subcategory.TABLET
        }),
        FURNITURE(new Subcategory[]{
                Subcategory.SOFA,
                Subcategory.TABLE,
                Subcategory.CHAIR
        }),
        CLOTHING(new Subcategory[]{
                Subcategory.SHIRT,
                Subcategory.PANTS,
                Subcategory.JACKET
        });

        private final Subcategory[] subcategories;

        // Constructor to associate subcategories with categories
        Category(Subcategory[] subcategories) {
            this.subcategories = subcategories;
        }

        // getter for subcategory
        public Subcategory[] getSubcategories() {
            return subcategories;
        }

        // Enum for subcategories
        public enum Subcategory {
            SMARTPHONE, LAPTOP, TABLET,
            SOFA, TABLE, CHAIR,
            SHIRT, PANTS, JACKET
        }
}

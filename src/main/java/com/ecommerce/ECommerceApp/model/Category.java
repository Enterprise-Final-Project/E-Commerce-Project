package com.ecommerce.ECommerceApp.model;

/**
 * Enum representing different categories of products in the e-commerce application.
 */
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

    /**
     * Constructor to associate subcategories with categories.
     *
     * @param subcategories the subcategories associated with the category
     */
    Category(Subcategory[] subcategories) {
        this.subcategories = subcategories;
    }

    /**
     * Gets the subcategories associated with the category.
     *
     * @return the subcategories associated with the category
     */
    public Subcategory[] getSubcategories() {
        return subcategories;
    }

    /**
     * Enum representing different subcategories of products.
     */
    public enum Subcategory {
        SMARTPHONE, LAPTOP, TABLET,
        SOFA, TABLE, CHAIR,
        SHIRT, PANTS, JACKET
    }
}
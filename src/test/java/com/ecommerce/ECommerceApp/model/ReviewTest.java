package com.ecommerce.ECommerceApp.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Unit tests for the Review class.
 */
public class ReviewTest {
    private Review review;

    /**
     * Sets up the test environment before each test.
     */
    @BeforeEach
    public void setUp() {
        review = new Review(1, 5, "Great product!", 1);
    }

    /**
     * Tests the getReviewID method.
     */
    @Test
    public void testGetReviewID() {
        assertEquals(1, review.getReviewID());
    }

    /**
     * Tests the setReviewID method.
     */
    @Test
    public void testSetReviewID() {
        review.setReviewID(2);
        assertEquals(2, review.getReviewID());
    }

    /**
     * Tests the getRating method.
     */
    @Test
    public void testGetRating() {
        assertEquals(5, review.getRating());
    }

    /**
     * Tests the setRating method.
     */
    @Test
    public void testSetRating() {
        review.setRating(4);
        assertEquals(4, review.getRating());
    }

    /**
     * Tests the getComment method.
     */
    @Test
    public void testGetComment() {
        assertEquals("Great product!", review.getComment());
    }

    /**
     * Tests the setComment method.
     */
    @Test
    public void testSetComment() {
        review.setComment("Good product!");
        assertEquals("Good product!", review.getComment());
    }

    /**
     * Tests the getUserID method.
     */
    @Test
    public void testGetUserID() {
        assertEquals(1, review.getUserID());
    }

    /**
     * Tests the setUserID method.
     */
    @Test
    public void testSetUserID() {
        review.setUserID(2);
        assertEquals(2, review.getUserID());
    }
}

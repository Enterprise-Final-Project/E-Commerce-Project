package com.ecommerce.ECommerceApp.model;

import org.springframework.stereotype.Component;

/**
 * Represents a review made by a user.
 */
@Component
public class Review {
    private int ReviewID;
    private int rating;
    private String comment;
    private int userID;

    /**
     * Constructs a new Review with the specified details.
     * 
     * @param ReviewID the review ID
     * @param rating the rating
     * @param comment the comment
     * @param userID the user ID of the reviewer
     */
    public Review(int ReviewID, int rating, String comment, int userID) {
        this.ReviewID = ReviewID;
        this.rating = rating;
        this.comment = comment;
        this.userID = userID;
    }

    /**
     * Gets the review ID.
     * 
     * @return the review ID
     */
    public int getReviewID() {
        return ReviewID;
    }

    /**
     * Sets the review ID.
     * 
     * @param ReviewID the review ID to set
     */
    public void setReviewID(int ReviewID) {
        this.ReviewID = ReviewID;
    }

    /**
     * Gets the rating of the review.
     * 
     * @return the rating
     */
    public int getRating() {
        return rating;
    }

    /**
     * Sets the rating of the review.
     * 
     * @param rating the rating to set
     */
    public void setRating(int rating) {
        this.rating = rating;
    }

    /**
     * Gets the comment of the review.
     * 
     * @return the comment
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the comment of the review.
     * 
     * @param comment the comment to set
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * Gets the user ID of the reviewer.
     * 
     * @return the user ID
     */
    public int getUserID() {
        return userID;
    }

    /**
     * Sets the user ID of the reviewer.
     * 
     * @param userID the user ID to set
     */
    public void setUserID(int userID) {
        this.userID = userID;
    }
}

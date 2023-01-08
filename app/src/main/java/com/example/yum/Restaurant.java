package com.example.yum;

public class Restaurant {
    private String name, cuisine, location, menu, image, review;
    private int rating;

    public Restaurant(String name, String cuisine, String location, String menu, String image, String review, String rating) {
        this.name = name;
        this.cuisine = cuisine;
        this.location = location;
        this.menu = menu;
        this.image = image;
        this.review = review;
        this.rating = Integer.parseInt(rating);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCuisine() {
        return cuisine;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}

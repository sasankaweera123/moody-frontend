package me.moody.frontend.document;

import lombok.Data;

@Data
public class Product {
    private String id;
    private String name;
    private String description;
    private String image;
    private String category;
    private String brand;
    private String rating;
    private String numReviews;
    private String createdAt;
    private String updatedAt;

    public Product(String name, String description, String image, String category, String brand, String rating, String numReviews, String createdAt, String updatedAt) {
        this.name = name;
        this.description = description;
        this.image = image;
        this.category = category;
        this.brand = brand;
        this.rating = rating;
        this.numReviews = numReviews;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
}

package me.moody.frontend.document;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Product {
    @Id
    private String id;
    @Indexed(unique = true)
    private String productId;
    private String name;
    private String description;
    private String image;
    private String category;
    private String brand;
    private String rating;
    private String numReviews;
    private String createdAt;
    private String updatedAt;

    public Product(String productId, String name, String description, String image, String category, String brand, String rating, String numReviews, String createdAt, String updatedAt) {
        this.productId = productId;
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

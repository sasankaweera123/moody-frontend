package me.moody.frontend.document;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table (name = "reviews")
public class Reviews {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "product_id")
    private String productId;
    @Column(name = "review_title")
    private String title;
    @Column(name = "review_comment")
    private String comment;
    @Column(name = "rating")
    private int rating;

    public Reviews() {
    }

    public Reviews(String productId, String title, String comment, int rating) {
        this.productId = productId;
        this.title = title;
        this.comment = comment;
        this.rating = rating;
    }
}

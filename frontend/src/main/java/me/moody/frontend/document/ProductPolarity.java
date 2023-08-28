package me.moody.frontend.document;

import lombok.Data;
import jakarta.persistence.*;

import java.util.List;

@Data
@Entity
@Table (name = "moodydb")
public class ProductPolarity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "product_id")
    private String productId;
    @Column(name = "avg_pt")
    private String avg_polarity_title;
    @Column(name = "sentiment_st")
    private String avg_subjectivity_title;
    @Column(name = "avg_ct")
    private String avg_polarity_comment;
    @Column(name = "sentiment_sc")
    private String avg_subjectivity_comment;

    public ProductPolarity() {
    }

    public ProductPolarity(String productId, String avg_polarity_title, String avg_subjectivity_title, String avg_polarity_comment, String avg_subjectivity_comment) {
        this.productId = productId;
        this.avg_polarity_title = avg_polarity_title;
        this.avg_subjectivity_title = avg_subjectivity_title;
        this.avg_polarity_comment = avg_polarity_comment;
        this.avg_subjectivity_comment = avg_subjectivity_comment;
    }
}

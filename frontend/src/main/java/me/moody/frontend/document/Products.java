package me.moody.frontend.document;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table (name = "products")
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "product_id")
    private String productId;
    @Column(name = "product_name")
    private String productName;
    @Column(name = "product_link")
    private String productLink;

    public Products() {
    }

    public Products(String productId, String productName, String productLink) {
        this.productId = productId;
        this.productName = productName;
        this.productLink = productLink;
    }
}

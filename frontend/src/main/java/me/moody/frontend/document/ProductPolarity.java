package me.moody.frontend.document;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.index.Indexed;

import java.util.List;

@Data
@Document
public class ProductPolarity {
    @Id
    private String id;
    @Indexed(unique = true)
    private String productId;
    private List<String> polarity;

    public ProductPolarity(String productId, List<String> polarity) {
        this.productId = productId;
        this.polarity = polarity;
    }
}

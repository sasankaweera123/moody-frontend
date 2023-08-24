package me.moody.frontend.repository;

import me.moody.frontend.document.ProductPolarity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface ProductPolarityRepository extends MongoRepository<ProductPolarity, String> {
    Optional<ProductPolarity> findByProductId(String s);
}

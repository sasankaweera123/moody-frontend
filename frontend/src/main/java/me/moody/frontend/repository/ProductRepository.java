package me.moody.frontend.repository;

import me.moody.frontend.document.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface ProductRepository extends MongoRepository<Product, String> {
    Optional<Product> findByProductId(String s);
}

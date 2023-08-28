package me.moody.frontend.repository;

import me.moody.frontend.document.ProductPolarity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface ProductPolarityRepository extends JpaRepository<ProductPolarity, Integer> {
}

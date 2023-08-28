package me.moody.frontend.repository;

import me.moody.frontend.document.Products;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.Optional;

public interface ProductRepository extends JpaRepository<Products, Integer> {
}

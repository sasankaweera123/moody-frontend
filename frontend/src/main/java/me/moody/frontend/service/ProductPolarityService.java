package me.moody.frontend.service;

import lombok.AllArgsConstructor;
import me.moody.frontend.document.ProductPolarity;
import me.moody.frontend.repository.ProductPolarityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductPolarityService {

    private final ProductPolarityRepository productPolarityRepository;

    @Autowired
    public ProductPolarityService(ProductPolarityRepository productPolarityRepository) {
        this.productPolarityRepository = productPolarityRepository;
    }

    public List<ProductPolarity> getAllProductPolarity() {
        return productPolarityRepository.findAll();
    }

    public ProductPolarity getProductPolarityById(int id) {
        return productPolarityRepository.findById(id).orElseThrow(() -> new IllegalStateException("ProductPolarity not found for id: " + id));
    }

    public void addProductPolarity(ProductPolarity productPolarity) {
        productPolarityRepository.save(productPolarity);
    }
}

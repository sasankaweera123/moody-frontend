package me.moody.frontend.service;

import lombok.AllArgsConstructor;
import me.moody.frontend.repository.ProductPolarityRepository;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProductPolarityService {

    private final ProductPolarityRepository productPolarityRepository;
}

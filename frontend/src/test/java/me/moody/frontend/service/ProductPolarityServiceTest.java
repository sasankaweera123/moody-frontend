package me.moody.frontend.service;

import me.moody.frontend.document.ProductPolarity;
import me.moody.frontend.document.Products;
import me.moody.frontend.repository.ProductPolarityRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ProductPolarityServiceTest {

    @Mock
    private ProductPolarityRepository productPolarityRepository;
    private ProductPolarityService underTest;

    @BeforeEach
    void setUp() {
        underTest = new ProductPolarityService(productPolarityRepository);
    }

    @Test
    void canGetAllProductPolarity() {
        underTest.getAllProductPolarity();
        verify(productPolarityRepository).findAll();
    }

    @Test
    void canGetProductById(){
        int id = 3;
        ProductPolarity mockProductPolarity = new ProductPolarity("1","1","1","1","1");
        when(productPolarityRepository.findById(id)).thenReturn(Optional.of(mockProductPolarity));
        ProductPolarity productPolarity = underTest.getProductPolarityById(id);
        assertThat(productPolarity).isEqualTo(mockProductPolarity);
        verify(productPolarityRepository).findById(id);
    }

}
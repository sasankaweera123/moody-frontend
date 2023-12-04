package me.moody.frontend.service;

import me.moody.frontend.document.Products;
import me.moody.frontend.repository.ProductRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ProductServiceTest {

    @Mock
    private ProductRepository productRepository;
    private ProductService underTest;

    @BeforeEach
    void setUp() {
        underTest = new ProductService(productRepository);
    }

    @Test
    void canGetAllProducts() {
        underTest.getAllProducts();
        verify(productRepository).findAll();
    }

    @Test
    void canGetProductById(){
        Integer id = 3;
        Products mockProduct = new Products("P0001","Apple iPhone XS Max - 256GB - Space Gray","https://www.ebay.com/urw/Apple-iPhone-XS-Max-256GB-Space-Gray-Unlocked-A1921-CDMA-GSM-/product-reviews/24023697465?_itm=284963910251","https://i.ebayimg.com/images/g/9AIAAOSwTR9eNslz/s-l640.jpg");
        when(productRepository.findById(id)).thenReturn(Optional.of(mockProduct));
        Products product = underTest.getProductById(3);
        assertThat(product).isEqualTo(mockProduct);
        verify(productRepository).findById(id);
    }

}

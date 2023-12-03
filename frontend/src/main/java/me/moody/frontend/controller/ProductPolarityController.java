package me.moody.frontend.controller;


import me.moody.frontend.model.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import me.moody.frontend.service.ProductPolarityService;

import java.time.LocalDateTime;
import java.util.Map;

import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/api/v1/product/polarity")
public class ProductPolarityController {

    private final ProductPolarityService productPolarityService;

    @Autowired
    public ProductPolarityController(ProductPolarityService productPolarityService) {
        this.productPolarityService = productPolarityService;
    }

    @GetMapping(path = "list")
    public ResponseEntity<Response> getProductPolarity() {
        return ResponseEntity.ok(
                Response.builder().timestamp(LocalDateTime.now())
                        .data(Map.of("ProductPolarity", productPolarityService.getAllProductPolarity()))
                        .message("ProductPolarity list retrieved successfully")
                        .status(OK)
                        .statusCode(OK.value())
                        .build()
        );
    }

    @GetMapping(path = "{id}")
    public ResponseEntity<Response> getProductPolarityById(@PathVariable int id) {
        return ResponseEntity.ok(
                Response.builder().timestamp(LocalDateTime.now())
                        .data(Map.of("ProductPolarity", productPolarityService.getProductPolarityById(id)))
                        .message("ProductPolarity retrieved successfully")
                        .status(OK)
                        .statusCode(OK.value())
                        .build()
        );
    }



}

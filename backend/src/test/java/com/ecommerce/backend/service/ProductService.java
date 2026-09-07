package com.ecommerce.backend.service;

import com.ecommerce.backend.entity.product;
import com.ecommerce.backend.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<product> getAllProducts() {
        return productRepository.findAll();
    }

    public product getProductById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    public product createProduct(product product) {
        return productRepository.save(product);
    }
}
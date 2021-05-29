package com.spring.jpa.service;

import com.spring.jpa.model.Product;
import com.spring.jpa.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author Philémon Globléhi <philemon.globlehi@gmail.com>
 */
@Service
public class ProductService {
    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Iterable<Product> getProducts() {
        return this.productRepository.findAll();
    }

    public Optional<Product> getProductById(Integer id) {
        return this.productRepository.findById(id);
    }
}

package com.spring.jpa.controller;

import com.spring.jpa.model.Product;
import com.spring.jpa.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/**
 * @author Philémon Globléhi <philemon.globlehi@gmail.com>
 */
@RestController
@RequestMapping(path = "/api/v1/rest/products", name = "app_products_")
public class ProductController {
    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping(name = "list")
    public Iterable<Product> list() {
        return this.productService.getProducts();
    }

    @GetMapping(path = "/{id}", name = "details")
    public Optional<Product> show(@PathVariable int id) {
        return this.productService.getProductById(id);
    }

    @PostMapping(name = "add")
    public Product save(@RequestBody Product product) {
        return this.productService.addProduct(product);
    }
}

package com.spring.jpa.controller;

import com.spring.jpa.model.Category;
import com.spring.jpa.service.CategoryServicce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * @author Philémon Globléhi <philemon.globlehi@gmail.com>
 */
@RestController
@RequestMapping(path = "/api/v1/rest/categories", name = "app_categories_")
public class CategoryController {
    private final CategoryServicce categoryServicce;

    @Autowired
    public CategoryController(CategoryServicce categoryServicce) {
        this.categoryServicce = categoryServicce;
    }

    @GetMapping(name = "list")
    public Iterable<Category> list() {
        return this.categoryServicce.getCategories();
    }

    @GetMapping(path = "/{id}", name = "details")
    public Optional<Category> show(@PathVariable int id) {
        return this.categoryServicce.getCategoryById(id);
    }
}

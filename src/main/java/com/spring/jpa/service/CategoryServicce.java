package com.spring.jpa.service;

import com.spring.jpa.model.Category;
import com.spring.jpa.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

/**
 * @author Philémon Globléhi <philemon.globlehi@gmail.com>
 */
@Service
public class CategoryServicce {
    private final CategoryRepository categoryRepository;

    @Autowired
    public CategoryServicce(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Transactional
    public Iterable<Category> getCategories() {
        return this.categoryRepository.findAll();
    }

    @Transactional
    public Optional<Category> getCategoryById(Integer id) {
        return this.categoryRepository.findById(id);
    }
}

package com.spring.jpa.repository;

import com.spring.jpa.model.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Philémon Globléhi <philemon.globlehi@gmail.com>
 */
@Repository
public interface CategoryRepository extends CrudRepository<Category, Integer> {
}

package com.spring.jpa.repository;

import com.spring.jpa.model.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * @author Philémon Globléhi <philemon.globlehi@gmail.com>
 */
@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {

    // DELIVERY QUERY
    public Iterable<Product> findByName(String name);
    public Iterable<Product> findByCategoriesName(String name);

    // JPQL QUERY
    @Query("FROM Product WHERE name = ?1")
    public Iterable<Product> findByNameJPQL(String name);

    // NATIVE QUERY
    @Query(value = "SELECT * FROM produit WHERE cout = :cout", nativeQuery = true)
    public Iterable<Product> findByCostNative(@Param("cout") Integer cost);


}

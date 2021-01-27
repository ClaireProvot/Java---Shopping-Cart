package org.example.shoppingcart.models;


import org.example.shoppingcart.models.data.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

    Product findBySlug(String slug);

    Product findBySlugAndIdNot(String slug, int id);

    Page<Product> findAll(Pageable pageable);

    List<Product> findAllByCategoryId(int categoryId, Pageable pageable);

    long countByCategoryId(int categoryId);
}

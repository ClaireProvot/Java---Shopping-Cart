package org.example.shoppingcart.models;

import org.example.shoppingcart.models.data.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}

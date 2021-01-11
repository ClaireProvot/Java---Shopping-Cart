package org.example.shoppingcart.models;

import org.example.shoppingcart.models.data.Page;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PageRepository extends JpaRepository<Page, Integer> {
}

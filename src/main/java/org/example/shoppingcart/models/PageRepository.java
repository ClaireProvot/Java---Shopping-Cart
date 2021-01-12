package org.example.shoppingcart.models;

import org.example.shoppingcart.models.data.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PageRepository extends JpaRepository<Page, Integer> {

    Page findBySlug(String slug);

    //@Query("SELECT p from Page p WHERE p.id != :id AND p.slug = :slug")
    //Page findBySlug(int id, String slug);

    Page findBySlugAndIdNot(String slug, int id);

}

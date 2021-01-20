package org.example.shoppingcart.models;

import org.example.shoppingcart.models.data.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PageRepository extends JpaRepository<Page, Integer> {

    Page findBySlug(String slug);

    //@Query("SELECT p from Page p WHERE p.id != :id AND p.slug = :slug")
    //Page findBySlug(int id, String slug);

    Page findBySlugAndIdNot(String slug, int id);

    List<Page> findAllByOrderBySortingAsc();

}

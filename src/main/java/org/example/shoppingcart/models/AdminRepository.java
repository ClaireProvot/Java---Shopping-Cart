package org.example.shoppingcart.models;

import org.example.shoppingcart.models.data.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Integer> {
}

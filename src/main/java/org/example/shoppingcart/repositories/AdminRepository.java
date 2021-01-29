package org.example.shoppingcart.repositories;

import org.example.shoppingcart.models.data.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Integer> {
}

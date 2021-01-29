package org.example.shoppingcart.models;

import org.example.shoppingcart.models.data.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}

package com.daovantam.shop.repositories;

import com.daovantam.shop.model.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

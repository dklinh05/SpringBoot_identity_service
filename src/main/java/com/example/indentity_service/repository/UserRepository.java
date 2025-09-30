package com.example.indentity_service.repository;

import com.example.indentity_service.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, String> {

    Optional<User> findByUsername(String email);

    boolean existsByUsername(String username);
}

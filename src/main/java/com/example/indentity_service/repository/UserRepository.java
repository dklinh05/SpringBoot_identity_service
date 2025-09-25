package com.example.indentity_service.repository;

import com.example.indentity_service.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, String> {
    @Override
    Optional<User> findById(String s);

    boolean existsByUsername(String username);
}

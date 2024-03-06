package com.gtrapani.security.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gtrapani.security.models.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	Optional<User> findByEmail(String email);
}

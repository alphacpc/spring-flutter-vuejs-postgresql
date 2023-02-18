package com.africa.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.africa.types.Users;

public interface UserRepository extends JpaRepository<Users, Long> {
	
	Optional<Users> findByEmail(String title);
	
}
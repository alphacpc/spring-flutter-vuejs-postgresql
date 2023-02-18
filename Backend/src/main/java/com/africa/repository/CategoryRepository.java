package com.africa.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.africa.types.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
	Optional<Category> findByTitleCategory(String title);
	
}
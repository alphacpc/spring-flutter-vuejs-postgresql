package com.africa.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.africa.types.Article;


public interface ArticleRepository extends JpaRepository<Article, Long> {
	Optional<Article> findArticleByTitle(String title);
}


package com.africa.config;


import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.africa.repository.ArticleRepository;
import com.africa.types.Article;

@Configuration
public class ArticleConfig {
	
	@Bean
	CommandLineRunner commandLineRunner(ArticleRepository repository) {
		return args -> {
			Article alpha = new Article(1L,"Alpha", "DIALLO", "alphacpc@gmail.com", null, 2, 1L, 1L, "jl", "lj");
			
			repository.saveAll(
					List.of(alpha)
			);
		};
	}
}
package com.africa.config;

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
			
			Article alpha = new Article(1L,"Solve bug file application", "YAML and Properties", "files application.yml and application.properties not working to gether", "capture.png", 1, 1L, 1L, "2023-02-18", "2023-02-18");
			Article nabou = new Article(2L,"Test without decoration", "Remove decoration", "I remove all decorations @Autowored and @Repository", "repository.png", 1, 1L, 1L, "2023-02-18", "2023-02-18");
			
			repository.saveAll(List.of(alpha, nabou));
		};
	}
}
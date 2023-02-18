package com.africa.config;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.africa.repository.ArticleRepository;
import com.africa.repository.CategoryRepository;
import com.africa.repository.UserRepository;
import com.africa.types.Article;
import com.africa.types.Category;
import com.africa.types.Users;

@Configuration
public class LoadDataConfig {
	
	@Bean
	CommandLineRunner commandLineRunner(ArticleRepository repository, CategoryRepository repository2, UserRepository userRepository) {
		return args -> {
			
			Article alpha = new Article(1L,"Solve bug file application", "YAML and Properties", "files application.yml and application.properties not working to gether", "capture.png", 1, 1L, 1L, "2023-02-18", "2023-02-18");
			Article nabou = new Article(2L,"Test without decoration", "Remove decoration", "I remove all decorations @Autowored and @Repository", "repository.png", 1, 1L, 1L, "2023-02-18", "2023-02-18");
			
			Category cat1 = new Category("Culture", "Culture africaine", new Needs().render_datetime(), new Needs().render_datetime());
			Category cat2 = new Category("Resistance", "Resistance africaine lors de la colonisation", new Needs().render_datetime(), new Needs().render_datetime());
			
			Users admin = new Users("Alpha amadou", "DIALLO", "Admin", "dakarscrip@gmail.com", "Dakar@Script", "Fullstack Developer & Junior Data engineer");
			
			repository.saveAll(List.of(alpha, nabou));
			repository2.saveAll(List.of(cat1, cat2));
			userRepository.save(admin);
			
		};
	}
	
}
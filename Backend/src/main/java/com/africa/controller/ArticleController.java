package com.africa.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.africa.config.Needs;
import com.africa.service.ArticleService;
import com.africa.types.Article;


@RestController
@RequestMapping("api/v1/articles")
public class ArticleController {
	
	private final ArticleService articleService;

	
	public ArticleController(ArticleService articleService) {
		this.articleService = articleService;
	}

	//////////////////////////////
	/////// METHODS APIs ////////
	////////////////////////////
	@GetMapping
	public List<Article> request_all_articles() {
		
		return articleService.get_articles();
		
	}
	
	
	@PostMapping("new")
	public String request_add_article(@RequestBody Article article) {
		
		article.setCreatedAt(new Needs().render_datetime());
		article.setLastUpdatedAt(new Needs().render_datetime());
		
		return articleService.add_article(article);
	}
	
	
	@PostMapping("test")
	public List<String> request_add_article(@RequestParam("file") MultipartFile file) {
		
		return List.of(file.getOriginalFilename());
	
	}

	
}

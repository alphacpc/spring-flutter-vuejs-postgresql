package com.africa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("api/v1/articles")
public class ArticleController {
	
	private final ArticleService articleService;

	@Autowired
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
	public Article request_add_article(HttpServletRequest request, @RequestParam(value="file") MultipartFile file) {
		
		Article article = new Article();
		
		article.setTitle(request.getParameter("title"));
		article.setDesc(request.getParameter("desc"));
		article.setBody(request.getParameter("body"));
		article.setImage_filename(file.getOriginalFilename());
		article.setLikes(0);
		article.setCategorid(4L);
		article.setAuthorid(4L);
		article.setCreatedAt(new Needs().render_datetime());
		article.setLastUpdatedAt(new Needs().render_datetime());
		
		return article;
	}
	
	
	@PostMapping("test")
	public Article request_add_article(@RequestBody Article article, @RequestParam(value="file") MultipartFile file) {
	    
	    article.setLastUpdatedAt(new Needs().render_datetime());
		
		return article;
	}
}

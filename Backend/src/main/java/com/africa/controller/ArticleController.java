package com.africa.controller;

<<<<<<< HEAD
import java.time.LocalDate;
import java.time.Month;
=======
import java.util.List;
>>>>>>> 5670e080b98d7944c41ea6bda0dac85d3f7433c2

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.africa.config.Needs;
<<<<<<< HEAD
=======
import com.africa.service.ArticleService;
>>>>>>> 5670e080b98d7944c41ea6bda0dac85d3f7433c2
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
<<<<<<< HEAD
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
=======
	public String request_add_article(@RequestBody Article article) {
		
		article.setCreatedAt(new Needs().render_datetime());
		article.setLastUpdatedAt(new Needs().render_datetime());
		
		return articleService.add_article(article);
>>>>>>> 5670e080b98d7944c41ea6bda0dac85d3f7433c2
	}
	
	
	@PostMapping("test")
<<<<<<< HEAD
	public Article request_add_article(@RequestBody Article article, @RequestParam(value="file") MultipartFile file) {
	    
	    article.setLastUpdatedAt(new Needs().render_datetime());
=======
	public List<String> request_add_article(@RequestParam("file") MultipartFile file) {
>>>>>>> 5670e080b98d7944c41ea6bda0dac85d3f7433c2
		
		return List.of(file.getOriginalFilename());
	
	}

	
}

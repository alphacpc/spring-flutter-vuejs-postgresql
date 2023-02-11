package com.africa.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.africa.types.Article;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("api/v1/articles")
public class ArticleController {

	//////////////////////////////
	/////// METHODS APIs ////////
	////////////////////////////
	@GetMapping
	public Article request_all_articles() {
		
		String m = LocalDate.of(2020, Month.DECEMBER, 12).toString();
		
		Article article = new Article(1L, "Sidy & Rama", "Desc courte", "Le corps...", "image.png", 2, 1L, 1L, m , m);
		
		return article;
	}
	
	
	@PostMapping("nouveau")
	public Article request_add_article(HttpServletRequest request, @RequestParam(value="file") MultipartFile file) {
		
		Article article = new Article();
		
		LocalDateTime myDateObj = LocalDateTime.now();
	    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	    String formattedDate = myDateObj.format(myFormatObj);
		
		article.setTitle(request.getParameter("title"));
		article.setDesc(request.getParameter("desc"));
		article.setBody(request.getParameter("body"));
		article.setImage_filename(file.getOriginalFilename());
		article.setLikes(0);
		article.setCategorid(4L);
		article.setAuthorid(4L);
		article.setCreatedAt(formattedDate);
		article.setLastUpdatedAt(formattedDate);
		
		return article;
	}
	
	
	@PostMapping("test")
	public Article request_add_article(@RequestBody Article article) {
		
		
		LocalDateTime myDateObj = LocalDateTime.now();
	    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	    String formattedDate = myDateObj.format(myFormatObj);
	    
	    article.setLastUpdatedAt(formattedDate);
		
		return article;
	}
}

package com.africa.articles;


import java.io.File;
import java.time.LocalDate;
import java.time.Month;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("api")
public class ArticleController {

	//////////////////////////////
	/////// METHODS APIs ////////
	////////////////////////////
	@GetMapping
	public Article query_all_article() {
		Article article = new Article(1L, "Sidy & Rama", "Desc courte", "Le corps...", new File("../"), 2, 1L, 1L, LocalDate.of(2020, Month.DECEMBER, 12), LocalDate.of(2020, Month.DECEMBER, 12));
		return article;
	}
	
}

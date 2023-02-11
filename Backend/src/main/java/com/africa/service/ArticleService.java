package com.africa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.africa.repository.ArticleRepository;
import com.africa.types.Article;

@Service
public class ArticleService {

    private final ArticleRepository articleRepository;

    @Autowired
	public ArticleService(ArticleRepository articleRepository) {
		this.articleRepository = articleRepository;
	}


    public List<Article> get_articles() {
		return articleRepository.findAll();
	}
    
	
}

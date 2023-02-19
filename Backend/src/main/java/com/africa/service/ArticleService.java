package com.africa.service;

<<<<<<< HEAD

public class ArticleService {

=======
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.africa.repository.ArticleRepository;
import com.africa.types.Article;

@Service
public class ArticleService {

    private final ArticleRepository articleRepository;

    
	public ArticleService(ArticleRepository articleRepository) {
		this.articleRepository = articleRepository;
	}

	//==============================================	
	//=============== ACTIONS ON DB ================
	//==============================================
	
    public List<Article> get_articles() {
		return articleRepository.findAll();
	}
    
    
    public String add_article(Article article) {
    	Optional<Article> articleOptional = articleRepository.findArticleByTitle(article.getTitle());
    	
    	if(articleOptional.isPresent()) {
    		return "Le title de l'article '" + article.getTitle() + "' est déjà utilisé.";
    	}
    	
    	articleRepository.save(article);

    	return "Creation avec succès de l'article '" + article.getTitle() + "'";
    }
    
>>>>>>> 5670e080b98d7944c41ea6bda0dac85d3f7433c2
	
}

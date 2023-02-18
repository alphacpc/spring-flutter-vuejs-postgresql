package com.africa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.africa.repository.CategoryRepository;
import com.africa.types.Category;

@Service
public class CategoryService {
	
	public final CategoryRepository categoryRepository;
	
	public CategoryService(CategoryRepository categoryRepository) {
		this.categoryRepository = categoryRepository;
	}
	
	public List<Category> get_categories(){
		
		return categoryRepository.findAll();
				
	}
	
	
	public String add_category(Category category) {
		
		Optional<Category> categoryOptional = categoryRepository.findByTitleCategory(category.getTitle_category());
		
		if(categoryOptional.isPresent()) {
			return "La categorie '"+ category.getTitle_category() + "' existe déjà !";
		}
		
		categoryRepository.save(category);
		return "Création avec succès de la catégorie '" + category.getTitle_category() + "'";
	}

}

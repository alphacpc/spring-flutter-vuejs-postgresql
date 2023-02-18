package com.africa.controller;


import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.africa.config.Needs;
import com.africa.service.CategoryService;
import com.africa.types.Category;

@RestController
@RequestMapping("api/v1/categories")
public class CategoryController {
	
	private final CategoryService categoryService;
	 
	public CategoryController(CategoryService categoryService) {
		this.categoryService = categoryService;
	}
	
	@GetMapping
	public List<Category> request_all_categories() {
		
		return categoryService.get_categories();
	}
	
	
	@PostMapping("new")
	public String request_create_category(@RequestBody Category category) {
		
		category.setCreatedAt_category(new Needs().render_datetime());
		category.setLastUpdated_category(new Needs().render_datetime());
		
		return categoryService.add_category(category);
	}

}

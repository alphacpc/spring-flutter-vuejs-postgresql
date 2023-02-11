package com.africa.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.africa.config.Needs;
import com.africa.types.Category;

@RestController
@RequestMapping("api/v1/categories")
public class CategoryController {
	
	@GetMapping
	public Category request_all_categories() {
		
		Category category = new Category();
		
		category.setId_category(1L);
		category.setTitle_category("Mafe dev");
		category.setDesc_category("Lorem category");
		
		return category;
	}
	
	@PostMapping("new")
	public String request_create_category(@RequestBody Category category) {
		
		category.setCreatedAt_category(new Needs().render_datetime());
		category.setLastUpdated_category(new Needs().render_datetime());
		
		return category.getTitle_category() + " created successfull.";
	}

}

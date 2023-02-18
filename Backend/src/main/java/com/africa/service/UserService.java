package com.africa.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.africa.repository.UserRepository;
import com.africa.types.Users;

@Service
public class UserService {
	
	public final UserRepository userRepository;
	
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	public List<Users> get_users(){
		
		return userRepository.findAll();
				
	}
	
	
//	public String add_category(Category category) {
//		
//		Optional<Category> categoryOptional = categoryRepository.findByTitleCategory(category.getTitle_category());
//		
//		if(categoryOptional.isPresent()) {
//			return "La categorie '"+ category.getTitle_category() + "' existe déjà !";
//		}
//		
//		categoryRepository.save(category);
//		return "Création avec succès de la catégorie '" + category.getTitle_category() + "'";
//	}

}

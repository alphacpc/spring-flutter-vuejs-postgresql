package com.africa.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.africa.service.UserService;
import com.africa.types.Users;

@RestController
@RequestMapping("api/v1/users")
public class UserController {
	
	private final UserService userService;
	
	public UserController(UserService userService) {
		this.userService = userService;
	}

	@GetMapping
	public List<Users> request_get_user() {
		
		return userService.get_users(); 
	}
	

	
}

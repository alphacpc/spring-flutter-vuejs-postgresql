package com.africa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.africa.types.User;

@RestController
@RequestMapping("api/v1/users")
public class UserController {

	@GetMapping
	public User request_get_user() {
		
		User user = new User();
		
		user.setFname("alpha");
		user.setLname("DIALLO");
		user.setEmail("alphacpc@africa-warriors.sn");
		user.setPassword("passer123");
		user.setRole("admin");
		user.setJob("Fullstack Dev");
		
		return user; 
	}
	

	
}

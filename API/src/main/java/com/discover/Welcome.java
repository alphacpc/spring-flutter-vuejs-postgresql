package com.discover;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("welcome")
public class Welcome {

	@GetMapping
	public String SayHello() {
		return "HELLO API CONTROLLER !!!!";
	}

}

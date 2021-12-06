package com.bitlabs.springsecurityExample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@GetMapping("/home")
	public String Home() {
		return "This is Home page";
		
	}
	@GetMapping("/user")
		public String User() {
			return "This is user page";
		}
	@GetMapping("/admin")
	public String Admin() {
		return "This is admin page";
		
	}

}

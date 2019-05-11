package com.example.demo.home;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = {"http://localhost:4200","https://makemetechie.herokuapp.com"})
@RestController
public class HomeController {

	@GetMapping("/hello")
	public String firstPage() {		
		return "Hello World";
	}
}

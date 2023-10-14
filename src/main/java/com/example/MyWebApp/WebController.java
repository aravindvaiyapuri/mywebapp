package com.example.MyWebApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
	@GetMapping(value="/get")
	public String getName() {
		return "hello world";
	}
	

}

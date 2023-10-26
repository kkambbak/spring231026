package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MustacheController {
	@GetMapping("/mustache1")
	public String mustache1() {
		return "mustache1";
		
	}
}

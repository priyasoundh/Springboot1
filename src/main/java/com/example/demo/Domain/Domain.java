package com.example.demo.Domain;

import org.springframework.web.bind.annotation.*;


@RestController
public class Domain {
	
	@GetMapping("/multi")
	public String multi(@RequestParam int a, int b)
	{
		return "multiplication: "+(a*b);
	}

}
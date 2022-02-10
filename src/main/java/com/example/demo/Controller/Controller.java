package com.example.demo.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

	@GetMapping("/add")
	public String add(@RequestParam int a, int b)
	{
		return "addition: "+(a+b);
	}
	
	
}

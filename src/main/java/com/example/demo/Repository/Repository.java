package com.example.demo.Repository;

import org.springframework.web.bind.annotation.*;


@RestController
public class Repository {
	
	@GetMapping("/div")
	public String div(@RequestParam int a, int b)
	{
		return "divide: "+(a/b);
	}

}
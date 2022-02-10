package com.example.demo.DTO;

import org.springframework.web.bind.annotation.*;

@RestController
public class DTO {
	
	@GetMapping("/mod")
	public String mod(@RequestParam int a, int b)
	{
		return "modulo: "+(a%b);
	}

}
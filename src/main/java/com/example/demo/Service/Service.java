package com.example.demo.Service;

import org.springframework.web.bind.annotation.*;

@RestController
public class Service {
	
	@GetMapping("/sub")
	public String sub(@RequestParam int a, int b)
	{
		return "subtraction: "+(a-b);
	}

}

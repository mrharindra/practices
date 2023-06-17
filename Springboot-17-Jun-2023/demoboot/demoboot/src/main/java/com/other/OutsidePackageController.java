package com.other;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OutsidePackageController 
{
	@GetMapping("/out")
	public String test() 
	{
		return "test_outside";
	}
}


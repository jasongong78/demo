package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@EnableAutoConfiguration
public class SampleController {
	
	@RequestMapping("/")
	public String home() {
		return "index";
	}
	
	public static void main(String argv[]) {
		SpringApplication.run(SampleController.class, argv);
	}

}

package com.example.spring_boot_1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring_boot_1.config.AuthorSettings;

@RestController
@SpringBootApplication
public class SpringBoot1Application {
	
	@Autowired
	private AuthorSettings authorSettings;
		
	@RequestMapping("/")
	public String index(){
		return "author name is:" + authorSettings.getName() + " and author age is:" + authorSettings.getAge();
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot1Application.class, args);
	}
}

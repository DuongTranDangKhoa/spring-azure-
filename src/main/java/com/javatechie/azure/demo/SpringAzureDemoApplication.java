package com.javatechie.azure.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@SpringBootApplication
@RestController
public class SpringAzureDemoApplication {

	@GetMapping("/message")
	public Users message(){
		Users users = new Users("aaasdf","dfads");
		return users;
	}

	@GetMapping("/")
	public String mess(){
		return "Congrats ! your application deployed successfully in Azure Platform. !";
	}



	public static void main(String[] args) {
		SpringApplication.run(SpringAzureDemoApplication.class, args);
	}
}

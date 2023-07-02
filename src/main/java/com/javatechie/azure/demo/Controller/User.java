package com.javatechie.azure.demo.Controller;

import com.javatechie.azure.demo.SpringAzureDemoApplication;
import com.javatechie.azure.demo.Users;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class User {
    @GetMapping("/select")
    public  Users getNewUser(){
        Users add =  new Users("khoa", "khoa");
        return add;
    }
    public static void main(String[] args) {
        SpringApplication.run(SpringAzureDemoApplication.class, args);
    }
}

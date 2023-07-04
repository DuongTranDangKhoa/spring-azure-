package com.javatechie.azure.demo.Controller;

import com.javatechie.azure.demo.DTO.AccountDTO;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class User {
    @GetMapping("/select")
    public AccountDTO getNewUser(){
        AccountDTO add =  new AccountDTO("khoa", "21","dfsf","sadfd", true);
        return add;
    }


}

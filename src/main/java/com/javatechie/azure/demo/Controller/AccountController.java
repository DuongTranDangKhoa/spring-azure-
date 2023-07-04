package com.javatechie.azure.demo.Controller;

import com.javatechie.azure.demo.DTO.AccountDTO;
import com.javatechie.azure.demo.repository.AccountRepository;
import com.javatechie.azure.demo.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AccountController {
    @Autowired
    AccountService accountService;
    @Autowired
    AccountRepository accountRepository;
    @PostMapping("/insert")
            public void AddnewAccount() {
        AccountDTO acc = new AccountDTO("user" , "user" , "12345", "USER",true);
        accountService.createAccount(acc);
    }
}

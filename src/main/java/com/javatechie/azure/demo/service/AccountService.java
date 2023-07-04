package com.javatechie.azure.demo.service;

import com.javatechie.azure.demo.DTO.AccountDTO;
import com.javatechie.azure.demo.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
    @Autowired
    AccountRepository accRepo;
    public void createAccount(AccountDTO accountDTO){
        accRepo.save(accountDTO);
    }
    public void delectAccount(String username){
        accRepo.deleteById(username);
    }
    public void updateAccount(String username){
        accRepo.updateByUsername(username);
    }
    public AccountDTO checklogin(String username, String password){
        return accRepo.findByUsernameAndPassword(username,password);
    }
    public void getAllListAccount(){
        accRepo.findAll();
    }
    public boolean checkExistAccount(String username){
        return accRepo.findByUsername(username);
    }

}

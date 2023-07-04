package com.javatechie.azure.demo.repository;

import com.javatechie.azure.demo.DTO.AccountDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface AccountRepository extends JpaRepository<AccountDTO, String> {
            public AccountDTO findByUsernameAndPassword(String username, String password);
            public AccountDTO updateByUsername(String username);
            public boolean findByUsername(String username);
}

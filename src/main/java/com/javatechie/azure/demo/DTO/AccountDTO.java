package com.javatechie.azure.demo.DTO;

import lombok.*;

import java.io.Serializable;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class AccountDTO implements Serializable {
    private String username;
    private String password;
    private String name;
    private String role;
    private boolean status;
}


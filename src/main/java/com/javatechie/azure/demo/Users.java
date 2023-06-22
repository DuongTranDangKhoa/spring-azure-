package com.javatechie.azure.demo;

import lombok.*;



public class Users {
   private String user;
    private String password;
    public Users() {
    }

    public Users(String name, String age) {
        this.user = name;
        this.password = age;
    }

    // Getter and Setter methods
    public String getName() {
        return user;
    }

    public void setName(String name) {
        this.user = name;
    }

    public String getAge() {
        return password;
    }

    public void setAge(String age) {
        this.password = age;
    }

}

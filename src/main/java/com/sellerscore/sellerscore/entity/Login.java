package com.sellerscore.sellerscore.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.web.bind.annotation.CrossOrigin;

@Entity
@CrossOrigin(origins = "")
public class Login {


    @Id
    private String username;

    @Column(nullable=false)
    private String password;

    public Login(){}

    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;


    }
}

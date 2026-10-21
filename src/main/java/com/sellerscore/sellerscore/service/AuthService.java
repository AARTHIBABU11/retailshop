package com.sellerscore.sellerscore.service;

import com.sellerscore.sellerscore.Repository.loginRepository;
import com.sellerscore.sellerscore.entity.Login;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service

public class AuthService {
    private final loginRepository loginRepository;
    private String username;
    private String password;

    public AuthService(loginRepository loginRepository) {
        this.loginRepository = loginRepository;
    }

    public String  newUser(Login request) {
        if (request.getUsername() == null ||
                request.getPassword() == null) {
            throw new ResponseStatusException(
                    HttpStatus.BAD_REQUEST,
                    "Enter all fields"
            );
        }
        String username = request.getUsername().trim().toLowerCase();



        if(loginRepository.findByUsername(username)){
            throw new ResponseStatusException(
                    HttpStatus.BAD_REQUEST,
                    "User not found "
            );
        }


        return "Message Succesfull";

    }
}


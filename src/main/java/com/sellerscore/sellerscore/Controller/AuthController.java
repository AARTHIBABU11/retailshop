package com.sellerscore.sellerscore.Controller;


import com.sellerscore.sellerscore.entity.Login;
import com.sellerscore.sellerscore.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
    @Autowired
    private AuthService authService;

    @PostMapping("/login")
    public String newUser(@RequestBody Login data){
        return authService.newUser(data);
    }


}

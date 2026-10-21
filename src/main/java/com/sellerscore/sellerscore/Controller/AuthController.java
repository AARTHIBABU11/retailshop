package com.sellerscore.sellerscore.Controller;


import com.sellerscore.sellerscore.entity.Login;
import com.sellerscore.sellerscore.service.AuthService;
import com.sellerscore.sellerscore.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
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
    @GetMapping("/count-on-time")
    public int  getOnTimeCount() {
        int count = SellerService.countByOnTime();
        return count;
    }
    @GetMapping("/orders")
    public int  getOrders() {
        int order_count = SellerService.orders();
        return order_count;
    }
    @GetMapping("/count-on-time")
    public int  getReceive() {
        int receive_count = SellerService.receive();
        return receive_count;
    }



}

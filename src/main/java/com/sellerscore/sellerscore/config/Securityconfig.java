package com.sellerscore.sellerscore.config;

import com.sellerscore.sellerscore.Repository.loginRepository;
import org.apache.tomcat.util.file.ConfigurationSource;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import java.net.http.HttpRequest;
import java.util.List;

public class Securityconfig {
    private loginRepository repo;

    public Securityconfig(loginRepository repos){
        this.repo=repos;
    }
    public BCryptPasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

//    public SecurityFilterChain securityFilterChain(HttpRequest http)throws Exception
//    {
//        http
//                .cors(cors->cors.ConfigurationSource())
//                .csrf(csrf->csrf.disable())
//                .authorizeHttpRequests(auth->auth.anyRequests.permitAll());
//        return http.build();
//
//    }
//
//    public ConfigurationSource configurationSource(){
//        ConfigurationSource cs =new ConfigurationSource();
//        cs.setAllowedOrigins(List.of("http://localhost"))
//    }

}

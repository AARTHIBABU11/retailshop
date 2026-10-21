package com.sellerscore.sellerscore.Repository;

import com.sellerscore.sellerscore.entity.Login;
import org.springframework.data.jpa.repository.JpaRepository;

public interface loginRepository extends JpaRepository<Login,String> {

      boolean findByUsername(String username) ;



}

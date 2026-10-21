package com.sellerscore.sellerscore.service;

import com.sellerscore.sellerscore.Dto.CountRespone;
import com.sellerscore.sellerscore.Repository.SellerARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SellerService {

    @Autowired
    private SellerARepository sellerRepo; // Fixed class and variable name

    public static int countByOnTime() {
        return SellerARepository.countByOntime();
    }


    public static int orders() { // Removed unused parameter, changed return type to int
        return sellerRepo.orders();
    }

    public static int receive() { // Removed unused parameter, changed return type to int
        return sellerRepo.receive();
    }


}

package com.sellerscore.sellerscore.Repository;

import com.sellerscore.sellerscore.entity.sellerdata;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface SellerARepository extends JpaRepository<sellerdata, String> {

    @Query(value = "SELECT COUNT(*) FROM sellerdetails WHERE actual_data <= promised_date", nativeQuery = true)
    static int countByOntime() {
        return 0;
    }

    @Query(value = "SELECT sum(quantity) FROM sellerdetails", nativeQuery = true)
    int orders();


    @Query(value = "SELECT sum(recieved) FROM sellerdetails", nativeQuery = true)
    int receive();


}






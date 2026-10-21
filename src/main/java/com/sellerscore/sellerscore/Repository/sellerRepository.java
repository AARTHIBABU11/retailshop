//package com.sellerscore.sellerscore.Repository;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public interface SellerARepository extends JpaRepository<SellerData, String> {
//
//    @Query(value = "SELECT COUNT(*) FROM sellerdetails WHERE actual_data <= promised_date", nativeQuery = true)
//    int countByOntime();
//}
//
//
//
//
//
//}

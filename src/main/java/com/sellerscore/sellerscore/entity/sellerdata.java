package com.sellerscore.sellerscore.entity;


import com.google.errorprone.annotations.InlineMeValidationDisabled;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name="sellerdetails")
public class sellerdata {
    @Id
    @Column(nullable = false,unique = true)
    private String id;

    @Column(nullable = false)
    private Integer quantity;

    @Column(nullable = false)
    private LocalDate actual_date;

    @Column(nullable = false)
    private LocalDate promised_date;

    @Column(nullable = false)
    private String eligible_deliverd_order;

    @Column(nullable = false)
    private Integer received;

    @Column(nullable =false)
    private String Seller;
}

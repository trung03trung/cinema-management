package com.example.cinemamanagement.entity;


import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "RAPPHIM")
@Data
public class RapPhim {

    @Id
    @Column(name = "MARAP",nullable = false, updatable = false)
    private String maRap;

    @Column(name = "TEN")
    private String ten;

    @Column(name = "DIACHI")
    private String diaChi;
}


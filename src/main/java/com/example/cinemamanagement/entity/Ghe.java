package com.example.cinemamanagement.entity;


import lombok.Data;

import javax.persistence.*;
import java.util.Set;


@Entity
@Data
@Table(name = "GHE")
public class Ghe {

    @Id
    @Column(name = "MAGHE",nullable = false, updatable = false)
    private String maGhe;

    @Column(name = "HANG")
    private Integer hang;

    @Column(name = "COTTHU")
    private Integer cotThu;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MAPHONG")
    private Phong maPhong;
}

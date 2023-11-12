package com.example.cinemamanagement.entity;



import lombok.Data;

import javax.persistence.*;


@Entity
@Data
@Table(name = "PHONG")
public class Phong {

    @Id
    @Column(name = "MAPHONG",nullable = false, updatable = false)
    private String maPhong;

    @Column(name = "SOHANG")
    private Integer soHang;

    @Column(name = "SOCOT")
    private Integer soCot;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MARAPPHIM")
    private RapPhim maRapPhim;

}

package com.example.cinemamanagement.entity;


import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@Table(name = "PHIM")
public class Phim {

    @Id
    @Column(name = "MAPHIM",nullable = false, updatable = false)
    private String maPhim;

    @Column(name = "TENPHIM")
    private String tenPhim;

    @Column(name = "THOILUONG")
    private Integer thoiLuong;

    @Column(name = "THELOAI")
    private String theLoai;

    @Column(name = "XUATXU")
    private String xuatXu;

    @Column(name = "MOTA")
    private String moTa;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MANCC")
    private Ncc maNcc;
}

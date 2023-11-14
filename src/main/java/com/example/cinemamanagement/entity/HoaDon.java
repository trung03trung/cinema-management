package com.example.cinemamanagement.entity;


import lombok.Data;

import javax.persistence.*;
import java.time.OffsetDateTime;


@Entity
@Data
@Table(name = "HOADON")
public class HoaDon {

    @Id
    @Column(name = "MAHD",nullable = false, updatable = false)
    private String maHD;

    @Column(name = "THOIGIAN",columnDefinition = "datetime2")
    private OffsetDateTime thoiGian;

    @Column(name = "TONGTIEN")
    private Double tongTien;

    @Column(name = "GIAMGIA")
    private Double giamGia;

    @Column(name = "THANHTIEN")
    private Double thanhTien;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MABV")
    private BanVe maBV;
}

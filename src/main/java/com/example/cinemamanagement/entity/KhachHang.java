package com.example.cinemamanagement.entity;


import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Data
@Table(name = "KHACHHANG")
public class KhachHang {

    @Id
    @Column(name = "MAKH",nullable = false, updatable = false)
    private String maKh;

    @Column(name = "TEN")
    private String ten;

    @Column(name = "DIACHI")
    private String diaChi;

    @Column(name = "SDT")
    private String sdt;

    @Column(name = "NGAYSINH")
    private LocalDate ngaySinh;
}

package com.example.cinemamanagement.entity;


import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Data
@Table(name = "NHANVIEN")
public class NhanVien {

    @Id
    @Column(name = "MANV",nullable = false, updatable = false)
    private String maNv;

    @Column(name = "TEN")
    private String ten;

    @Column(name = "DIACHI")
    private String diaChi;

    @Column(name = "SDT")
    private String sdt;

    @Column(name = "NGAYSINH")
    private LocalDate ngaySinh;

    @Column(name = "CHUCVU")
    private String chucVu;

    @Column(name = "TENDANGNHAP")
    private String tenDangNhap;

    @Column(name = "MATKHAU")
    private String matKhau;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MARAPPHIM")
    private RapPhim rapPhim;
}

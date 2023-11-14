package com.example.cinemamanagement.entity;


import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.util.Date;

@Entity
@Data
@Table(name = "BANVE")
public class BanVe {

    @Id
    @Column(name = "MABV",nullable = false, updatable = false)
    private String maBV;

    @Column(name = "THOIGIAN")
    private LocalDate thoiGian;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MAKH")
    private KhachHang maKh;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MANV")
    private NhanVien maNv;
}

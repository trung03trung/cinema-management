package com.example.cinemamanagement.entity;


import lombok.Data;

import javax.persistence.*;
import java.time.OffsetDateTime;

@Entity
@Data
@Table(name = "BANVE")
public class BanVe {

    @Id
    @Column(name = "MABV",nullable = false, updatable = false)
    private String maBV;

    @Column(name = "THOIGIAN",columnDefinition = "datetime2")
    private OffsetDateTime thoiGian;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MAKH")
    private KhachHang maKh;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MANV")
    private NhanVien maNv;
}

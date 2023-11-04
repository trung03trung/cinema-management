package com.example.cinemamanagement.entity;


import lombok.Data;

import javax.persistence.*;
import java.time.OffsetDateTime;


@Entity
@Data
public class HoaDon {

    @Id
    @Column(nullable = false, updatable = false)
    private String maHd;

    @Column(columnDefinition = "datetime2")
    private OffsetDateTime thoiGian;

    @Column
    private Double tongTien;

    @Column
    private Double giamGia;

    @Column
    private Double thanhTien;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ma_bv_id")
    private BanVe maBv;
}

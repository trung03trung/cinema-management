package com.example.cinemamanagement.entity;


import lombok.Data;

import javax.persistence.*;
import java.time.OffsetDateTime;

@Entity
@Data
@Table(name = "CHIEU")
public class Chieu {

    @Id
    @Column(name = "MACHIEU",nullable = false, updatable = false)
    private String maChieu;

    @Column(name = "THOIGIANCHIEU",columnDefinition = "datetime2")
    private OffsetDateTime thoiGianChieu;

    @Column(name = "GIASUATCHIEU")
    private Double giaSuatChieu;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MAPHONG")
    private Phong maPhong;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MAPHIM")
    private Phim maPhim;
}

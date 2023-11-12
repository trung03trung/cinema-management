package com.example.cinemamanagement.entity;


import lombok.Data;

import javax.persistence.*;
import java.time.OffsetDateTime;


@Entity
@Data
@Table(name = "VE")
public class Ve {

    @Id
    @Column(name = "MAVE",nullable = false, updatable = false)
    private String maVe;

    @Column(name = "THOIGIAN",columnDefinition = "datetime2")
    private OffsetDateTime thoiGian;

    @Column(name = "GIAVE")
    private Double giaVe;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MACHIEU")
    private Chieu maChieu;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MAGHE")
    private Ghe maGhe;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MABV")
    private BanVe maBv;
}

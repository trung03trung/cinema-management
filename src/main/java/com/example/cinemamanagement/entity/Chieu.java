package com.example.cinemamanagement.entity;


import lombok.Data;

import javax.persistence.*;
import java.time.OffsetDateTime;

@Entity
@Data
public class Chieu {

    @Id
    @Column(nullable = false, updatable = false)
    private String maChieu;

    @Column(columnDefinition = "datetime2")
    private OffsetDateTime thoiGianChieu;

    @Column
    private Double giaSuatChieu;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ma_phong_id")
    private Phong maPhong;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ma_phim_id")
    private Phim maPhim;
}

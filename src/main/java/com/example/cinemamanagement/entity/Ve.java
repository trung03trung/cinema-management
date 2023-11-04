package com.example.cinemamanagement.entity;


import lombok.Data;

import javax.persistence.*;
import java.time.OffsetDateTime;


@Entity
@Data
public class Ve {

    @Id
    @Column(nullable = false, updatable = false)
    private String maVe;

    @Column(columnDefinition = "datetime2")
    private OffsetDateTime thoiGian;

    @Column
    private Double giaVe;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ma_chieu_id")
    private Chieu maChieu;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ma_ghe_id")
    private Ghe maGhe;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ma_bv_id")
    private BanVe maBv;
}

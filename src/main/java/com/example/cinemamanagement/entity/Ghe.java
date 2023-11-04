package com.example.cinemamanagement.entity;


import lombok.Data;

import javax.persistence.*;
import java.util.Set;


@Entity
@Data
public class Ghe {

    @Id
    @Column(nullable = false, updatable = false)
    private String maGhe;

    @Column
    private Integer hang;

    @Column
    private Integer cotThu;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ma_phong_id")
    private Phong maPhong;
}

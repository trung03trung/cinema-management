package com.example.cinemamanagement.entity;



import lombok.Data;

import javax.persistence.*;


@Entity
@Data
public class Phong {

    @Id
    @Column(nullable = false, updatable = false)
    private String maPhong;

    @Column
    private Integer soHang;

    @Column
    private Integer soCot;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ma_rap_phim_id")
    private RapPhim maRapPhim;

}

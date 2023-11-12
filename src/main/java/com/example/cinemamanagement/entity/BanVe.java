package com.example.cinemamanagement.entity;


import lombok.Data;

import javax.persistence.*;
import java.time.OffsetDateTime;

@Entity
@Data
public class BanVe {

    @Id
    @Column(nullable = false, updatable = false)
    private String maBV;

    @Column(columnDefinition = "datetime2")
    private OffsetDateTime thoiGian;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ma_kh_id")
    private KhachHang maKh;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ma_nv_id")
    private NhanVien maNv;
}

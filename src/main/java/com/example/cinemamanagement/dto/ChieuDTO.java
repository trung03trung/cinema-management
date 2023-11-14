package com.example.cinemamanagement.dto;

import lombok.Data;

import java.time.OffsetDateTime;

@Data
public class ChieuDTO {
    private String maChieu;
    private String maPhong;
    private String maPhim;
    private Double giaSuatChieu;
    private OffsetDateTime thoiGianChieu;
    private String tenPhim;
    private String theLoai;
    private int thoiLuong;

}

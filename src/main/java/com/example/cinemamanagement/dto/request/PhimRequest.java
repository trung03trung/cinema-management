package com.example.cinemamanagement.dto.request;

import lombok.Data;

@Data
public class PhimRequest {
    private String maPhim;
    private String tenPhim;
    private Integer thoiLuong;
    private String theLoai;
    private String xuatXu;
    private String moTa;
    private String maNcc;
}

package com.example.cinemamanagement.dto;

import com.example.cinemamanagement.entity.BanVe;
import lombok.Data;

import javax.persistence.*;
import java.time.OffsetDateTime;

@Data
public class HoaDonDto {

    private String maHD;

    private OffsetDateTime thoiGian;

    private Double tongTien;

    private Double giamGia;

    private Double thanhTien;
}

package com.example.cinemamanagement.dto;

import lombok.Data;
import java.time.LocalDate;

@Data
public class KhachHangDto {
    private String maKh;
    private String ten;
    private String diaChi;
    private String sdt;
    private LocalDate ngaySinh;
}

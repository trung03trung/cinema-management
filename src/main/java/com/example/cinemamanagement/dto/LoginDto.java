package com.example.cinemamanagement.dto;

import lombok.Data;
import java.time.LocalDate;

@Data
public class LoginDto {

    private String maNv;

    private String ten;

    private String diaChi;

    private String sdt;

    private LocalDate ngaySinh;

    private String chucVu;

    private String tenDangNhap;

    private String matKhau;

}

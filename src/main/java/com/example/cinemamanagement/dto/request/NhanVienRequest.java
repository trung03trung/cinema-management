package com.example.cinemamanagement.dto.request;

import com.example.cinemamanagement.entity.RapPhim;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
public class NhanVienRequest {
    private String maNv;
    private String ten;
    private String diaChi;
    private String sdt;
    private LocalDate ngaySinh;
    private String chucVu;
    private String tenDangNhap;
    private String matKhau;
    private String maRapPhim;
}

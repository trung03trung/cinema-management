package com.example.cinemamanagement.dto;

import com.example.cinemamanagement.entity.KhachHang;
import com.example.cinemamanagement.entity.NhanVien;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.OffsetDateTime;

@Data
public class BanVeDto {
    private String maBV;

    private OffsetDateTime thoiGian;

}

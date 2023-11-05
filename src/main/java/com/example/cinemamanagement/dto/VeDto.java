package com.example.cinemamanagement.dto;

import com.example.cinemamanagement.entity.BanVe;
import com.example.cinemamanagement.entity.Chieu;
import com.example.cinemamanagement.entity.Ghe;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.OffsetDateTime;

@Data
public class VeDto {

    private String maVe;


    private OffsetDateTime thoiGian;

    private Double giaVe;

}

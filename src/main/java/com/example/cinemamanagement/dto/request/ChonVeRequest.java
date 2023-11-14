package com.example.cinemamanagement.dto.request;

import lombok.Data;

@Data
public class ChonVeRequest {
    private String maLich;
    private String maPhong;
    private Integer hang;
    private Integer cot;
    private String maBanVe;

}

package com.example.cinemamanagement.service;

import com.example.cinemamanagement.dto.BanVeDto;
import com.example.cinemamanagement.dto.ChonVeDto;
import com.example.cinemamanagement.dto.HoaDonDto;
import com.example.cinemamanagement.dto.VeDto;
import com.example.cinemamanagement.dto.request.BanVeRequest;
import com.example.cinemamanagement.dto.request.ChonVeRequest;
import com.example.cinemamanagement.dto.request.DatVeRequest;
import com.example.cinemamanagement.dto.request.HoaDonRequest;

public interface VeService {
    public BanVeDto banVe(BanVeRequest request);
    public VeDto datVe(DatVeRequest request);
    public HoaDonDto taoHoaDon(HoaDonRequest request);
    public ChonVeDto chonVe(ChonVeRequest request);

}

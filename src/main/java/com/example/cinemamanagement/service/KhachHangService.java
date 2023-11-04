package com.example.cinemamanagement.service;

import com.example.cinemamanagement.dto.KhachHangDto;

import java.util.List;

public interface KhachHangService {
    public List<KhachHangDto> searchKHByTen(String ten);

    public void addKhachHang(KhachHangDto request);
}

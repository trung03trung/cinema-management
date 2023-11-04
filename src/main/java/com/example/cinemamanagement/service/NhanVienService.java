package com.example.cinemamanagement.service;

import com.example.cinemamanagement.dto.request.NhanVienRequest;
import org.springframework.stereotype.Service;

@Service
public interface NhanVienService {
    public void addNhanVien(NhanVienRequest request);
}

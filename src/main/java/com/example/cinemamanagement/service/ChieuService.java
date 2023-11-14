package com.example.cinemamanagement.service;

import com.example.cinemamanagement.dto.ChieuDTO;
import com.example.cinemamanagement.entity.Chieu;

import java.util.List;

public interface ChieuService {
   List<ChieuDTO> findListChieuByPhim(String tenPhim);
}

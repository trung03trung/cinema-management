package com.example.cinemamanagement.service.impl;

import com.example.cinemamanagement.dto.KhachHangDto;
import com.example.cinemamanagement.entity.KhachHang;
import com.example.cinemamanagement.repository.KhachHangRepository;
import com.example.cinemamanagement.service.KhachHangService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class KhachHangServiceImpl implements KhachHangService {
    @Autowired
    private KhachHangRepository khachHangRepository;

    @Override
    public List<KhachHangDto> searchKHByTen(String ten) {
        List<KhachHang> khachHangList = khachHangRepository.searchKhachHangByTen(ten);
        return khachHangList.stream().map(entity -> {
            KhachHangDto dto = new KhachHangDto();
            BeanUtils.copyProperties(entity, dto);
            return dto;
        }).collect(Collectors.toList());
    }

    @Override
    public void addKhachHang(KhachHangDto request) {
        KhachHang khachHang = new KhachHang();
        BeanUtils.copyProperties(request,khachHang);
        khachHangRepository.save(khachHang);
    }
}

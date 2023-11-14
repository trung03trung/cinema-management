package com.example.cinemamanagement.service.impl;

import com.example.cinemamanagement.dto.ChieuDTO;
import com.example.cinemamanagement.entity.Chieu;
import com.example.cinemamanagement.mapper.ChieuMapper;
import com.example.cinemamanagement.repository.ChieuRepository;
import com.example.cinemamanagement.service.ChieuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class ChieuIpml implements ChieuService {
    @Autowired
    private ChieuRepository chieuRepository;
    @Autowired
    private ChieuMapper mapper;
    @Override
    public List<ChieuDTO> findListChieuByPhim(String tenPhim) {
        List<Chieu> chieus = chieuRepository.findListChieuByPhim(tenPhim);
        List<ChieuDTO> chieuDTOS=chieus.stream().map(chieu1 ->mapper.convertChieu(chieu1)).collect(Collectors.toList());
        return chieuDTOS;
    }
}

package com.example.cinemamanagement.service.impl;

import com.example.cinemamanagement.dto.BanVeDto;
import com.example.cinemamanagement.dto.HoaDonDto;
import com.example.cinemamanagement.dto.VeDto;
import com.example.cinemamanagement.dto.request.BanVeRequest;
import com.example.cinemamanagement.dto.request.DatVeRequest;
import com.example.cinemamanagement.dto.request.HoaDonRequest;
import com.example.cinemamanagement.entity.BanVe;
import com.example.cinemamanagement.entity.HoaDon;
import com.example.cinemamanagement.entity.Ve;
import com.example.cinemamanagement.repository.BanVeRepository;
import com.example.cinemamanagement.repository.HoaDonRepository;
import com.example.cinemamanagement.repository.VeRepository;
import com.example.cinemamanagement.service.VeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VeServiceImpl implements VeService {
    @Autowired
    private VeRepository veRepository;
    @Autowired
    private HoaDonRepository hoaDonRepository;
    @Autowired
    private BanVeRepository banVeRepository;
    @Override
    public BanVeDto banVe(BanVeRequest request) {
        BanVe banVe = banVeRepository.transaction(request.getMaNv(),request.getMaKh());
        BanVeDto banVeDto =new BanVeDto();
        BeanUtils.copyProperties(banVe, banVeDto);
        return banVeDto;
    }

    @Override
    public VeDto datVe(DatVeRequest request) {
        Ve ve = veRepository.createTickKet(request.getMaLich(), request.getMaGhe(), request.getMaBanVe());
        VeDto veDto = new VeDto();
        BeanUtils.copyProperties(ve,veDto);
        return veDto;
    }

    @Override
    public HoaDonDto taoHoaDon(HoaDonRequest request) {
        HoaDon hoaDon = hoaDonRepository.createBill(request.getMaBanVe());

        HoaDonDto hoaDonDto = new HoaDonDto();
        BeanUtils.copyProperties(hoaDon,hoaDonDto);
        return hoaDonDto;
    }
}

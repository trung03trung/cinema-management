package com.example.cinemamanagement.service.impl;

import com.example.cinemamanagement.dto.BanVeDto;
import com.example.cinemamanagement.dto.ChonVeDto;
import com.example.cinemamanagement.dto.HoaDonDto;
import com.example.cinemamanagement.dto.VeDto;
import com.example.cinemamanagement.dto.request.BanVeRequest;
import com.example.cinemamanagement.dto.request.ChonVeRequest;
import com.example.cinemamanagement.dto.request.DatVeRequest;
import com.example.cinemamanagement.dto.request.HoaDonRequest;
import com.example.cinemamanagement.entity.*;
import com.example.cinemamanagement.repository.*;
import com.example.cinemamanagement.service.VeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class VeServiceImpl implements VeService {
    @Autowired
    private VeRepository veRepository;
    @Autowired
    private HoaDonRepository hoaDonRepository;
    @Autowired
    private BanVeRepository banVeRepository;
    @Autowired
    private GheRepository gheRepository;
    @Autowired
    private PhongRepository phongRepository;
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

    @Override
    public ChonVeDto chonVe(ChonVeRequest request) {
        Optional<Phong> phong = phongRepository.findById(request.getMaPhong());
        if(phong.isEmpty()) return null;
        Ghe ghe = gheRepository.findByMaPhongAndHangAndCotThu(phong.get(), request.getHang(), request.getCot());
        ChonVeDto chonVeDto = new ChonVeDto();
        if(ghe!=null){
            chonVeDto.setMaLich(request.getMaLich());
            chonVeDto.setMaGhe(ghe.getMaGhe());
            chonVeDto.setHang(request.getHang());
            chonVeDto.setCot(request.getCot());
            chonVeDto.setMaBanVe(request.getMaBanVe());
        }else {
            chonVeDto = null;
        }

        return chonVeDto;
    }
}

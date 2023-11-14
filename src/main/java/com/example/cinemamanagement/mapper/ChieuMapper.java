package com.example.cinemamanagement.mapper;

import com.example.cinemamanagement.dto.ChieuDTO;
import com.example.cinemamanagement.entity.Chieu;
import com.example.cinemamanagement.entity.Phim;
import com.example.cinemamanagement.repository.PhimRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class ChieuMapper {
    @Autowired
    private PhimRepository phimRepository;
    public  ChieuDTO convertChieu(Chieu chieu){
        ChieuDTO chieuDTO = new ChieuDTO();
        chieuDTO.setMaChieu(chieu.getMaChieu());
        chieuDTO.setMaPhong(chieu.getMaPhong().getMaPhong());
        chieuDTO.setMaPhim(chieu.getMaPhim().getMaPhim());
        chieuDTO.setGiaSuatChieu(chieu.getGiaSuatChieu());
        chieuDTO.setThoiGianChieu(chieu.getThoiGianChieu());
        Optional<Phim> phim = phimRepository.findByMaPhim(chieu.getMaPhim().getMaPhim());
        if(phim.isEmpty()){
            chieuDTO.setTenPhim(null);
            chieuDTO.setThoiLuong(0);
            chieuDTO.setTheLoai(null);

        }else {
            chieuDTO.setTenPhim(phim.get().getTenPhim());
            chieuDTO.setThoiLuong(phim.get().getThoiLuong());
            chieuDTO.setTheLoai(phim.get().getTheLoai());
        }
        return chieuDTO;

    }


}

package com.example.cinemamanagement.service.impl;

import com.example.cinemamanagement.dto.LoginDto;
import com.example.cinemamanagement.dto.request.LoginRequest;
import com.example.cinemamanagement.dto.request.NhanVienRequest;
import com.example.cinemamanagement.entity.NhanVien;
import com.example.cinemamanagement.entity.RapPhim;
import com.example.cinemamanagement.repository.NhanVienRepository;
import com.example.cinemamanagement.repository.RapPhimRepository;
import com.example.cinemamanagement.service.NhanVienService;
import com.example.cinemamanagement.utils.BusinessException;
import com.example.cinemamanagement.utils.ErrorMessage;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class NhanVienServiceImpl implements NhanVienService {

    @Autowired
    private RapPhimRepository rapPhimRepository;

    @Autowired
    private NhanVienRepository nhanVienRepository;

    @Override
    @Transactional
    public void addNhanVien(NhanVienRequest request) {
        NhanVien nv = new NhanVien();
        RapPhim rapPhim = rapPhimRepository.findById(request.getMaRapPhim()).orElseThrow(() ->
                new BusinessException(ErrorMessage.OBJECT_NOT_FOUND.format("Rạp phim")));
        BeanUtils.copyProperties(request,nv);
        nv.setRapPhim(rapPhim);
        nhanVienRepository.save(nv);
    }

    @Override
    public LoginDto login(LoginRequest request) {
        List<NhanVien> nhanViens = nhanVienRepository.findAllByMatKhauAndTenDangNhap(request.getPassWord(), request.getUserName());
        if(nhanViens.isEmpty()){
            return null;
        }
        LoginDto loginDto = new LoginDto();
        BeanUtils.copyProperties(nhanViens.get(0),loginDto);
        return loginDto;
    }
}

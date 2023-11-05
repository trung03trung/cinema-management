package com.example.cinemamanagement.service.impl;

import com.example.cinemamanagement.dto.request.PhimRequest;
import com.example.cinemamanagement.entity.Ncc;
import com.example.cinemamanagement.entity.NhanVien;
import com.example.cinemamanagement.entity.Phim;
import com.example.cinemamanagement.entity.RapPhim;
import com.example.cinemamanagement.repository.NccRepository;
import com.example.cinemamanagement.repository.PhimRepository;
import com.example.cinemamanagement.service.PhimService;
import com.example.cinemamanagement.utils.BusinessException;
import com.example.cinemamanagement.utils.ErrorMessage;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class PhimServiceImpl implements PhimService {
    @Autowired
    private NccRepository nccRepository;
    @Autowired
    private PhimRepository phimRepository;
    @Override
    public void addPhim(PhimRequest request) {
        Phim phim = new Phim();
        Ncc ncc = nccRepository.findById(request.getMaNcc()).orElseThrow(() ->
                new BusinessException(ErrorMessage.OBJECT_NOT_FOUND.format("Nhà cung cấp")));
        BeanUtils.copyProperties(request,phim);
        phim.setMaNcc(ncc);
        phimRepository.save(phim);
    }
}

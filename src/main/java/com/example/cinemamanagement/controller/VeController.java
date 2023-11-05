package com.example.cinemamanagement.controller;

import com.example.cinemamanagement.dto.BanVeDto;
import com.example.cinemamanagement.dto.HoaDonDto;
import com.example.cinemamanagement.dto.VeDto;
import com.example.cinemamanagement.dto.request.BanVeRequest;
import com.example.cinemamanagement.dto.request.DatVeRequest;
import com.example.cinemamanagement.dto.request.HoaDonRequest;
import com.example.cinemamanagement.service.VeService;
import com.example.cinemamanagement.utils.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/ve")
public class VeController {
    @Autowired
    private VeService veService;
    @PostMapping("/add")
    public ResponseEntity<ResponseData<VeDto>> datVe(@RequestBody DatVeRequest request){
      VeDto veDto =  veService.datVe(request);
        return ResponseEntity.ok(ResponseData.success(veDto));
    }

    @PostMapping("/giao-dich")
    public ResponseEntity<ResponseData<BanVeDto>> banVe(@RequestBody BanVeRequest request){
        BanVeDto banVeDto =  veService.banVe(request);
        return ResponseEntity.ok(ResponseData.success(banVeDto));
    }


    @PostMapping("/create-bill")
    public ResponseEntity<ResponseData<HoaDonDto>> taoHoaDon(@RequestBody HoaDonRequest request){
        HoaDonDto hoaDonDto =  veService.taoHoaDon(request);
        return ResponseEntity.ok(ResponseData.success(hoaDonDto));
    }
}

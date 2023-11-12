package com.example.cinemamanagement.controller;

import com.example.cinemamanagement.dto.KhachHangDto;
import com.example.cinemamanagement.service.KhachHangService;
import com.example.cinemamanagement.utils.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/khach-hang")
public class KhachHangController {
    @Autowired
    private KhachHangService khachHangService;

    @GetMapping("/search-kh-by-ten")
    public ResponseEntity<ResponseData<List<KhachHangDto>>> searchKHbyTen(@RequestParam(name = "ten") String ten){
        List<KhachHangDto> response = khachHangService.searchKHByTen(ten);
        return ResponseEntity.ok(ResponseData.success(response));
    }

    @PostMapping("/add")
    public ResponseEntity<ResponseData<String>> addKhachHang(@RequestBody KhachHangDto request){
        khachHangService.addKhachHang(request);
        return ResponseEntity.ok(ResponseData.success("OK"));
    }
}

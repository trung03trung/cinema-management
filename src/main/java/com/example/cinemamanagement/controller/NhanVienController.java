package com.example.cinemamanagement.controller;

import com.example.cinemamanagement.dto.request.NhanVienRequest;
import com.example.cinemamanagement.service.NhanVienService;
import com.example.cinemamanagement.utils.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/nhan-vien")
public class NhanVienController {
    @Autowired
    private NhanVienService nhanVienService;

    @RequestMapping("/add")
    public ResponseEntity<ResponseData<?>> addNhanVien(@RequestBody NhanVienRequest request){
        nhanVienService.addNhanVien(request);
        return ResponseEntity.ok(ResponseData.success());
    }
}

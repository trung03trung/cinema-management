package com.example.cinemamanagement.controller;

import com.example.cinemamanagement.dto.request.PhimRequest;
import com.example.cinemamanagement.service.PhimService;
import com.example.cinemamanagement.utils.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/phim")
public class PhimController {

    @Autowired
    private PhimService phimService;
    @PostMapping("/add")
    public ResponseEntity<ResponseData<String>> addPhim(@RequestBody PhimRequest request){
        phimService.addPhim(request);
        return ResponseEntity.ok(ResponseData.success("OK"));
    }
}

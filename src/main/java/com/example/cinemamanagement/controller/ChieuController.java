package com.example.cinemamanagement.controller;

import com.example.cinemamanagement.dto.ChieuDTO;
import com.example.cinemamanagement.dto.request.NhanVienRequest;
import com.example.cinemamanagement.service.ChieuService;
import com.example.cinemamanagement.utils.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/lich-chieu")
public class ChieuController {
    @Autowired
    private ChieuService chieuService;
    @GetMapping("/find")
    public ResponseEntity<ResponseData<?>> findListChieuByPhim(@RequestParam(name = "ten") String ten){
       List<ChieuDTO> chieuDTOList= chieuService.findListChieuByPhim(ten);
        return ResponseEntity.ok(ResponseData.success(chieuDTOList));
    }
}

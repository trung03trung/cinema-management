package com.example.cinemamanagement.repository;

import com.example.cinemamanagement.entity.KhachHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface KhachHangRepository extends JpaRepository<KhachHang,String> {
    @Query(value = "SEARCHCUSTOMER :ten",nativeQuery = true)
    List<KhachHang> searchKhachHangByTen(@Param("ten") String ten);
}

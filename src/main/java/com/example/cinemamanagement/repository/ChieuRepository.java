package com.example.cinemamanagement.repository;

import com.example.cinemamanagement.entity.BanVe;
import com.example.cinemamanagement.entity.Chieu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ChieuRepository extends JpaRepository<Chieu,String> {
    @Query(value = "TIM_CHIEU_BY_NAME :TenPhim",nativeQuery = true)
    List<Chieu> findListChieuByPhim(@Param("TenPhim") String tenPhim);
}

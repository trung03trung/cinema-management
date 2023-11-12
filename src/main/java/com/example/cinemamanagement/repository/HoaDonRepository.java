package com.example.cinemamanagement.repository;

import com.example.cinemamanagement.entity.HoaDon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

public interface HoaDonRepository extends JpaRepository<HoaDon,String> {
    @Transactional
    @Query(value = " CREATEBILL :MaBv",nativeQuery = true)
    HoaDon createBill( @Param("MaBv") String maBanVe);
}

package com.example.cinemamanagement.repository;
import com.example.cinemamanagement.entity.BanVe;
import com.example.cinemamanagement.entity.HoaDon;
import com.example.cinemamanagement.entity.Ve;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface VeRepository extends JpaRepository<Ve,String> {


    @Query(value = " ODERTICKET :MaChieu,:MaGhe,:MaBanVe",nativeQuery = true)
    Ve createTickKet(@Param("MaChieu") String maChieu,@Param("MaGhe") String maGhe,@Param("MaBanVe") String maBanVe);


}

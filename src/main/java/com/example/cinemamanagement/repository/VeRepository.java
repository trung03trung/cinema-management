package com.example.cinemamanagement.repository;
import com.example.cinemamanagement.entity.BanVe;
import com.example.cinemamanagement.entity.HoaDon;
import com.example.cinemamanagement.entity.Ve;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface VeRepository extends JpaRepository<Ve,String> {
    @Query(value = "CREATETRANSACTION (:maNv,:maKh)",nativeQuery = true)
    BanVe transaction(@Param("maNv") String maNv,@Param("maKh") String maKh);

    @Query(value = "ODERTICKET (:maChieu,:maGhe,:maBanVe)",nativeQuery = true)
    Ve createTickKet(@Param("maVe") String maChieu,@Param("maGhe") String maGhe,@Param("maBanVe") String maBanVe);

    @Query(value = "CREATEBILL (:maNv,:maKh,:maBanVe)",nativeQuery = true)
    HoaDon createBill(@Param("maNv") String maNv, @Param("maKh") String maKh, @Param("maBanVe") String maBanVe);
}

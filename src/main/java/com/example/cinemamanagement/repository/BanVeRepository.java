package com.example.cinemamanagement.repository;

import com.example.cinemamanagement.entity.BanVe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface BanVeRepository extends JpaRepository<BanVe,String> {
    @Query(value = "CREATETRANSACTION :MaNv,:MaKh",nativeQuery = true)
    BanVe transaction(@Param("MaNv") String maNv, @Param("MaKh") String maKh);
}

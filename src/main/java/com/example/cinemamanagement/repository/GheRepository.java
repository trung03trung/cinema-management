package com.example.cinemamanagement.repository;

import com.example.cinemamanagement.entity.Ghe;
import com.example.cinemamanagement.entity.Phong;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GheRepository extends JpaRepository<Ghe,String> {
    Ghe findByMaPhongAndHangAndCotThu(Phong phong, Integer hang, Integer cot);
}

package com.example.cinemamanagement.repository;

import com.example.cinemamanagement.entity.Phim;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PhimRepository extends JpaRepository<Phim,String> {
    Optional<Phim> findByMaPhim(String ma);
}

package com.example.cinemamanagement.repository;

import com.example.cinemamanagement.entity.Phim;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhimRepository extends JpaRepository<Phim,String> {
}

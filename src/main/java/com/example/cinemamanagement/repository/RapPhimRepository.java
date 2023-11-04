package com.example.cinemamanagement.repository;

import com.example.cinemamanagement.entity.RapPhim;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RapPhimRepository extends JpaRepository<RapPhim,String> {
}

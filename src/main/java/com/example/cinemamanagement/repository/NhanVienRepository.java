package com.example.cinemamanagement.repository;

import com.example.cinemamanagement.entity.NhanVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NhanVienRepository extends JpaRepository<NhanVien,String> {
    List<NhanVien> findAllByMatKhauAndTenDangNhap(String matKhau, String tenDangNhap);
}

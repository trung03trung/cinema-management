package com.example.cinemamanagement.entity;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
@Data

public class Ncc {

    @Id
    @Column(name = "MANCC",nullable = false, updatable = false)
    private String maNcc;

    @Column(name = "TEN")
    private String ten;

    @Column(name = "DIACHI")
    private String diaChi;

    @Column(name = "SDT")
    private String sdt;
}

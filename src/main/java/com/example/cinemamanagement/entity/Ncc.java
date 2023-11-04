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
    @Column(nullable = false, updatable = false)
    private String maNcc;

    @Column
    private String ten;

    @Column
    private String diaChi;

    @Column
    private String sdt;
}

package com.james.pojo;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "vehicle")
//商品
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vid")
    private int vid;
    @Column(name = "v_name")
    private String vname;
    @Column(name = "v_picture")
    private String vpicture;
    @Column(name = "v_brand")
    private String vbrand;
    @Column(name = "v_site")
    private String vsite;
    @Column(name = "v_sort")
    private String vsort;
    @Column(name = "v_workoff")
    private double vworkoff;
    @Column(name = "v_color")
    private String vcolor;
    @Column(name = "v_money")
    private double vmoney;
    @Column(name = "v_li")
    private String vli;
    @Column(name = "pid")
    private int pid;


}

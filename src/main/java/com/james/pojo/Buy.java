package com.james.pojo;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "buy")
//买卖表
public class Buy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bid;
    @Column(name = "bname")
    private String bname;
    @Column(name = "bvehicke")
    private String bvehicke;
    @Column(name = "bcolor")
    private String bcolor;
    @Column(name = "btime")
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private Date btime;
    @Column(name = "bcount")
    private int bcount;
    @Column(name = "bmoney")
    private int bmoney;
    @Column(name = "maiami")
    private String maimai;

}

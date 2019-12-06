package com.james.pojo;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "rode")
//角色
public class Rode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rrid;
    @Column(name = "rr_name")
    private String rrname;
    @Column(name = "rr_time")
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private Date rrtime;


}

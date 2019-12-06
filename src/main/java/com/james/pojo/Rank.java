package com.james.pojo;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "rank")
//权限  等级
public class Rank {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rid;
    @Column(name = "r_name")
    private String name;
    @Column(name = "r_message")
    private String message;
    @Column(name = "r_time")
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private Date rtime;
}

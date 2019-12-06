package com.james.pojo;

import lombok.Data;
import org.hibernate.exception.DataException;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "productdatails")
//商品详情
public class Productdatails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pid;
    @Column(name = "p_name")
    private String pname;
    @Column(name = "p_vehicle")
    private String pvehicle;
    @Column(name = "p_cost")
    private String pcost;
    @Column(name = "p_color")
    private String pcolor;
    @Column(name = "p_preaenter")
    private String ppresenter;
    @Column(name = "p_time")
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private DataException ptime;
    @Column(name = "p_times")
    private Date ptimes;
    @Column(name = "p_site")
    private String psite;

}

package com.james.pojo;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name ="users")
//用户
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "uid")
    private int uid;
    @Column(name = "uname")
    private String uname;
    @Column(name = "upass")
    private String upass;
    @Column(name = "email")
    private String email;
    @Column(name = "grade")
    private String grade;
    @Column(name = "usertime")
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private Date usertime;
    @Column(name = "oid")
    private int oid;
    @Column(name = "bid")
    private int bid;
    private String did;

}

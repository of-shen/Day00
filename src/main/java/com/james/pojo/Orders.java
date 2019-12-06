package com.james.pojo;

import lombok.Data;

import java.util.Date;

@Data
//订单表
public class Orders {

    private int oid;

    private String  oname;

    private String ovehicle;

    private String ocolor;

    private Date otime;

    private double omoney;

    private int ocount;

    private String omaimai;
}

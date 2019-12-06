package com.james.service;

import com.james.bean.IndexRequest;
import com.james.bean.IndexResponse;
import com.james.pojo.Vehicle;

import java.util.List;

public interface VehicleService {

    //全查
    List<Vehicle>getAllVehicle();

    //修改
    boolean updateVehicle(int vid);

    //新增
    boolean insertVehicle(Vehicle vehicle);

    //删除
    boolean deleteVehicle(int vid);

    //名字查
    Vehicle getAllVehicleVname(String vname);


    IndexResponse findBySearch(IndexRequest indexRequest);
    List findByClick(Integer num);


    void addClick(Integer id);
}

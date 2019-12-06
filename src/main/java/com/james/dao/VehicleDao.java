package com.james.dao;

import com.james.bean.IndexRequest;
import com.james.pojo.Vehicle;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface VehicleDao {
    //全查
    List<Vehicle>getAllVehicle();

    //添加商品
    boolean insertVehicle(Vehicle vehicle );

    //修改
    boolean updateVehicle(int vid);

    //删除
    boolean deleteVehicle(int vid);

    //名字查
    Vehicle getAllVehicleVname(String vname);

    //商品类别



    List<Vehicle> findBySearchTag(IndexRequest indexRequest);
    Integer findTotal(IndexRequest indexRequest);
    int findCid(@Param("vname") String vname, @Param("vli") String vli);
    List findByClick(Integer num);

    void addClick(Integer id);

}

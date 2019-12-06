package com.james.service.impl;

import com.james.bean.IndexRequest;
import com.james.bean.IndexResponse;
import com.james.dao.VehicleDao;
import com.james.pojo.Users;
import com.james.pojo.Vehicle;
import com.james.service.VehicleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class VehicleServiceImpl implements VehicleService {
    @Resource
    private VehicleDao vehicleDao;

    @Override
    public List<Vehicle> getAllVehicle() {
        return vehicleDao.getAllVehicle();
    }
//修改
    @Override
    public boolean updateVehicle(int vid) {

        return vehicleDao.updateVehicle(vid);
    }

    @Override
    public boolean insertVehicle(Vehicle vehicle) {

        return vehicleDao.insertVehicle(vehicle);
    }

    @Override
    public boolean deleteVehicle(int vid) {

        return vehicleDao.deleteVehicle(vid);
    }

    @Override
    public Vehicle getAllVehicleVname(String vname) {
        return vehicleDao.getAllVehicleVname(vname);
    }

    @Override
    public IndexResponse findBySearch(IndexRequest indexRequest) {
        IndexResponse indexResponse=new IndexResponse();
        List<Vehicle>bySearchTag=vehicleDao.findBySearchTag(indexRequest);
        long total=vehicleDao.findTotal(indexRequest);
        indexResponse.setTotal(total);
        indexResponse.setCars(bySearchTag);
        return indexResponse;
    }

    @Override
    public List findByClick(Integer num) {
        return vehicleDao.findByClick(num);

    }

    @Override
    public void addClick(Integer id) {
     vehicleDao.addClick(id);
    }
}

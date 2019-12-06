package com.james.controller;

import com.james.bean.IndexRequest;
import com.james.bean.IndexResponse;
import com.james.pojo.Vehicle;
import com.james.service.VehicleService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.management.StringValueExp;
import java.util.List;

@RestController

public class VehicleController {



@Resource
private VehicleService vehicleService;
//全查
  @RequestMapping("/vehicle")
    public List<Vehicle>add(){
      return vehicleService.getAllVehicle();
  }

  //名字查
  @RequestMapping("/vname/{vname}")
     public Vehicle getAllVehicleVname(@PathVariable String vname){
    return vehicleService.getAllVehicleVname(vname);
  }

  //添加商品
   @RequestMapping("/insertVehicle")
  public boolean insertVehicle (@RequestBody Vehicle vehicle ){

      return vehicleService.insertVehicle(vehicle);
  }

  //商品修改
    @RequestMapping("/updateVehicle")
    public boolean updateVehicle (int vid){
      return vehicleService.updateVehicle(vid);
    }
     //商品删除
    @RequestMapping("/deleteVehicle")
    public boolean deleteVehicle(int vid){
      return vehicleService.deleteVehicle(vid);
    }


    @RequestMapping("/index")
  public IndexResponse index (@RequestBody IndexRequest indexRequest){
    indexRequest.setCurrentIndex((indexRequest.getCurrentPage()-1)*indexRequest.getSize());
      IndexResponse bySearch=vehicleService.findBySearch(indexRequest);
      return bySearch;
    }

    @RequestMapping("/findByClick/{num}")
  public List findByClick(@PathVariable("num")Integer num ){
    return vehicleService.findByClick(num);
    }
    @RequestMapping("/addClick/{id}")
  public String addClick(@PathVariable("id")int id){
    vehicleService.addClick(id);
    return "点击量加";
    }
}

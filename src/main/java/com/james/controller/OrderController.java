package com.james.controller;

import com.james.service.VehicleService;
import com.james.service.impl.OrderServiceImpl;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

//订单
@RestController
public class OrderController {

    @Resource
    private VehicleService vehicleService;

    @Resource
    private OrderServiceImpl orderService;
//全部查询订单
    @RequestMapping("/order")
    public String order(){
      orderService.getAllOrder();
      return "全查";
    }

    //根据用户查询订单
    @RequestMapping("/userOrder/{uname}")
    private String userOrder(@PathVariable String uname){
    orderService.getAllOrderOid(uname);
    return "用户查询订单";

    }
    //修改订单
    @RequestMapping("/updateorder/{oid}")
    public String updateorder(@PathVariable int oid){

        orderService.updateOrder(oid);
        return "根据用户修改订单";
    }

//    //新增订单
//    @RequestMapping{"/insertOrder/{vi}"}
//    public String insertOrder(@PathVariable int ){
//
//    }

}

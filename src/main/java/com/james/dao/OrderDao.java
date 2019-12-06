package com.james.dao;

import com.james.pojo.Orders;
import com.james.pojo.Vehicle;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
//订单
public interface OrderDao {
  //全部订单
  List<Orders> getAllOrder();

  //订单
    Orders getAllOrderOid(String uname);

  //修改订单
    boolean updateOrder(int oid);

  //删除订单
    boolean deleteOrder(int oid);

  //新增订单
    boolean insertOrder(Orders order);
  //查oid
  Vehicle getVehicle(int vid);

}

package com.james.service;

import com.james.pojo.Orders;

import java.util.List;

public interface OrderService {

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

}

package com.james.service.impl;

import com.james.dao.OrderDao;
import com.james.pojo.Orders;
import com.james.service.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderDao orderDao;

    @Override
    public List<Orders> getAllOrder() {
        return orderDao.getAllOrder();
    }
//用户查询订单
    @Override
    public Orders getAllOrderOid(String uname) {
        return orderDao.getAllOrderOid(uname);
    }

    @Override
    public boolean updateOrder(int oid) {
        return orderDao.updateOrder(oid);
    }

    @Override
    public boolean deleteOrder(int oid) {
        return orderDao.deleteOrder(oid);
    }

    @Override
    public boolean insertOrder(Orders order) {
        return orderDao.insertOrder(order);
    }
}

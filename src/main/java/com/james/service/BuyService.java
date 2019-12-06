package com.james.service;

import com.james.pojo.Buy;

import java.util.List;

public interface BuyService {

    //全查购买
    List<Buy> getAllBey();

    //id 查购买
    Buy getAllBuyBid(int bid);

    //修改购买
    boolean updateBuy(Buy buy);

    //删除不为买和卖可删除  管理员操作
    boolean seleteBuy(int bid);

    //新增购物
    boolean insertBuy(Buy buy);
}

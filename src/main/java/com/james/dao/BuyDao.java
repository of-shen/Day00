package com.james.dao;

import com.james.pojo.Buy;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BuyDao {
    //全查购买
    List<Buy> getAllBey();

    //id 查购买
    Buy getAllBuyBid(int bid);

    //修改购买
    boolean updateBuy(Buy buy);

    //删除不为买和卖可删除
    boolean seleteBuy(int bid);

    //新增购物  买车或卖车
    boolean insertBuy(Buy buy);


}

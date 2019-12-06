package com.james.dao;

import com.james.pojo.Productdatails;
import com.james.pojo.Vehicle;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProductdatailsDao {
    //商品详情
    Productdatails getAllProductdatailsDao(String vname);

    //添加商品详情
    boolean insertProductails(Productdatails productdatails);



}

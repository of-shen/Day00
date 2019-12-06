package com.james.service;

import com.james.pojo.Productdatails;

public interface ProductdatailsService {
    //商品详情
    Productdatails getAllProductdatailsDao(String vname);

    //添加商品详情
    boolean insertProductails(Productdatails productdatails);

}

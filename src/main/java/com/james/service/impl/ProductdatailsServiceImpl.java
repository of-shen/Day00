package com.james.service.impl;

import com.james.dao.ProductdatailsDao;
import com.james.pojo.Productdatails;
import com.james.service.ProductdatailsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ProductdatailsServiceImpl implements ProductdatailsService {

    @Resource
    private ProductdatailsDao productdatailsDao;

    //查询
    @Override
    public Productdatails getAllProductdatailsDao(String vname) {
        return productdatailsDao.getAllProductdatailsDao(vname);
    }

    //增加
    @Override
    public boolean insertProductails(Productdatails productdatails) {
        return productdatailsDao.insertProductails(productdatails);
    }
}

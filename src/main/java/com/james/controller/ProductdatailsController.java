package com.james.controller;

import com.james.pojo.Productdatails;
import com.james.pojo.Vehicle;
import com.james.service.ProductdatailsService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class ProductdatailsController {
//商品详情
    @Resource
    private ProductdatailsService productdatailsService;
//查询详情
    @RequestMapping("/prod/{vname}")
    public Productdatails product(@PathVariable String vname){


     return productdatailsService.getAllProductdatailsDao(vname);
    }
    //新增详情
    @RequestMapping("/insertprod/{vname}")
    public boolean insertprod(@RequestBody Productdatails productdatails){
        return productdatailsService.insertProductails(productdatails);
    }

    //
}

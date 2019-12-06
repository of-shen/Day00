package com.james;

import com.james.controller.ProductdatailsController;
import com.james.controller.VehicleController;
import com.james.pojo.Vehicle;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration
public class testVehicle {

    @Resource
    private VehicleController vehicleController;
    @Resource
    private ProductdatailsController productdatailsController;

    @Test
    public void sqwe(){
//全部商品
        List<Vehicle> add = vehicleController.add();

        System.out.println(add);
    }
//商品详情
    @Test
    public void stes(){

       String aa="宝马7系";
        System.out.println(productdatailsController.product(aa));
    }

    //新增商品
    @Test
    public void stes1(){

    }
}

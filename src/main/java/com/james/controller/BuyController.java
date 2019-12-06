package com.james.controller;

import com.james.pojo.Buy;
import com.james.service.BuyService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
public class BuyController {
    @Resource
    private BuyService buyService;
//全查购物
    @RequestMapping(value = "/buy",method = RequestMethod.GET)
    public String getbuy(){
        buyService.getAllBey();
        return "buy";
    }
//单个商品
    @RequestMapping(value = "/buy/{bid}",method = RequestMethod.GET)
    public String getBuyBid(@PathVariable int bid){
         buyService.getAllBuyBid(bid);
        return "buy";
    }

    //修改
    @RequestMapping("/updateBuy")
    public boolean updateBuy(@RequestBody Buy buy){
        System.out.println(buy);
        return buyService.updateBuy(buy);
    }

    @RequestMapping("/insertBuy")
     public boolean insertBuy(Buy buy){
        System.out.println(buy);
        return buyService.insertBuy(buy);
    }


}

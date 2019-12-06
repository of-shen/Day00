package com.james.controller;

import com.james.pojo.Details;
import com.james.service.DetailsService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

//用户信息
@RestController
public class DetailsController {

    @Resource
    private DetailsService detailsService;
    //全查个人信息
    @RequestMapping(value = "/details" , method = RequestMethod.GET)
    public List<Details> getAllDetails(){
       return detailsService.getAllDetails();

    }
//
//    @RequestMapping("/findBySellerName")
//    public Details findBySellerName() {
//        String dname=(String)SecurityUtils.getSubject().getPrincipal();
//        Seller bySellerName = sellerService.findBySellerName(loginname);
//        System.out.println(bySellerName);
//        return bySellerName;
//    }


//    //用户个人信息
//    @RequestMapping(value = "/details/{uid}",method = RequestMethod.GET)
//    public String getAllDetailsuid(@PathVariable int uid){
//        detailsService.GetAllDetailsuid(uid);
//        return "Details";
//    }
    //获取单个个人信息
    @RequestMapping(value = "/details/{did}",method = RequestMethod.POST)
    public Details getDetailsDid(@PathVariable int did){
        return detailsService.getDetailsDid(did);
    }

    //修改
    @RequestMapping("/updatedid")
    public boolean updateDid(@RequestBody Details details){
        System.out.println(details);
        return detailsService.updateDetails(details);

    }
    //新增
    @RequestMapping("/insertd")
    public String insertDetails(@RequestBody Details details){
        System.out.println(details);
         detailsService.inserDetails(details);
        System.out.println("6666");
        return "新增成功";
    }
}

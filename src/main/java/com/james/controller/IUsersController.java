package com.james.controller;

import com.james.pojo.Users;
import com.james.response.UserCode;
import com.james.service.IUsersService;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;


@RestController
public class IUsersController {
    @Resource
    private IUsersService usersService;
//所有用户
    @RequestMapping(value = "/all",method = RequestMethod.POST)
    public List<Users> getAllUsers(){
        return usersService.getUsers();
    }

    //id查询用户
    @RequestMapping(value = "/all/{uid}",method = RequestMethod.POST)
    public Users getUsersUid(@PathVariable int uid){
        return usersService.getUserUid(uid);
    }

    //注册
    @RequestMapping(value = "/uss" ,method = RequestMethod.POST)
    public String register(@RequestBody Users users ){


        System.out.println(users);
        if (usersService.login(users.getUname(),users.getUpass())==null){
            usersService.insertUsers(users);
            return "1";

        }
        return "2";


    }

   // 登录
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String  login(@RequestBody Users users){
        System.out.println("来了老弟");
        System.out.println(users.getUname());
        System.out.println(users.getUpass());
       if (usersService.login(users.getUname(),users.getUpass())!=null){
           return "登录成功";
       }
       return "登录失败";

    }



//登录

//    @RequestMapping(value = "/users", method = RequestMethod.POST)
//    public String login(@RequestBody Users users){
//        String uname=users.getUname();
//        String upass=users.getUpass();
//        if(uname!=""&&uname!=null&&upass!=""&&upass!=null){
//            System.out.println(users);
//            try {
//                //从安全管理器中获取主题对象
//                Subject subject = SecurityUtils.getSubject();
//                //创建令牌对象
//                UsernamePasswordToken token = new UsernamePasswordToken(users.getUname(),users.getUpass());
//                System.out.println(token);
//                subject.login(token);
//                if (subject.isAuthenticated()){
//                    return users.getUname();
//                }else {
//                    return null;
//                }
//            }catch (Exception e){
//                e.printStackTrace();
//                System.out.println("登陆失败");
//            }
//       }
//        return "值不能为空";
//    }



    //所有用户及权限等级
//    @RequestMapping(value = "/all" ,method = RequestMethod.GET)
//    public String getAllUsers(Users users,HttpSession session){
//return null;
//    }
}

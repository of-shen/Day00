package com.james.service;

import com.james.pojo.Rank;
import com.james.pojo.Rode;
import com.james.pojo.Users;

import java.util.List;

public interface IUsersService {

 //全查
 List<Users>getUsers();

 //id查询
 Users getUserUid(int uid);


   //登录
   Users login(String uname ,String upass);

    //新增
    boolean insertUsers(Users u);

    //删除
    int deleteUsers(int uid);


 //用户角色查询
 List<Rode> getRodeBYUname(String uname);

 //用户权限查询
 List<Rank> getRankByUname(String uname);


}

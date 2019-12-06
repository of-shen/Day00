package com.james.dao;

import com.james.pojo.Rank;
import com.james.pojo.Rode;
import com.james.pojo.Users;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface IUsersDao {
    //全查
    List<Users>getUsers();

    //id查询
    Users getUserUid(int uid);

    //用户密码查询
    Users login(String uname ,String upass);

    //添加新用户
    boolean insertUsers(Users u);

    //删除用户o
    int deleteUsers(int uid);

    //用户权限等级查询
    List<Rode> getRodeBYUname(String uname);
    List<Rank>getRankByUname(String uname);

}

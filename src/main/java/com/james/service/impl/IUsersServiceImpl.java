package com.james.service.impl;

import com.james.dao.IUsersDao;
import com.james.pojo.Rank;
import com.james.pojo.Rode;
import com.james.pojo.Users;
import com.james.service.IUsersService;
import com.james.utils.Md5Utils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class IUsersServiceImpl implements IUsersService {

    @Resource
    private IUsersDao usersDao;
    @Resource
    private Md5Utils md5Utils;

    @Override
    public List<Users> getUsers() {
        return usersDao.getUsers();
    }

    @Override
    public Users getUserUid(int uid) {
        return usersDao.getUserUid(uid);
    }


    //登录
    @Override
    public Users login(String uname,String upass) {
        return usersDao.login(uname,upass);
    }


    //注册
    @Override
    public boolean insertUsers(Users users){
        return usersDao.insertUsers(users);
    }
//    //注册时进行MD5加密+盐
//
//    @Override
//    public boolean insertUsers(Users u) {
//        String password = md5Utils.getPassword(u.getUpass(), u.getUname());
//        u.setUpass(password);
//        System.out.println(u);
//        return usersDao.insertUsers(u);
//    }
//删除
    @Override
    public int deleteUsers(int uid) {
        return usersDao.deleteUsers(uid);
    }


    //用户角色查询 @Override
    public List<Rode> getRodeBYUname(String uname) {
        return usersDao.getRodeBYUname(uname);
    }

    //用户权限查询
    @Override
    public List<Rank> getRankByUname(String uname) {
        return usersDao.getRankByUname(uname);
    }


}

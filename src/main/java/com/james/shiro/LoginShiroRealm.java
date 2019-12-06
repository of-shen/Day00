package com.james.shiro;

import com.james.dao.IUsersDao;
import com.james.pojo.Rode;
import com.james.pojo.Users;
import com.james.service.IUsersService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;

import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;


import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.ByteSource;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class LoginShiroRealm extends AuthorizingRealm {

    @Resource
    private IUsersDao usersDao;
//授权
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {

//        //获取主体对象
//        Subject subject=SecurityUtils.getSubject();
//        //获取用户身份信息
//        String uname= (String)principalCollection.getPrimaryPrincipal();
//        //根据用户名获取用户的权限信息
//        List<Rode>list=usersDao.getRodeBYUname(uname);
//        //HashSet底层由hashmap实现，不允许集合中有重复
//        Collection set=new HashSet();
//        for (Rode rode:list){
//                set.add(rode.getRrname());
//        }
//        SimpleAuthorizationInfo simpleAuthorizationInfo=new SimpleAuthorizationInfo();
////        simpleAuthorizationInfo.addStringPermission();
return null;
    }
//用户认证
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {

//        //获取用户信息
////        String uname= (String) authenticationToken.getPrincipal();
////        System.out.println(uname);
////        //根据用户信息查询数据库获取后端的用户身份，
////        Users users=usersDao.login(uname);//从数据库直接取
////       // if (users!=null) {
////            SimpleAuthenticationInfo simpleAuthorizationInfo = new SimpleAuthenticationInfo(users.getUname(), users.getUpass(), ByteSource.Util.bytes(users.getUname()), getName());
////            return simpleAuthorizationInfo;
////      //  }
        return null;
        }

}

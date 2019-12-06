package com.james.utils;


import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;
import org.springframework.stereotype.Component;

//注册加盐
@Component
public class Md5Utils {
//    public  String getPassword(String uname,String upass){
//        String hashAlgorithname="MD5";//加密算法；
//        String password=upass;//登陆时的密码
//        int hashIterations=1024;//再次加密
//        ByteSource credentialsSalt=ByteSource.Util.bytes(uname);//使用登录名作为盐
//        SimpleHash simpleHash=new SimpleHash(hashAlgorithname,password,credentialsSalt,hashIterations);
//        return simpleHash.toString();
//    }
}
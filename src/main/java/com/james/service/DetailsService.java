package com.james.service;

import com.james.pojo.Details;

import java.util.List;

public interface DetailsService {

    //全部信息
    List<Details> getAllDetails();

    Details findBySellerName(String dname);
    //所以个人信息
    Details getDetailsDid(int did);

    //个人信息
    Details GetAllDetailsuid(int uid);

    //修改信息
    boolean updateDetails(Details details);

    //新增
    boolean inserDetails(Details details);
}

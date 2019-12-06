package com.james.dao;

import com.james.pojo.Details;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface DetailsDao {

    //全部信息
    List<Details> getAllDetails();

    Details findBySellerName(String dname);

    //获取单个个人信息
    Details getDetailsDid(int did);

    //用户个人信息
    Details GetAllDetailsuid(int uid);

    //修改信息
    boolean updateDetails(Details details);

    //新增
    boolean inserDetails(Details details);
}

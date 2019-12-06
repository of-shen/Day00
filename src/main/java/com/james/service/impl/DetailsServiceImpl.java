package com.james.service.impl;

import com.james.dao.DetailsDao;
import com.james.pojo.Details;
import com.james.service.DetailsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class DetailsServiceImpl implements DetailsService{

    @Resource
    private DetailsDao detailsDao;

    @Override
    public List<Details> getAllDetails() {
        return detailsDao.getAllDetails();
    }

    @Override
    public Details findBySellerName(String dname) {
        return detailsDao.findBySellerName(dname);
    }

    @Override
    public Details getDetailsDid(int did) {
        return detailsDao.getDetailsDid(did);
    }

    @Override
    public Details GetAllDetailsuid(int uid) {
        return detailsDao.GetAllDetailsuid(uid);
    }

    @Override
    public boolean updateDetails(Details details) {
        return detailsDao.updateDetails(details);
    }

    @Override
    public boolean inserDetails(Details details) {
        return detailsDao.inserDetails(details);
    }
}

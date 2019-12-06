package com.james.service.impl;

import com.james.dao.BuyDao;
import com.james.pojo.Buy;
import com.james.service.BuyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class BuyServiceImpl implements BuyService {
    @Resource
    private BuyDao buyDao;
    @Override
    public List<Buy> getAllBey() {
        return buyDao.getAllBey();
    }

    @Override
    public Buy getAllBuyBid(int bid) {
        return buyDao.getAllBuyBid(bid);
    }

    @Override
    public boolean updateBuy(Buy buy) {
        return buyDao.updateBuy(buy);
    }


    @Override
    public boolean seleteBuy(int bid) {
        return buyDao.seleteBuy(bid);
    }

    @Override
    public boolean insertBuy(Buy buy) {
        return buyDao.insertBuy(buy);
    }
}

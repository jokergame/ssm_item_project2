package com.itcast.service.Impl;

import com.itcast.dao.ItemsDao;
import com.itcast.service.Itemsservice;
import com.itcast.service.domain.Items;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemsServiceImpl implements Itemsservice {
    @Autowired
    private ItemsDao itemsDao;

    @Override
    public List<Items> findAll() {
        return itemsDao.findAll();
    }

    /*@Override
    public void update(String price, String date, String pic, Date createtime, String detail) {
        itemsDao.update(price,date,pic,createtime,detail);
    }*/
}

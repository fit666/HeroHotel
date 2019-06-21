package com.hero.hotel.service.impl;

import com.hero.hotel.dao.Reserve_Dao;
import com.hero.hotel.pojo.Reserve;
import com.hero.hotel.service.Reserve_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class Reserve_ServiceImpl implements Reserve_Service {
    @Autowired
    private Reserve_Dao reserve_dao;
    @Override
    public void addReserve(Reserve reserve) {
        System.out.println(reserve);
        reserve_dao.addReserve(reserve);
    }

    @Override
    public List<com.hero.hotel.pojo.sxj.Reserve> findReserveByName(String name) {

        return reserve_dao.findReserveByName(name);
    }


}

package com.hero.hotel.controller;

import com.hero.hotel.pojo.Reserve;
import com.hero.hotel.service.Reserve_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class Reserve_Controller {
    @Autowired
    private Reserve_Service reserve_service;

    @PostMapping("/addReserve")
    public void addReserve(
        String uname,String tel,String message,Integer roomTypeId,
        String liveTime,String leaveTime,String cancelTime,
        Integer depositMoney,Integer autoCancel

    ){
        //如果没有登录，首先提示用户先登录
        Integer lid=1;
        String payNumber="001";
        String reserveNumber="111";
        Double discount=1.0;
        //else可以从session取出这个用户的id，并获得他lid

        Reserve reserve = new Reserve(
                null,lid,depositMoney,autoCancel,liveTime,
                leaveTime,new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()),payNumber,
                discount,0,reserveNumber,1);
        //把这个玩意儿存进去
        reserve_service.addReserve(reserve);

    }
}

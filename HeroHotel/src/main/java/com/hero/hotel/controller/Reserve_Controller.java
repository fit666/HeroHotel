package com.hero.hotel.controller;

import com.hero.hotel.pojo.Reserve;
import com.hero.hotel.service.Reserve_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

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


    //预订单查询（模糊查询，可以根据姓名和id查询）
    @GetMapping(value = "/findreservebyname/{name}")
    public ModelAndView findReserveByName(@PathVariable String name){
        System.out.println("开始预订单查询，姓名为："+name);
        ModelAndView modelAndView = new ModelAndView();
        List<com.hero.hotel.pojo.sxj.Reserve> reserves=reserve_service.findReserveByName(name);
        System.out.println(reserves);
        modelAndView.addObject(reserves);
        return modelAndView;

    }

    //获取住房的时间段liveTime & leaveTime
    @GetMapping("/livetime/{livetime}/{leavetime}")
    public ModelAndView liveTime(@PathVariable String livetime,@PathVariable String leavetime){
        System.out.println(livetime);
        System.out.println(leavetime);
        ModelAndView modelAndView = new ModelAndView();
        return modelAndView;
    }


}

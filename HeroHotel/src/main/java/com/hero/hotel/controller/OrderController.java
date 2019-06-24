package com.hero.hotel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OrderController {

    @RequestMapping("/findHouseByDays")
    public void findHouseByDays(String livetime,int days){
        System.out.println(livetime);
        System.out.println(days);
    }
}

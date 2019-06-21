package com.hero.hotel.service;

import com.hero.hotel.pojo.Reserve;

import java.util.List;

public interface Reserve_Service {

    public void addReserve(Reserve reserve);

    public List<com.hero.hotel.pojo.sxj.Reserve> findReserveByName(String name);
}

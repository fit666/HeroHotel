package com.hero.hotel.service;

import java.util.List;

import com.hero.hotel.pojo.House;


public interface HouseService {

	public List<House> findRoomAllStatus();

	public List<House> findOkRooms();

	public List<House> findNoRooms();

	public List<House> findZangRooms();

	// 通过给定的时间范围 查询出 不同类型房间剩余可用的数量
//	public List<Map> findRoomTypeNum(String time1, String time2);

}
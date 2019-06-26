package com.hero.hotel.service;

import java.util.List;

import com.hero.hotel.pojo.House;


public interface HouseService {

	public List<House> findRoomAllStatus();

	public List<House> findOkRooms();

	public List<House> findNoRooms();

	public List<House> findZangRooms();
	//下架房间
	public String stopRoom(Integer id);
	//上架房间
	public String startRoom(Integer id);
	//根据房间类型增加房间
	public String addRoom(Integer typeid, Integer number);

	// 通过给定的时间范围 查询出 不同类型房间剩余可用的数量
//	public List<Map> findRoomTypeNum(String time1, String time2);

}
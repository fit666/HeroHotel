package com.hero.hotel.service;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.hero.hotel.pojo.Room;

public interface RoomService {

	public List<Room> findRoomAllStatus();

	public List<Room> findOkRooms();

	public List<Room> findNoRooms();

	public List<Room> findZangRooms();

	// 通过给定的时间范围 查询出 不同类型房间剩余可用的数量
	public List<Map> findRoomTypeNum(String time1, String time2);

}

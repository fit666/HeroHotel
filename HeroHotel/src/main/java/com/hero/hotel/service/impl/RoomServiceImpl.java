package com.hero.hotel.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hero.hotel.dao.RoomDao;
import com.hero.hotel.pojo.Room;
import com.hero.hotel.service.RoomService;

@Service("roomService")
public class RoomServiceImpl implements RoomService{
	
	@Resource
	private RoomDao roomDao;
	
	// 查询所有房间状态
	@Override
	public List<Room> findRoomAllStatus() {
		return roomDao.findRoomAllStatus();
	}

	@Override
	public List<Room> findOkRooms() {
		return roomDao.findOkRooms();
	}

	@Override
	public List<Room> findNoRooms() {
		return roomDao.findNoRooms();
	}

	@Override
	public List<Room> findZangRooms() {
		return roomDao.findZangRooms();
	}

}

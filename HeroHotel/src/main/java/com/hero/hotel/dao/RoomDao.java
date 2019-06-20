package com.hero.hotel.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.hero.hotel.pojo.Room;

public interface RoomDao {

	@Select("select * from room")
	public List<Room> findRoomAllStatus();

	
	@Select("select * from room where flag=0")
	public List<Room> findOkRooms();

	@Select("select * from room where flag=1")
	public List<Room> findNoRooms();

	@Select("select * from room where flag=2")
	public List<Room> findZangRooms();

}

package com.hero.hotel.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.hero.hotel.pojo.Room;

public interface RoomDao {

	@Select("select * from room")
	public List<Room> findRoomAllStatus();

}

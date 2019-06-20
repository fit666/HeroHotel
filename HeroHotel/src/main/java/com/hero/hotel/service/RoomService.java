package com.hero.hotel.service;

import java.util.List;


import com.hero.hotel.pojo.Room;


public interface RoomService {
	
	public List<Room> findRoomAllStatus();

	public List<Room> findOkRooms();

	public List<Room> findNoRooms();

	public List<Room> findZangRooms();

}

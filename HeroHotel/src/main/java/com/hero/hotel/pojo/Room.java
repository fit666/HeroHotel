package com.hero.hotel.pojo;

public class Room {
    private Integer id;
    private Integer roomTypeId;
    private Integer flag;
	public Room(Integer id, Integer roomTypeId, Integer flag) {
		super();
		this.id = id;
		this.roomTypeId = roomTypeId;
		this.flag = flag;
	}
	public Room() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getRoomTypeId() {
		return roomTypeId;
	}
	public void setRoomTypeId(Integer roomTypeId) {
		this.roomTypeId = roomTypeId;
	}
	public Integer getFlag() {
		return flag;
	}
	public void setFlag(Integer flag) {
		this.flag = flag;
	}
	@Override
	public String toString() {
		return "Room [id=" + id + ", roomTypeId=" + roomTypeId + ", flag=" + flag + "]";
	}
    
    
}

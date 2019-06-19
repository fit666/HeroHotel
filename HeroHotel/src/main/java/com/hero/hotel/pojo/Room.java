package com.hero.hotel.pojo;

public class Room {
    private Integer id;
    private Integer roomTypeId;
    private Integer roomType;

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", roomTypeId=" + roomTypeId +
                ", roomType=" + roomType +
                '}';
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

    public Integer getRoomType() {
        return roomType;
    }

    public void setRoomType(Integer roomType) {
        this.roomType = roomType;
    }

    public Room() {
    }

    public Room(Integer id, Integer roomTypeId, Integer roomType) {
        this.id = id;
        this.roomTypeId = roomTypeId;
        this.roomType = roomType;
    }
}

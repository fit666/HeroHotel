package com.hero.hotel.pojo;

public class Room {
    private Integer id;
    private Integer roomTypeId;
    private Integer clean;
    private Integer repair;

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", roomTypeId=" + roomTypeId +
                ", clean=" + clean +
                ", repair=" + repair +
                ", flag=" + flag +
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

    public Integer getClean() {
        return clean;
    }

    public void setClean(Integer clean) {
        this.clean = clean;
    }

    public Integer getRepair() {
        return repair;
    }

    public void setRepair(Integer repair) {
        this.repair = repair;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Room() {
    }

    public Room(Integer id, Integer roomTypeId, Integer clean, Integer repair, Integer flag) {
        this.id = id;
        this.roomTypeId = roomTypeId;
        this.clean = clean;
        this.repair = repair;
        this.flag = flag;
    }

    private Integer flag;
}

package com.hero.hotel.pojo;

public class ReserveInfo {
    private Integer id;
    private Integer ReserveId;
    private Integer roomId;
    private String today;
    private Integer uid;
    private String liveTime;
    private String leaveTime;
    private Integer flag;

    @Override
    public String toString() {
        return "ReserveInfo{" +
                "id=" + id +
                ", ReserveId=" + ReserveId +
                ", roomId=" + roomId +
                ", today='" + today + '\'' +
                ", uid=" + uid +
                ", liveTime='" + liveTime + '\'' +
                ", leaveTime='" + leaveTime + '\'' +
                ", flag=" + flag +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getReserveId() {
        return ReserveId;
    }

    public void setReserveId(Integer reserveId) {
        ReserveId = reserveId;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public String getToday() {
        return today;
    }

    public void setToday(String today) {
        this.today = today;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getLiveTime() {
        return liveTime;
    }

    public void setLiveTime(String liveTime) {
        this.liveTime = liveTime;
    }

    public String getLeaveTime() {
        return leaveTime;
    }

    public void setLeaveTime(String leaveTime) {
        this.leaveTime = leaveTime;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public ReserveInfo(Integer id, Integer reserveId, Integer roomId, String today, Integer uid, String liveTime, String leaveTime, Integer flag) {
        this.id = id;
        ReserveId = reserveId;
        this.roomId = roomId;
        this.today = today;
        this.uid = uid;
        this.liveTime = liveTime;
        this.leaveTime = leaveTime;
        this.flag = flag;
    }

    public ReserveInfo() {
    }
}

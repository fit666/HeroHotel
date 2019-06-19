package com.hero.hotel.pojo;

public class Reserve {
    private Integer id;
    private Integer user_id;
    private Integer lid;
    private Integer uid;
    private Integer roomTypeId;
    private Integer depositMoney;
    private Integer autoCancel;
    private String arriveTime;
    private Integer leaveMessage;
    private Integer reverseOrderStartTime;

    @Override
    public String toString() {
        return "Reserve{" +
                "id=" + id +
                ", user_id=" + user_id +
                ", lid=" + lid +
                ", uid=" + uid +
                ", roomTypeId=" + roomTypeId +
                ", depositMoney=" + depositMoney +
                ", autoCancel=" + autoCancel +
                ", arriveTime='" + arriveTime + '\'' +
                ", leaveMessage=" + leaveMessage +
                ", reverseOrderStartTime=" + reverseOrderStartTime +
                ", payNumber=" + payNumber +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getLid() {
        return lid;
    }

    public void setLid(Integer lid) {
        this.lid = lid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getRoomTypeId() {
        return roomTypeId;
    }

    public void setRoomTypeId(Integer roomTypeId) {
        this.roomTypeId = roomTypeId;
    }

    public Integer getDepositMoney() {
        return depositMoney;
    }

    public void setDepositMoney(Integer depositMoney) {
        this.depositMoney = depositMoney;
    }

    public Integer getAutoCancel() {
        return autoCancel;
    }

    public void setAutoCancel(Integer autoCancel) {
        this.autoCancel = autoCancel;
    }

    public String getArriveTime() {
        return arriveTime;
    }

    public void setArriveTime(String arriveTime) {
        this.arriveTime = arriveTime;
    }

    public Integer getLeaveMessage() {
        return leaveMessage;
    }

    public void setLeaveMessage(Integer leaveMessage) {
        this.leaveMessage = leaveMessage;
    }

    public Integer getReverseOrderStartTime() {
        return reverseOrderStartTime;
    }

    public void setReverseOrderStartTime(Integer reverseOrderStartTime) {
        this.reverseOrderStartTime = reverseOrderStartTime;
    }

    public Integer getPayNumber() {
        return payNumber;
    }

    public void setPayNumber(Integer payNumber) {
        this.payNumber = payNumber;
    }

    public Reserve() {
    }

    public Reserve(Integer id, Integer user_id, Integer lid, Integer uid, Integer roomTypeId, Integer depositMoney, Integer autoCancel, String arriveTime, Integer leaveMessage, Integer reverseOrderStartTime, Integer payNumber) {
        this.id = id;
        this.user_id = user_id;
        this.lid = lid;
        this.uid = uid;
        this.roomTypeId = roomTypeId;
        this.depositMoney = depositMoney;
        this.autoCancel = autoCancel;
        this.arriveTime = arriveTime;
        this.leaveMessage = leaveMessage;
        this.reverseOrderStartTime = reverseOrderStartTime;
        this.payNumber = payNumber;
    }

    private Integer payNumber;

}

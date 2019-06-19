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
    private Integer payNumber;
    private Double discount;
    private Integer orderStatus;
    private String reserveNumber;
    private Integer flag;

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
                ", discount=" + discount +
                ", orderStatus=" + orderStatus +
                ", reserveNumber='" + reserveNumber + '\'' +
                ", flag=" + flag +
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

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getReserveNumber() {
        return reserveNumber;
    }

    public void setReserveNumber(String reserveNumber) {
        this.reserveNumber = reserveNumber;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Reserve() {
    }

    public Reserve(Integer id, Integer user_id, Integer lid, Integer uid, Integer roomTypeId, Integer depositMoney, Integer autoCancel, String arriveTime, Integer leaveMessage, Integer reverseOrderStartTime, Integer payNumber, Double discount, Integer orderStatus, String reserveNumber, Integer flag) {
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
        this.discount = discount;
        this.orderStatus = orderStatus;
        this.reserveNumber = reserveNumber;
        this.flag = flag;
    }
}

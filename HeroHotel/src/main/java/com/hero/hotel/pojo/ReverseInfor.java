package com.hero.hotel.pojo;

public class ReverseInfor {
    private Integer id;
    private Integer reverseId;
    private Integer roomTypeId;
    private Integer orderNumber;
    private Double truePayMoney;
    private Double discount;
    private String liveTime;
    private String leaveTime;
    private Integer cancelTime;
    private Integer flag;

    @Override
    public String
    toString() {
        return "ReverseInfor{" +
                "id=" + id +
                ", reverseId=" + reverseId +
                ", roomTypeId=" + roomTypeId +
                ", orderNumber=" + orderNumber +
                ", truePayMoney=" + truePayMoney +
                ", discount=" + discount +
                ", liveTime='" + liveTime + '\'' +
                ", leaveTime='" + leaveTime + '\'' +
                ", cancelTime=" + cancelTime +
                ", flag=" + flag +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getReverseId() {
        return reverseId;
    }

    public void setReverseId(Integer reverseId) {
        this.reverseId = reverseId;
    }

    public Integer getRoomTypeId() {
        return roomTypeId;
    }

    public void setRoomTypeId(Integer roomTypeId) {
        this.roomTypeId = roomTypeId;
    }

    public Integer getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Integer orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Double getTruePayMoney() {
        return truePayMoney;
    }

    public void setTruePayMoney(Double truePayMoney) {
        this.truePayMoney = truePayMoney;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
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

    public Integer getCancelTime() {
        return cancelTime;
    }

    public void setCancelTime(Integer cancelTime) {
        this.cancelTime = cancelTime;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public ReverseInfor() {
    }

    public ReverseInfor(Integer id, Integer reverseId, Integer roomTypeId, Integer orderNumber, Double truePayMoney, Double discount, String liveTime, String leaveTime, Integer cancelTime, Integer flag) {
        this.id = id;
        this.reverseId = reverseId;
        this.roomTypeId = roomTypeId;
        this.orderNumber = orderNumber;
        this.truePayMoney = truePayMoney;
        this.discount = discount;
        this.liveTime = liveTime;
        this.leaveTime = leaveTime;
        this.cancelTime = cancelTime;
        this.flag = flag;
    }
}

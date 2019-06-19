package com.hero.hotel.pojo;

public class Reserve {
    private Integer id;
    private Integer lid;
    private Integer depositMoney;
    private Integer autoCancel;
    private String arriveTime;
    private String leaveMessage;
    private String reverseOrderStartTime;
    private String payNumber;
    private Double discount;
    private Integer orderStatus;
    private String reserveNumber;
    private Integer flag;

    @Override
    public String toString() {
        return "Reserve{" +
                "id=" + id +
                ", lid=" + lid +
                ", depositMoney=" + depositMoney +
                ", autoCancel=" + autoCancel +
                ", arriveTime='" + arriveTime + '\'' +
                ", leaveMessage='" + leaveMessage + '\'' +
                ", reverseOrderStartTime='" + reverseOrderStartTime + '\'' +
                ", payNumber='" + payNumber + '\'' +
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

    public Integer getLid() {
        return lid;
    }

    public void setLid(Integer lid) {
        this.lid = lid;
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

    public String getLeaveMessage() {
        return leaveMessage;
    }

    public void setLeaveMessage(String leaveMessage) {
        this.leaveMessage = leaveMessage;
    }

    public String getReverseOrderStartTime() {
        return reverseOrderStartTime;
    }

    public void setReverseOrderStartTime(String reverseOrderStartTime) {
        this.reverseOrderStartTime = reverseOrderStartTime;
    }

    public String getPayNumber() {
        return payNumber;
    }

    public void setPayNumber(String payNumber) {
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

    public Reserve(Integer id, Integer lid, Integer depositMoney, Integer autoCancel, String arriveTime, String leaveMessage, String reverseOrderStartTime, String payNumber, Double discount, Integer orderStatus, String reserveNumber, Integer flag) {
        this.id = id;
        this.lid = lid;
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

    public Reserve() {
    }
}

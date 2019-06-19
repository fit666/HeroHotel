package com.hero.hotel.pojo;

public class Orderinfor {
    private Integer id;
    private Integer orderId;
    private Integer rid;
    private Double truePayMoney;
    private Double discount;
    private String liveTime;
    private String leaveTime;
    private Integer flag;

    @Override
    public String toString() {
        return "Orderinfor{" +
                "id=" + id +
                ", orderId=" + orderId +
                ", rid=" + rid +
                ", truePayMoney=" + truePayMoney +
                ", discount=" + discount +
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

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
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

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Orderinfor() {
    }

    public Orderinfor(Integer id, Integer orderId, Integer rid, Double truePayMoney, Double discount, String liveTime, String leaveTime, Integer flag) {
        this.id = id;
        this.orderId = orderId;
        this.rid = rid;
        this.truePayMoney = truePayMoney;
        this.discount = discount;
        this.liveTime = liveTime;
        this.leaveTime = leaveTime;
        this.flag = flag;
    }
}

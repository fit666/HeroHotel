package com.hero.hotel.pojo.sxj;

import com.hero.hotel.pojo.ReserveInfo;

import java.util.List;

public class Reserve {
    private Integer id;
    private Integer lid;
    private String arriveTime;
    private String leaveMessage;
    private Integer autoCancel;
    private String reserveOrderStartTime;
    private String paynumber;
    private Double discount;
    private Integer orderStatus;
    private Integer flag;
    private List<ReserveInfo> reserveInfos;

    @Override
    public String toString() {
        return "Reserve{" +
                "id=" + id +
                ", lid=" + lid +
                ", arriveTime='" + arriveTime + '\'' +
                ", leaveMessage='" + leaveMessage + '\'' +
                ", autoCancel=" + autoCancel +
                ", reserveOrderStartTime='" + reserveOrderStartTime + '\'' +
                ", paynumber='" + paynumber + '\'' +
                ", discount=" + discount +
                ", orderStatus=" + orderStatus +
                ", flag=" + flag +
                ", reserveInfos=" + reserveInfos +
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

    public Integer getAutoCancel() {
        return autoCancel;
    }

    public void setAutoCancel(Integer autoCancel) {
        this.autoCancel = autoCancel;
    }

    public String getReserveOrderStartTime() {
        return reserveOrderStartTime;
    }

    public void setReserveOrderStartTime(String reserveOrderStartTime) {
        this.reserveOrderStartTime = reserveOrderStartTime;
    }

    public String getPaynumber() {
        return paynumber;
    }

    public void setPaynumber(String paynumber) {
        this.paynumber = paynumber;
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

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public List<ReserveInfo> getReserveInfos() {
        return reserveInfos;
    }

    public void setReserveInfos(List<ReserveInfo> reserveInfos) {
        this.reserveInfos = reserveInfos;
    }

    public Reserve(Integer id, Integer lid, String arriveTime, String leaveMessage, Integer autoCancel, String reserveOrderStartTime, String paynumber, Double discount, Integer orderStatus, Integer flag, List<ReserveInfo> reserveInfos) {
        this.id = id;
        this.lid = lid;
        this.arriveTime = arriveTime;
        this.leaveMessage = leaveMessage;
        this.autoCancel = autoCancel;
        this.reserveOrderStartTime = reserveOrderStartTime;
        this.paynumber = paynumber;
        this.discount = discount;
        this.orderStatus = orderStatus;
        this.flag = flag;
        this.reserveInfos = reserveInfos;
    }

    public Reserve() {
    }
}

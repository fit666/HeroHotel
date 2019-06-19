package com.hero.hotel.pojo;

public class Orders {
    private Integer id;
    private Integer uid;
    private Double allMoney;
    private Integer depositMoney;
    private Integer rid;
    private String payMethod;
    private String payNumber;
    private String orderStartTime;
    private String payTime;
    private Integer payState;
    private Double reduceMoney;

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", uid=" + uid +
                ", allMoney=" + allMoney +
                ", depositMoney=" + depositMoney +
                ", rid=" + rid +
                ", payMethod='" + payMethod + '\'' +
                ", payNumber='" + payNumber + '\'' +
                ", orderStartTime='" + orderStartTime + '\'' +
                ", payTime='" + payTime + '\'' +
                ", payState=" + payState +
                ", reduceMoney=" + reduceMoney +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Double getAllMoney() {
        return allMoney;
    }

    public void setAllMoney(Double allMoney) {
        this.allMoney = allMoney;
    }

    public Integer getDepositMoney() {
        return depositMoney;
    }

    public void setDepositMoney(Integer depositMoney) {
        this.depositMoney = depositMoney;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(String payMethod) {
        this.payMethod = payMethod;
    }

    public String getPayNumber() {
        return payNumber;
    }

    public void setPayNumber(String payNumber) {
        this.payNumber = payNumber;
    }

    public String getOrderStartTime() {
        return orderStartTime;
    }

    public void setOrderStartTime(String orderStartTime) {
        this.orderStartTime = orderStartTime;
    }

    public String getPayTime() {
        return payTime;
    }

    public void setPayTime(String payTime) {
        this.payTime = payTime;
    }

    public Integer getPayState() {
        return payState;
    }

    public void setPayState(Integer payState) {
        this.payState = payState;
    }

    public Double getReduceMoney() {
        return reduceMoney;
    }

    public void setReduceMoney(Double reduceMoney) {
        this.reduceMoney = reduceMoney;
    }

    public Orders() {
    }

    public Orders(Integer id, Integer uid, Double allMoney, Integer depositMoney, Integer rid, String payMethod, String payNumber, String orderStartTime, String payTime, Integer payState, Double reduceMoney) {
        this.id = id;
        this.uid = uid;
        this.allMoney = allMoney;
        this.depositMoney = depositMoney;
        this.rid = rid;
        this.payMethod = payMethod;
        this.payNumber = payNumber;
        this.orderStartTime = orderStartTime;
        this.payTime = payTime;
        this.payState = payState;
        this.reduceMoney = reduceMoney;
    }
}

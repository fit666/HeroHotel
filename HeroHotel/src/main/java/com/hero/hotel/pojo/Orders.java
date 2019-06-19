package com.hero.hotel.pojo;

public class Orders {
    private Integer id;
    private Double allMoney;
    private Integer depositMoney;
    private Integer rid;
    private String payMethod;
    private String payNumber;
    private String orderStartTime;
    private String payTime;
    private Integer payState;
    private Double reduceMoney;
    private String returnMoneyTime;
    private String orderNumber;
    private Integer flag;

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", allMoney=" + allMoney +
                ", depositMoney=" + depositMoney +
                ", rid=" + rid +
                ", payMethod='" + payMethod + '\'' +
                ", payNumber='" + payNumber + '\'' +
                ", orderStartTime='" + orderStartTime + '\'' +
                ", payTime='" + payTime + '\'' +
                ", payState=" + payState +
                ", reduceMoney=" + reduceMoney +
                ", returnMoneyTime='" + returnMoneyTime + '\'' +
                ", orderNumber='" + orderNumber + '\'' +
                ", flag=" + flag +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getReturnMoneyTime() {
        return returnMoneyTime;
    }

    public void setReturnMoneyTime(String returnMoneyTime) {
        this.returnMoneyTime = returnMoneyTime;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Orders() {
    }

    public Orders(Integer id, Double allMoney, Integer depositMoney, Integer rid, String payMethod, String payNumber, String orderStartTime, String payTime, Integer payState, Double reduceMoney, String returnMoneyTime, String orderNumber, Integer flag) {
        this.id = id;
        this.allMoney = allMoney;
        this.depositMoney = depositMoney;
        this.rid = rid;
        this.payMethod = payMethod;
        this.payNumber = payNumber;
        this.orderStartTime = orderStartTime;
        this.payTime = payTime;
        this.payState = payState;
        this.reduceMoney = reduceMoney;
        this.returnMoneyTime = returnMoneyTime;
        this.orderNumber = orderNumber;
        this.flag = flag;
    }
}

package com.hero.hotel.pojo;

public class SystemSet {
    private Integer id;
    private Integer findVipMessageByName;
    private Integer findVipMessageById;
    private Integer moneyToInt;
    private Integer addDiscountRate;

    @Override
    public String toString() {
        return "SystemSet{" +
                "id=" + id +
                ", findVipMessageByName=" + findVipMessageByName +
                ", findVipMessageById=" + findVipMessageById +
                ", moneyToInt=" + moneyToInt +
                ", addDiscountRate=" + addDiscountRate +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFindVipMessageByName() {
        return findVipMessageByName;
    }

    public void setFindVipMessageByName(Integer findVipMessageByName) {
        this.findVipMessageByName = findVipMessageByName;
    }

    public Integer getFindVipMessageById() {
        return findVipMessageById;
    }

    public void setFindVipMessageById(Integer findVipMessageById) {
        this.findVipMessageById = findVipMessageById;
    }

    public Integer getMoneyToInt() {
        return moneyToInt;
    }

    public void setMoneyToInt(Integer moneyToInt) {
        this.moneyToInt = moneyToInt;
    }

    public Integer getAddDiscountRate() {
        return addDiscountRate;
    }

    public void setAddDiscountRate(Integer addDiscountRate) {
        this.addDiscountRate = addDiscountRate;
    }

    public SystemSet() {
    }

    public SystemSet(Integer id, Integer findVipMessageByName, Integer findVipMessageById, Integer moneyToInt, Integer addDiscountRate) {
        this.id = id;
        this.findVipMessageByName = findVipMessageByName;
        this.findVipMessageById = findVipMessageById;
        this.moneyToInt = moneyToInt;
        this.addDiscountRate = addDiscountRate;
    }
}

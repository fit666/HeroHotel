package com.hero.hotel.pojo;

public class Members {
    private Integer id;
    private Integer startMoney;
    private Integer flag;
    private String level;
    private Double discount;

    @Override
    public String toString() {
        return "Members{" +
                "id=" + id +
                ", startMoney=" + startMoney +
                ", flag=" + flag +
                ", level='" + level + '\'' +
                ", discount=" + discount +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStartMoney() {
        return startMoney;
    }

    public void setStartMoney(Integer startMoney) {
        this.startMoney = startMoney;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Members() {
    }

    public Members(Integer id, Integer startMoney, Integer flag, String level, Double discount) {
        this.id = id;
        this.startMoney = startMoney;
        this.flag = flag;
        this.level = level;
        this.discount = discount;
    }
}

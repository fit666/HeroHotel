package com.hero.hotel.pojo;

public class Vip {
    private Integer id;
    private Integer vmoney;
    private Integer flag;
    private String vname;
    private Double discount;

    @Override
    public String toString() {
        return "Vip{" +
                "id=" + id +
                ", vmoney=" + vmoney +
                ", flag=" + flag +
                ", vname='" + vname + '\'' +
                ", discount=" + discount +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVmoney() {
        return vmoney;
    }

    public void setVmoney(Integer vmoney) {
        this.vmoney = vmoney;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public String getVname() {
        return vname;
    }

    public void setVname(String vname) {
        this.vname = vname;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Vip() {
    }

    public Vip(Integer id, Integer vmoney, Integer flag, String vname, Double discount) {
        this.id = id;
        this.vmoney = vmoney;
        this.flag = flag;
        this.vname = vname;
        this.discount = discount;
    }
}

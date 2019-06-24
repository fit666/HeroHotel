package com.hero.hotel.pojo;
/*
 * 	会员表
 */
public class Vip {
    private Integer id;//会员id
    //最低消费类型修改为double类型
    private double vmoney;//最低消费
    private Integer flag;
    private String vname;//会员等级名称
    private Double discount;//折扣

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

    public double getVmoney() {
        return vmoney;
    }

    public void setVmoney(double vmoney) {
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

    public Vip(Integer id, double vmoney, Integer flag, String vname, Double discount) {
        this.id = id;
        this.vmoney = vmoney;
        this.flag = flag;
        this.vname = vname;
        this.discount = discount;
    }
}

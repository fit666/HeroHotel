package com.hero.hotel.pojo;

import java.math.BigDecimal;

public class HouseType {
    private Integer typeid;
    private Integer flag;
    private BigDecimal prive;
    private String hname;
    private String serve;
    private String breakfast;

    @Override
    public String toString() {
        return "HouseType{" +
                "typeid=" + typeid +
                ", flag=" + flag +
                ", prive=" + prive +
                ", hname='" + hname + '\'' +
                ", serve='" + serve + '\'' +
                ", breakfast='" + breakfast + '\'' +
                '}';
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public BigDecimal getPrive() {
        return prive;
    }

    public void setPrive(BigDecimal prive) {
        this.prive = prive;
    }

    public String getHname() {
        return hname;
    }

    public void setHname(String hname) {
        this.hname = hname;
    }

    public String getServe() {
        return serve;
    }

    public void setServe(String serve) {
        this.serve = serve;
    }

    public String getBreakfast() {
        return breakfast;
    }

    public void setBreakfast(String breakfast) {
        this.breakfast = breakfast;
    }

    public HouseType(Integer typeid, Integer flag, BigDecimal prive, String hname, String serve, String breakfast) {
        this.typeid = typeid;
        this.flag = flag;
        this.prive = prive;
        this.hname = hname;
        this.serve = serve;
        this.breakfast = breakfast;
    }

    public HouseType() {
    }
}

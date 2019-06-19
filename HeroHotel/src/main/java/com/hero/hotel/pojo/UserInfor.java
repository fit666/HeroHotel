package com.hero.hotel.pojo;

public class UserInfor {
    private Integer id;
    private Integer lid;
    private Integer flag;
    private String uname;
    private String regTime;
    private String utel;

    @Override
    public String toString() {
        return "UserInfor{" +
                "id=" + id +
                ", lid=" + lid +
                ", flag=" + flag +
                ", uname='" + uname + '\'' +
                ", regTime='" + regTime + '\'' +
                ", utel='" + utel + '\'' +
                ", idcard='" + idcard + '\'' +
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

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getRegTime() {
        return regTime;
    }

    public void setRegTime(String regTime) {
        this.regTime = regTime;
    }

    public String getUtel() {
        return utel;
    }

    public void setUtel(String utel) {
        this.utel = utel;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public UserInfor() {
    }

    public UserInfor(Integer id, Integer lid, Integer flag, String uname, String regTime, String utel, String idcard) {
        this.id = id;
        this.lid = lid;
        this.flag = flag;
        this.uname = uname;
        this.regTime = regTime;
        this.utel = utel;
        this.idcard = idcard;
    }

    private String idcard;

}

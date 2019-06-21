package com.hero.hotel.pojo;
/*
 * 	信息表
 */
public class Info {
    private Integer infoid;//用户信息id
    private Integer flag;
    private String tel;//手机号
    private String uname;//姓名
    private char sex;//性别
    private String idcard;//身份证号

    @Override
    public String toString() {
        return "Info{" +
                "infoid=" + infoid +
                ", flag=" + flag +
                ", tel='" + tel + '\'' +
                ", uname='" + uname + '\'' +
                ", sex=" + sex +
                ", idcard='" + idcard + '\'' +
                '}';
    }

    public Integer getInfoid() {
        return infoid;
    }

    public void setInfoid(Integer infoid) {
        this.infoid = infoid;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public Info() {
    }

    public Info(Integer infoid, Integer flag, String tel, String uname, char sex, String idcard) {
        this.infoid = infoid;
        this.flag = flag;
        this.tel = tel;
        this.uname = uname;
        this.sex = sex;
        this.idcard = idcard;
    }
}
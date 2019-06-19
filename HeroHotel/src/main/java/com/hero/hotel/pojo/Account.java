package com.hero.hotel.pojo;

public class Account {
    private Integer id;
    private String account;
    private String password;
    private String tell;
    private String registerTime;
    private Double costAllMoney;
    private Integer uid;
    private Integer mid;
    private Integer flag;

    public Account() {
    }

    public Account(Integer id, String account, String password, String tell, String registerTime, Double costAllMoney, Integer uid, Integer mid, Integer flag) {
        this.id = id;
        this.account = account;
        this.password = password;
        this.tell = tell;
        this.registerTime = registerTime;
        this.costAllMoney = costAllMoney;
        this.uid = uid;
        this.mid = mid;
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", tell='" + tell + '\'' +
                ", registerTime='" + registerTime + '\'' +
                ", costAllMoney=" + costAllMoney +
                ", uid=" + uid +
                ", mid=" + mid +
                ", flag=" + flag +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTell() {
        return tell;
    }

    public void setTell(String tell) {
        this.tell = tell;
    }

    public String getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(String registerTime) {
        this.registerTime = registerTime;
    }

    public Double getCostAllMoney() {
        return costAllMoney;
    }

    public void setCostAllMoney(Double costAllMoney) {
        this.costAllMoney = costAllMoney;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}

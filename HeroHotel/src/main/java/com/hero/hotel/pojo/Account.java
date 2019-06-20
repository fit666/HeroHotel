package com.hero.hotel.pojo;

import java.util.List;

public class Account {
    private Integer id;
    private String account;
    private String password;
    private String tell;
    private String registerTime;
    private Double costallmoney;
    private Integer uid;
    private Integer mid;
    private Integer flag;
    private Members vip;
    private UserInfor userInfor;
	public Account(Integer id, String account, String password, String tell, String registerTime, Double costallmoney,
			Integer uid, Integer mid, Integer flag, Members vip, UserInfor userInfor) {
		super();
		this.id = id;
		this.account = account;
		this.password = password;
		this.tell = tell;
		this.registerTime = registerTime;
		this.costallmoney = costallmoney;
		this.uid = uid;
		this.mid = mid;
		this.flag = flag;
		this.vip = vip;
		this.userInfor = userInfor;
	}
	public Account() {
		super();
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
	public Double getCostallmoney() {
		return costallmoney;
	}
	public void setCostallmoney(Double costallmoney) {
		this.costallmoney = costallmoney;
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
	public Members getVip() {
		return vip;
	}
	public void setVip(Members vip) {
		this.vip = vip;
	}
	public UserInfor getUserInfor() {
		return userInfor;
	}
	public void setUserInfor(UserInfor userInfor) {
		this.userInfor = userInfor;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", account=" + account + ", password=" + password + ", tell=" + tell
				+ ", registerTime=" + registerTime + ", costallmoney=" + costallmoney + ", uid=" + uid + ", mid=" + mid
				+ ", flag=" + flag + ", vip=" + vip + ", userInfor=" + userInfor + "]";
	}

   
}

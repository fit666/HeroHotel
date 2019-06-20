package com.hero.hotel.pojo;

public class UserInfor {
    private Integer id;
    private Integer lid;
    private Integer flag;
    private String uname;
    private String regtime;
    private String utel;
    private String idcard;
    private String sex;
	public UserInfor(Integer id, Integer lid, Integer flag, String uname, String regtime, String utel, String idcard,
			String sex) {
		super();
		this.id = id;
		this.lid = lid;
		this.flag = flag;
		this.uname = uname;
		this.regtime = regtime;
		this.utel = utel;
		this.idcard = idcard;
		this.sex = sex;
	}
	public UserInfor() {
		super();
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
	public String getRegtime() {
		return regtime;
	}
	public void setRegtime(String regtime) {
		this.regtime = regtime;
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "UserInfor [id=" + id + ", lid=" + lid + ", flag=" + flag + ", uname=" + uname + ", regtime=" + regtime
				+ ", utel=" + utel + ", idcard=" + idcard + ", sex=" + sex + "]";
	}
    
    
}

package com.hero.hotel.pojo;
/*
 * 	信息表
 */

import java.util.List;

public class Info {

	private Integer infoid;
	private String tel;
	private String uname;
	private String sex;
	private String idcard;
	private Integer userid;
	private Integer flag;


	public Info() {
		super();
	}


	public Info(Integer infoid, String tel, String uname, String sex, String idcard, Integer userid, Integer flag) {
		super();
		this.infoid = infoid;
		this.flag = flag;
		this.tel = tel;
		this.uname = uname;
		this.sex = sex;
		this.idcard = idcard;
		this.userid = userid;
		this.flag = flag;
	}


	public Integer getInfoid() {
		return infoid;
	}


	public void setInfoid(Integer infoid) {
		this.infoid = infoid;
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


	public String getSex() {
		return sex;
	}


	public void setSex(String sex) {
		this.sex = sex;
	}


	public String getIdcard() {
		return idcard;
	}


	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}


	public Integer getUserid() {
		return userid;
	}


	public void setUserid(Integer userid) {
		this.userid = userid;
	}


	public Integer getFlag() {
		return flag;
	}


	public void setFlag(Integer flag) {
		this.flag = flag;
	}


	@Override
	public String toString() {
		return "Info [infoid=" + infoid + ", tel=" + tel + ", uname=" + uname + ", sex=" + sex + ", idcard=" + idcard
				+ ", userid=" + userid + ", flag=" + flag + "]";
	}


}

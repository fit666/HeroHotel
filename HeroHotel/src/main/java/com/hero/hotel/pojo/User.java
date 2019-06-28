package com.hero.hotel.pojo;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/*
 * 	 用户表
 */
public class User {
    private Integer id;//用户id
    private Integer roleid;//角色id
    private Integer infoid;//个人信息id
    private Integer flag;
    private String account;//账号
    private String password;//密码
    private String tel;//手机号
    //消费金额类型修改为double
    private BigDecimal monetary;//消费金额
    private Date createtime;//注册时间
    private Info info;
	@Override
	public String toString() {
		return "User [id=" + id + ", roleid=" + roleid + ", infoid=" + infoid + ", flag=" + flag + ", account="
				+ account + ", password=" + password + ", tel=" + tel + ", monetary=" + monetary + ", createtime="
				+ createtime + ", info=" + info + "]";
	}
	public User(Integer id, Integer roleid, Integer infoid, Integer flag, String account, String password, String tel,
			BigDecimal monetary, Date createtime, Info info) {
		super();
		this.id = id;
		this.roleid = roleid;
		this.infoid = infoid;
		this.flag = flag;
		this.account = account;
		this.password = password;
		this.tel = tel;
		this.monetary = monetary;
		this.createtime = createtime;
		this.info = info;
	}
	public User() {
		
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getRoleid() {
		return roleid;
	}
	public void setRoleid(Integer roleid) {
		this.roleid = roleid;
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
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public BigDecimal getMonetary() {
		return monetary;
	}
	public void setMonetary(BigDecimal monetary) {
		this.monetary = monetary;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	public Info getInfo() {
		return info;
	}
	public void setInfo(Info info) {
		this.info = info;
	}
	
}

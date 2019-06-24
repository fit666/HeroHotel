package com.hero.hotel.pojo;

import java.util.Date;

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
    private double monetary;//消费金额
    private Date createtime;//注册时间
    private Integer rm;//记住我
    private Info info;//个人信息
    private Vip vip;//vip等级
    private String code;//手机验证码
    private Role role;//管理员角色

	
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
	public double getMonetary() {
		return monetary;
	}
	public void setMonetary(double monetary) {
		this.monetary = monetary;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	public Integer getRm() {
		return rm;
	}
	public void setRm(Integer rm) {
		this.rm = rm;
	}
	public Info getInfo() {
		return info;
	}
	public void setInfo(Info info) {
		this.info = info;
	}
	public Vip getVip() {
		return vip;
	}
	public void setVip(Vip vip) {
		this.vip = vip;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", roleid=" + roleid + ", infoid=" + infoid + ", flag=" + flag + ", account="
				+ account + ", password=" + password + ", tel=" + tel + ", monetary=" + monetary + ", createtime="
				+ createtime + ", rm=" + rm + ", info=" + info + ", vip=" + vip + ", code=" + code + ", role=" + role
				+ "]";
	}
	
    
}

package com.hero.hotel.pojo;

public class RolePermission {
	private Integer id;
	private String pname;//权限名
	private Integer rid;//角色id
	private int flag;
	
	public RolePermission(Integer id, String pname, Integer rid, int flag) {
		super();
		this.id = id;
		this.pname = pname;
		this.rid = rid;
		this.flag = flag;
	}
	public RolePermission() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Integer getRid() {
		return rid;
	}
	public void setRid(Integer rid) {
		this.rid = rid;
	}
	public int getFlag() {
		return flag;
	}
	public void setFlag(int flag) {
		this.flag = flag;
	}
	@Override
	public String toString() {
		return "RolePermission [id=" + id + ", pname=" + pname + ", rid=" + rid + ", flag=" + flag + "]";
	}
	
	
}

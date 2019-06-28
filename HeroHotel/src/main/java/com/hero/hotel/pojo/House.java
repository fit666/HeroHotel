package com.hero.hotel.pojo;

public class House {
	private Integer id;
	private Integer typeid;
	private Integer flag;
	
	
	public House() {
		super();
	}


	public House(Integer id, Integer typeid, Integer flag) {
		super();
		this.id = id;
		this.typeid = typeid;
		this.flag = flag;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
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


	@Override
	public String toString() {
		return "House [id=" + id + ", typeid=" + typeid + ", flag=" + flag + "]";
	}
	
}

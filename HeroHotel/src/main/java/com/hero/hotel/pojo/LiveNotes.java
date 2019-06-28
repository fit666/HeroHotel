package com.hero.hotel.pojo;

public class LiveNotes {
	
	private Integer id;
	private Integer houseid;
	private Integer typeid;
	private String date;
	private Integer infoid;
	private Integer orderItemid;
	private Integer flag;
	
	
	public LiveNotes() {
		super();
	}


	public LiveNotes(Integer id, Integer houseid, Integer typeid, String date, Integer infoid, Integer orderItemid,
			Integer flag) {
		super();
		this.id = id;
		this.houseid = houseid;
		this.typeid = typeid;
		this.date = date;
		this.infoid = infoid;
		this.orderItemid = orderItemid;
		this.flag = flag;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Integer getHouseid() {
		return houseid;
	}


	public void setHouseid(Integer houseid) {
		this.houseid = houseid;
	}


	public Integer getTypeid() {
		return typeid;
	}


	public void setTypeid(Integer typeid) {
		this.typeid = typeid;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public Integer getInfoid() {
		return infoid;
	}


	public void setInfoid(Integer infoid) {
		this.infoid = infoid;
	}


	public Integer getOrderItemid() {
		return orderItemid;
	}


	public void setOrderItemid(Integer orderItemid) {
		this.orderItemid = orderItemid;
	}


	public Integer getFlag() {
		return flag;
	}


	public void setFlag(Integer flag) {
		this.flag = flag;
	}


	@Override
	public String toString() {
		return "Livenotes [id=" + id + ", houseid=" + houseid + ", typeid=" + typeid + ", date=" + date + ", infoid="
				+ infoid + ", orderItemid=" + orderItemid + ", flag=" + flag + "]";
	}
	
	
}

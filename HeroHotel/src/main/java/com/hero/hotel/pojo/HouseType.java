package com.hero.hotel.pojo;

import java.math.BigDecimal;

public class HouseType {
	private Integer typeid;
	private String hname;
	private String serve;
	private String breakfast;
	private BigDecimal price;
	private String imgurl;
	private Integer flag;
	
	
	public HouseType() {
		super();
	}


	public HouseType(Integer typeid, String hname, String serve, String breakfast, BigDecimal price, String imgurl,
			Integer flag) {
		super();
		this.typeid = typeid;
		this.hname = hname;
		this.serve = serve;
		this.breakfast = breakfast;
		this.price = price;
		this.imgurl = imgurl;
		this.flag = flag;
	}


	public Integer getTypeid() {
		return typeid;
	}


	public void setTypeid(Integer typeid) {
		this.typeid = typeid;
	}


	public String getHname() {
		return hname;
	}


	public void setHname(String hname) {
		this.hname = hname;
	}


	public String getServe() {
		return serve;
	}


	public void setServe(String serve) {
		this.serve = serve;
	}


	public String getBreakfast() {
		return breakfast;
	}


	public void setBreakfast(String breakfast) {
		this.breakfast = breakfast;
	}


	public BigDecimal getPrice() {
		return price;
	}


	public void setPrice(BigDecimal price) {
		this.price = price;
	}


	public String getImgurl() {
		return imgurl;
	}


	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}


	public Integer getFlag() {
		return flag;
	}


	public void setFlag(Integer flag) {
		this.flag = flag;
	}


	@Override
	public String toString() {
		return "HouseType [typeid=" + typeid + ", hname=" + hname + ", serve=" + serve + ", breakfast=" + breakfast
				+ ", price=" + price + ", imgurl=" + imgurl + ", flag=" + flag + "]";
	}
	
	
}

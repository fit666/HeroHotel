package com.hero.hotel.pojo;

import java.math.BigDecimal;
import java.util.List;
/*
 * 	房间类型表
 */
public class HouseType {
    private Integer typeid;//房间类型id
    private Integer flag;
    private BigDecimal price;//价格
    private String hname;//类型名字
    private String serve;//包含服务
    private String breakfast;//早餐
    private String imgurl;
    private List<House> houses;//房间类型对应的所有房间
	@Override
	public String toString() {
		return "HouseType [typeid=" + typeid + ", flag=" + flag + ", price=" + price + ", hname=" + hname + ", serve="
				+ serve + ", breakfast=" + breakfast + ", imgurl=" + imgurl + ", houses=" + houses + "]";
	}
	public HouseType(Integer typeid, Integer flag, BigDecimal price, String hname, String serve, String breakfast,
			String imgurl, List<House> houses) {
		super();
		this.typeid = typeid;
		this.flag = flag;
		this.price = price;
		this.hname = hname;
		this.serve = serve;
		this.breakfast = breakfast;
		this.imgurl = imgurl;
		this.houses = houses;
	}
    public HouseType() {
		// TODO Auto-generated constructor stub
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
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
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
	public String getImgurl() {
		return imgurl;
	}
	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}
	public List<House> getHouses() {
		return houses;
	}
	public void setHouses(List<House> houses) {
		this.houses = houses;
	}

}

package com.hero.hotel.pojo;

import java.math.BigDecimal;
import java.util.List;
/*
 * 	房间类型表
 */
public class HouseType {
   /* private Integer typeid;//房间类型id
    private Integer flag;//1,keyong,2下架
    private Double price;//价格
    private String hname;//类型名字
    private String serve;//包含服务
    private String breakfast;//早餐
*/    
	private List<House> houses;//房间类型对应的所有房间
    
	private Integer typeid;
	private String hname;
	private String serve;
	private String breakfast;
	private BigDecimal price;
	private String imgurl;
	private Integer flag;
	public List<House> getHouses() {
		return houses;
	}
	public void setHouses(List<House> houses) {
		this.houses = houses;
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
		return "HouseType [houses=" + houses + ", typeid=" + typeid + ", hname=" + hname + ", serve=" + serve
				+ ", breakfast=" + breakfast + ", price=" + price + ", imgurl=" + imgurl + ", flag=" + flag + "]";
	}
	
	
}

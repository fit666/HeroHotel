package com.hero.hotel.pojo;

import java.math.BigDecimal;
import java.util.Date;
/*
 * 	订单项表
 */
public class OrderItem {
   /* private Integer id;//订单项id
    private Integer typeid;//房间类型id
    private Integer orderid;//订单id
    private Integer flag;
    private Integer quantity;//房间数量
    //房间数量类型修改为intteger,入住时间类型修改为string
    private String starttime;//入住时间
    //居住天数类型修改为Integer
    private Integer day;//居住天数
    //添加属性离开时间
    private String endtime;
    //价格修改为double类型
    private double price;//价格
    //添加字段房间id
    private Integer houseid;*/
    
	private Integer id;
	private Integer houseid;
	private Integer typeid;
	private String quantity;
	private Date datetime;
	private String day;
	private Integer orderid;
	private BigDecimal price;
	private Integer flag;
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
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public Date getDatetime() {
		return datetime;
	}
	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public Integer getOrderid() {
		return orderid;
	}
	public void setOrderid(Integer orderid) {
		this.orderid = orderid;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public Integer getFlag() {
		return flag;
	}
	public void setFlag(Integer flag) {
		this.flag = flag;
	}
	@Override
	public String toString() {
		return "OrderItem [id=" + id + ", houseid=" + houseid + ", typeid=" + typeid + ", quantity=" + quantity
				+ ", datetime=" + datetime + ", day=" + day + ", orderid=" + orderid + ", price=" + price + ", flag="
				+ flag + "]";
	}
   
    
}

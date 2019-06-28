
package com.hero.hotel.pojo;

import java.math.BigDecimal;
import java.util.Date;
/*
 * 	订单项表
 */
public class OrderItem {

	private Integer id;
	private Integer houseid;
	private Integer typeid;
	private String quantity;
	private Date datetime;
	private String day;
	private Integer orderid;
	private BigDecimal price;
	private Integer flag;
	private String endtime;


	public OrderItem() {
		super();
	}

	public Integer getHouseid() {
		return houseid;
	}

	public OrderItem(Integer id, Integer houseid, Integer typeid, String quantity, Date datetime, String day,
			Integer orderid, BigDecimal price, Integer flag) {
		super();
		this.id = id;
		this.houseid = houseid;
		this.typeid = typeid;
		this.quantity = quantity;
		this.datetime = datetime;
		this.day = day;
		this.orderid = orderid;
		this.price = price;
		this.flag = flag;
	}

	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}

	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
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
		return "Orderitem [id=" + id + ", houseid=" + houseid + ", typeid=" + typeid + ", quantity=" + quantity
				+ ", datetime=" + datetime + ", day=" + day + ", orderid=" + orderid + ", price=" + price + ", flag="
				+ flag + "]";
	}

}

package com.hero.hotel.pojo;

import java.math.BigDecimal;
import java.util.Date;
/*
 * 	订单项表
 */
public class OrderItem {
    private Integer id;//订单项id
    private Integer typeid;//房间类型id
    private Integer orderid;//订单id
    private Integer flag;
    private Integer quantity;//房间数量
    //房间数量类型修改为intteger,入住时间类型修改为string
    private String starttime;//入住时间
    //居住天数类型修改为
    private Integer day;//居住天数
    //添加属性离开时间
    private String endtime;
    //价格修改为double类型
    private double price;//价格
    //添加字段房间id
    private Integer houseid;
    
    @Override
    public String toString() {
        return "OrderItem{" +
                "id=" + id +
                ", typeid=" + typeid +
                ", orderid=" + orderid +
                ", flag=" + flag +
                ", quantity='" + quantity + '\'' +
                ", starttime=" + starttime +
                ", day='" + day + '\'' +
                ", price=" + price +
                '}';
    }

    public Integer getHouseid() {
		return houseid;
	}

	public void setHouseid(Integer houseid) {
		this.houseid = houseid;
	}

	public String getEndtime() {
		return endtime;
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

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public OrderItem() {
    }

	public OrderItem(Integer id, Integer typeid, Integer orderid, Integer flag, Integer quantity, String starttime,
			Integer day, String endtime, double price, Integer houseid) {
		super();
		this.id = id;
		this.typeid = typeid;
		this.orderid = orderid;
		this.flag = flag;
		this.quantity = quantity;
		this.starttime = starttime;
		this.day = day;
		this.endtime = endtime;
		this.price = price;
		this.houseid = houseid;
	}

	

   
}

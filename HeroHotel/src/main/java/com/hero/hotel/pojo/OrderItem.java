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
    private String quantity;//房间数量
    private Date starttime;//入住时间
    private String day;//居住天数
    private BigDecimal price;//价格

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

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public OrderItem() {
    }

    public OrderItem(Integer id, Integer typeid, Integer orderid, Integer flag, String quantity, Date starttime, String day, BigDecimal price) {
        this.id = id;
        this.typeid = typeid;
        this.orderid = orderid;
        this.flag = flag;
        this.quantity = quantity;
        this.starttime = starttime;
        this.day = day;
        this.price = price;
    }
}

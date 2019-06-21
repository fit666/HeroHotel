package com.hero.hotel.pojo;

import java.math.BigDecimal;
import java.util.Date;
/*
 * 	订单表
 */
public class Order {
    private Integer orderid;//订单id
    private Integer userid;//用户id
    private Integer flag;
    private Date createtime;//创建时间
    private Date updatetime;//修改时间
    private String ordernumber;//订单号
    private String payway;//支付号
    private BigDecimal total;//总价

    @Override
    public String toString() {
        return "Order{" +
                "orderid=" + orderid +
                ", userid=" + userid +
                ", flag=" + flag +
                ", createtime=" + createtime +
                ", updatetime=" + updatetime +
                ", ordernumber='" + ordernumber + '\'' +
                ", payway='" + payway + '\'' +
                ", total=" + total +
                '}';
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getOrdernumber() {
        return ordernumber;
    }

    public void setOrdernumber(String ordernumber) {
        this.ordernumber = ordernumber;
    }

    public String getPayway() {
        return payway;
    }

    public void setPayway(String payway) {
        this.payway = payway;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public Order(Integer orderid, Integer userid, Integer flag, Date createtime, Date updatetime, String ordernumber, String payway, BigDecimal total) {
        this.orderid = orderid;
        this.userid = userid;
        this.flag = flag;
        this.createtime = createtime;
        this.updatetime = updatetime;
        this.ordernumber = ordernumber;
        this.payway = payway;
        this.total = total;
    }

    public Order() {
    }
}

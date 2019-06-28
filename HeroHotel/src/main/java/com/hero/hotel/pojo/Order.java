package com.hero.hotel.pojo;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
/*
 * 	订单表
 */
public class Order {
    private Integer orderid;//订单id
    private Integer userid;//用户id
    private Integer flag;
    //修改创建时间和修改时间类型为String类型
    private String createtime;//创建时间
    private String updatetime;//修改时间
    private String ordernumber;//订单号
    private String payway;//支付号
    //总价类型修改为double
    private double total;//总价
    //添加字段个人信息id
    private Integer infoid;
    private String message;  // 留言
    //订单项
    private List<OrderItem> oderItems;

    @Override
    public String toString() {
        return "Order{" +
                "orderid=" + orderid +
                ", userid=" + userid +
                ", flag=" + flag +
                ", createtime='" + createtime + '\'' +
                ", updatetime='" + updatetime + '\'' +
                ", ordernumber='" + ordernumber + '\'' +
                ", payway='" + payway + '\'' +
                ", total=" + total +
                ", infoid=" + infoid +
                ", message='" + message + '\'' +
                ", oderItems=" + oderItems +
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

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public String getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(String updatetime) {
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

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Integer getInfoid() {
        return infoid;
    }

    public void setInfoid(Integer infoid) {
        this.infoid = infoid;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<OrderItem> getOderItems() {
        return oderItems;
    }

    public void setOderItems(List<OrderItem> oderItems) {
        this.oderItems = oderItems;
    }

    public Order() {
    }

    public Order(Integer orderid, Integer userid, Integer flag, String createtime, String updatetime, String ordernumber, String payway, double total, Integer infoid, String message, List<OrderItem> oderItems) {
        this.orderid = orderid;
        this.userid = userid;
        this.flag = flag;
        this.createtime = createtime;
        this.updatetime = updatetime;
        this.ordernumber = ordernumber;
        this.payway = payway;
        this.total = total;
        this.infoid = infoid;
        this.message = message;
        this.oderItems = oderItems;
    }





}

package com.hero.hotel.pojo;

import java.util.Date;
/*
 * 	评论表
 */
public class Comment {
    private Integer id;    //评论id
    private Integer orderid;//订单id
    private Integer userid;//用户id
    private Integer flag;
    private Date createtime;//创建时间
    private String message;//评论信息

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", orderid=" + orderid +
                ", userid=" + userid +
                ", flag=" + flag +
                ", createtime=" + createtime +
                ", message='" + message + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Comment(Integer id, Integer orderid, Integer userid, Integer flag, Date createtime, String message) {
        this.id = id;
        this.orderid = orderid;
        this.userid = userid;
        this.flag = flag;
        this.createtime = createtime;
        this.message = message;
    }

    public Comment() {
    }
}

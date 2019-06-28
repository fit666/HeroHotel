package com.hero.hotel.pojo;

import java.util.Date;

public class Comment {
	private Integer id;//id
	private Integer orderid;//订单id
	private Date createtime;//评论时间
	private String message;//评论内容
	private Integer userid;//用户id
	private Integer flag;//软删除
	
	
	
	@Override
	public String toString() {
		return "Comment [id=" + id + ", orderid=" + orderid + ", createtime=" + createtime + ", message=" + message
				+ ", userid=" + userid + ", flag=" + flag + "]";
	}
	public Comment() {
		super();
	}
	public Comment(Integer id, Integer orderid, Date createtime, String message, Integer userid, Integer flag) {
		super();
		this.id = id;
		this.orderid = orderid;
		this.createtime = createtime;
		this.message = message;
		this.userid = userid;
		this.flag = flag;
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
	

}

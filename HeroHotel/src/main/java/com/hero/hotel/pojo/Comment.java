package com.hero.hotel.pojo;

import java.util.Date;

public class Comment {
	private Integer id; // id
	private Integer orderid;
	private Integer userid;
	private Integer flag;
	private Date createtime;
	private String message;

	@Override
	public String toString() {
		return "Comment [id=" + id + ", orderid=" + orderid + ", userid=" + userid + ", flag=" + flag + ", createtime="
				+ createtime + ", message=" + message + "]";
	}

	public Comment(Integer id, Integer orderid, Integer userid, Integer flag, Date createtime, String message) {
		super();
		this.id = id;
		this.orderid = orderid;
		this.userid = userid;
		this.flag = flag;
		this.createtime = createtime;
		this.message = message;
	}

	public Comment() {
		// TODO Auto-generated constructor stub
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

}

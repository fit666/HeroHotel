package com.hero.hotel.pojo;

import java.util.Date;

public class Comment {
	/*
	 * private Integer id; //id private Integer orderid; private Integer userid;
	 * private Integer flag; private Date createtime; private String message;
	 * private Integer total;//总条数 private String name;//昵称
	 */

	private Integer id;// id
	private Integer orderid;// 订单id
	private Date createtime;// 评论时间
	private String message;// 评论内容
	private Integer userid;// 用户id
	private Integer flag;// 软删除

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

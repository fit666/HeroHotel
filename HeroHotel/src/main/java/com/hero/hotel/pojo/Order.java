package com.hero.hotel.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Order {
	
	private Integer orderid;
	private Date createtime;
	private Date updatetime;
	private String ordernumber;
	private String paynumber;
	private String payway;
	private BigDecimal total;
	private Integer userid;
	private String message;
	private Double deposit;
	private Integer infoid;
	private Integer flag;
	
	public Order() {
		super();
	}

	public Order(Integer orderid, Date createtime, Date updatetime, String ordernumber, String paynumber, String payway,
			BigDecimal total, Integer userid, String message, Double deposit, Integer infoid, Integer flag) {
		super();
		this.orderid = orderid;
		this.createtime = createtime;
		this.updatetime = updatetime;
		this.ordernumber = ordernumber;
		this.paynumber = paynumber;
		this.payway = payway;
		this.total = total;
		this.userid = userid;
		this.message = message;
		this.deposit = deposit;
		this.infoid = infoid;
		this.flag = flag;
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

	public String getPaynumber() {
		return paynumber;
	}

	public void setPaynumber(String paynumber) {
		this.paynumber = paynumber;
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

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Double getDeposit() {
		return deposit;
	}

	public void setDeposit(Double deposit) {
		this.deposit = deposit;
	}

	public Integer getInfoid() {
		return infoid;
	}

	public void setInfoid(Integer infoid) {
		this.infoid = infoid;
	}

	public Integer getFlag() {
		return flag;
	}

	public void setFlag(Integer flag) {
		this.flag = flag;
	}

	@Override
	public String toString() {
		return "Order [orderid=" + orderid + ", createtime=" + createtime + ", updatetime=" + updatetime
				+ ", ordernumber=" + ordernumber + ", paynumber=" + paynumber + ", payway=" + payway + ", total="
				+ total + ", userid=" + userid + ", message=" + message + ", deposit=" + deposit + ", infoid=" + infoid
				+ ", flag=" + flag + "]";
	}
	
	
}

package com.hero.hotel.pojo;

public class Vip {
	
	private Integer id;
	private String vname;
	private Double vmoney;
	private Double discount;
	private Integer flag;
	
	
	
	public Vip() {
		super();
	}



	public Vip(Integer id, String vname, Double vmoney, Double discount, Integer flag) {
		super();
		this.id = id;
		this.vname = vname;
		this.vmoney = vmoney;
		this.discount = discount;
		this.flag = flag;
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getVname() {
		return vname;
	}



	public void setVname(String vname) {
		this.vname = vname;
	}



	public Double getVmoney() {
		return vmoney;
	}



	public void setVmoney(Double vmoney) {
		this.vmoney = vmoney;
	}



	public Double getDiscount() {
		return discount;
	}



	public void setDiscount(Double discount) {
		this.discount = discount;
	}



	public Integer getFlag() {
		return flag;
	}



	public void setFlag(Integer flag) {
		this.flag = flag;
	}



	@Override
	public String toString() {
		return "Vip [id=" + id + ", vname=" + vname + ", vmoney=" + vmoney + ", discount=" + discount + ", flag=" + flag
				+ "]";
	}
	
}

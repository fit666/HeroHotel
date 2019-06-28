package com.hero.hotel.pojo;
/*
 *	 房间表
 */
public class House {
    private Integer id;//房间id
    private Integer typeid;//房间类型id
    private Integer flag;
	@Override
	public String toString() {
		return "House [id=" + id + ", typeid=" + typeid + ", flag=" + flag + "]";
	}
	public House(Integer id, Integer typeid, Integer flag) {
		super();
		this.id = id;
		this.typeid = typeid;
		this.flag = flag;
	}

    public House() {
		
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
	public Integer getFlag() {
		return flag;
	}
	public void setFlag(Integer flag) {
		this.flag = flag;
	}
    
}

package com.hero.hotel.pojo;

/*
 *  	居住记录表
 */
public class LiveNotes {
	/*private Integer id;// 记录id
	private Integer houseid;// 房间id
	private Integer typeid;// 房间类型id
	private Integer infoid;// 个人信息id
	private Integer orderItemid;// 订单项id

	private Integer flag;
	private String date;// 居住时间
*/	
	private Integer id;
	private Integer houseid;
	private Integer typeid;
	private String date;
	private Integer infoid;
	private Integer orderItemid;
	private Integer flag;
	
	@Override
	public String toString() {
		return "LiveNotes{" + "id=" + id + ", houseid=" + houseid + ", typeid=" + typeid + ", infoid=" + infoid
				+ ", flag=" + flag + ", date='" + date + '\'' + '}';
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getHouseid() {
		return houseid;
	}

	public void setHouseid(Integer houseid) {
		this.houseid = houseid;
	}

	public Integer getTypeid() {
		return typeid;
	}

	public void setTypeid(Integer typeid) {
		this.typeid = typeid;
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

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public LiveNotes(Integer id, Integer houseid, Integer typeid, Integer infoid, Integer flag, String date) {
		this.id = id;
		this.houseid = houseid;
		this.typeid = typeid;
		this.infoid = infoid;
		this.flag = flag;
		this.date = date;
	}

	public LiveNotes() {
	}
}

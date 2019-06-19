package com.hero.hotel.pojo;

public class ReverseInfor {
    private Integer id;
    private Integer reverseId;
    private Integer roomid;
    private Double truePayMoney;
    private Double discount;
    private String liveTime;
    private String leaveTime;
    private Integer cancelTime;
    private String today;
    private Integer flag;

    
  
    public ReverseInfor(Integer id, Integer reverseId, Integer roomid, Double truePayMoney, Double discount,
			String liveTime, String leaveTime, Integer cancelTime, String today, Integer flag) {
		super();
		this.id = id;
		this.reverseId = reverseId;
		this.roomid = roomid;
		this.truePayMoney = truePayMoney;
		this.discount = discount;
		this.liveTime = liveTime;
		this.leaveTime = leaveTime;
		this.cancelTime = cancelTime;
		this.today = today;
		this.flag = flag;
	}

    
    
	public Integer getRoomid() {
		return roomid;
	}



	public void setRoomid(Integer roomid) {
		this.roomid = roomid;
	}



	public String getToday() {
		return today;
	}



	public void setToday(String today) {
		this.today = today;
	}



	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getReverseId() {
        return reverseId;
    }

    public void setReverseId(Integer reverseId) {
        this.reverseId = reverseId;
    }

   

    public Double getTruePayMoney() {
        return truePayMoney;
    }

    public void setTruePayMoney(Double truePayMoney) {
        this.truePayMoney = truePayMoney;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public String getLiveTime() {
        return liveTime;
    }

    public void setLiveTime(String liveTime) {
        this.liveTime = liveTime;
    }

    public String getLeaveTime() {
        return leaveTime;
    }

    public void setLeaveTime(String leaveTime) {
        this.leaveTime = leaveTime;
    }

    public Integer getCancelTime() {
        return cancelTime;
    }

    public void setCancelTime(Integer cancelTime) {
        this.cancelTime = cancelTime;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public ReverseInfor() {
    }



	@Override
	public String toString() {
		return "ReverseInfor [id=" + id + ", reverseId=" + reverseId + ", roomid=" + roomid + ", truePayMoney="
				+ truePayMoney + ", discount=" + discount + ", liveTime=" + liveTime + ", leaveTime=" + leaveTime
				+ ", cancelTime=" + cancelTime + ", today=" + today + ", flag=" + flag + "]";
	}

    
}

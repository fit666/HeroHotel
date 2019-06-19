package com.hero.hotel.pojo;

public class Orderinfor {
    private Integer id;
    private Integer orderId;
    private Integer roomid;
    private Double truePayMoney;
    private Double discount;
    private String liveTime;
    private String leaveTime;
    private String today; 
    private Integer flag;

    @Override
    public String toString() {
        return "Orderinfor{" +
                "id=" + id +
                ", orderId=" + orderId +
                ", roomid=" + roomid +
                ", truePayMoney=" + truePayMoney +
                ", discount=" + discount +
                ", liveTime='" + liveTime + '\'' +
                ", leaveTime='" + leaveTime + '\'' +
                ", flag=" + flag +
                '}';
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

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getRoomid() {
        return roomid;
    }

    public void setRoomid(Integer roomid) {
        this.roomid = roomid;
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

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Orderinfor() {
    }


	public Orderinfor(Integer id, Integer orderId, Integer roomid, Double truePayMoney, Double discount,
			String liveTime, String leaveTime, String today, Integer flag) {
		super();
		this.id = id;
		this.orderId = orderId;
		this.roomid = roomid;
		this.truePayMoney = truePayMoney;
		this.discount = discount;
		this.liveTime = liveTime;
		this.leaveTime = leaveTime;
		this.today = today;
		this.flag = flag;
	}

   

    


}

package com.hero.hotel.pojo;

public class RoomImg {
    private Integer id;
    private Integer roomTypeId;
    private String bedImg;
    private String windowImg;
    private String toiletImg;
    private Integer flag;

    @Override
    public String toString() {
        return "RoomImg{" +
                "id=" + id +
                ", roomTypeId=" + roomTypeId +
                ", bedImg='" + bedImg + '\'' +
                ", windowImg='" + windowImg + '\'' +
                ", toiletImg='" + toiletImg + '\'' +
                ", flag=" + flag +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoomTypeId() {
        return roomTypeId;
    }

    public void setRoomTypeId(Integer roomTypeId) {
        this.roomTypeId = roomTypeId;
    }

    public String getBedImg() {
        return bedImg;
    }

    public void setBedImg(String bedImg) {
        this.bedImg = bedImg;
    }

    public String getWindowImg() {
        return windowImg;
    }

    public void setWindowImg(String windowImg) {
        this.windowImg = windowImg;
    }

    public String getToiletImg() {
        return toiletImg;
    }

    public void setToiletImg(String toiletImg) {
        this.toiletImg = toiletImg;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public RoomImg() {
    }

    public RoomImg(Integer id, Integer roomTypeId, String bedImg, String windowImg, String toiletImg, Integer flag) {
        this.id = id;
        this.roomTypeId = roomTypeId;
        this.bedImg = bedImg;
        this.windowImg = windowImg;
        this.toiletImg = toiletImg;
        this.flag = flag;
    }
}

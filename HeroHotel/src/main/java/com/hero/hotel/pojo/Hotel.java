package com.hero.hotel.pojo;

public class Hotel {
    private Integer id;
    private String hotelName;
    private String address;
    private String hotelImg;

    @Override
    public String toString() {
        return "Hotel{" +
                "id=" + id +
                ", hotelName='" + hotelName + '\'' +
                ", address='" + address + '\'' +
                ", hotelImg='" + hotelImg + '\'' +
                ", flag=" + flag +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHotelImg() {
        return hotelImg;
    }

    public void setHotelImg(String hotelImg) {
        this.hotelImg = hotelImg;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Hotel() {
    }

    public Hotel(Integer id, String hotelName, String address, String hotelImg, Integer flag) {
        this.id = id;
        this.hotelName = hotelName;
        this.address = address;
        this.hotelImg = hotelImg;
        this.flag = flag;
    }

    private Integer flag;
}

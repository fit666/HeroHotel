package com.hero.hotel.pojo;

public class RoomType {
    private String rname;
    private Double price;
    private Double bedSize;
    private Integer id;
    private Integer breakfast;
    private Integer pickup;
    private Integer taxi;
    private Integer window;
    private Integer toilet;
    private Integer cancelTime;
    private Integer numbers;

    @Override
    public String toString() {
        return "RoomType{" +
                "rname='" + rname + '\'' +
                ", price=" + price +
                ", bedSize=" + bedSize +
                ", id=" + id +
                ", breakfast=" + breakfast +
                ", pickup=" + pickup +
                ", taxi=" + taxi +
                ", window=" + window +
                ", toilet=" + toilet +
                ", cancelTime=" + cancelTime +
                ", numbers=" + numbers +
                '}';
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getBedSize() {
        return bedSize;
    }

    public void setBedSize(Double bedSize) {
        this.bedSize = bedSize;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBreakfast() {
        return breakfast;
    }

    public void setBreakfast(Integer breakfast) {
        this.breakfast = breakfast;
    }

    public Integer getPickup() {
        return pickup;
    }

    public void setPickup(Integer pickup) {
        this.pickup = pickup;
    }

    public Integer getTaxi() {
        return taxi;
    }

    public void setTaxi(Integer taxi) {
        this.taxi = taxi;
    }

    public Integer getWindow() {
        return window;
    }

    public void setWindow(Integer window) {
        this.window = window;
    }

    public Integer getToilet() {
        return toilet;
    }

    public void setToilet(Integer toilet) {
        this.toilet = toilet;
    }

    public Integer getCancelTime() {
        return cancelTime;
    }

    public void setCancelTime(Integer cancelTime) {
        this.cancelTime = cancelTime;
    }

    public Integer getNumbers() {
        return numbers;
    }

    public void setNumbers(Integer numbers) {
        this.numbers = numbers;
    }

    public RoomType() {
    }

    public RoomType(String rname, Double price, Double bedSize, Integer id, Integer breakfast, Integer pickup, Integer taxi, Integer window, Integer toilet, Integer cancelTime, Integer numbers) {
        this.rname = rname;
        this.price = price;
        this.bedSize = bedSize;
        this.id = id;
        this.breakfast = breakfast;
        this.pickup = pickup;
        this.taxi = taxi;
        this.window = window;
        this.toilet = toilet;
        this.cancelTime = cancelTime;
        this.numbers = numbers;
    }
}

package com.hero.hotel.pojo;

public class Commenting {
    private Integer id;
    private Integer ord_id;
    private Integer cid;
    private String cimg;
    private Integer flag;

    @Override
    public String toString() {
        return "Commenting{" +
                "id=" + id +
                ", ord_id=" + ord_id +
                ", cid=" + cid +
                ", cimg='" + cimg + '\'' +
                ", flag=" + flag +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrd_id() {
        return ord_id;
    }

    public void setOrd_id(Integer ord_id) {
        this.ord_id = ord_id;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCimg() {
        return cimg;
    }

    public void setCimg(String cimg) {
        this.cimg = cimg;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Commenting() {
    }

    public Commenting(Integer id, Integer ord_id, Integer cid, String cimg, Integer flag) {
        this.id = id;
        this.ord_id = ord_id;
        this.cid = cid;
        this.cimg = cimg;
        this.flag = flag;
    }
}

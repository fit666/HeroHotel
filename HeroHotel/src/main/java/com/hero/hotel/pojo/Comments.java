package com.hero.hotel.pojo;

public class Comments {
    private Integer id;
    private Integer lid;
    private Integer orderid;
    private String content;
    private String contentStartTime;
    private Integer flag;

    @Override
    public String toString() {
        return "Comments{" +
                "id=" + id +
                ", lid=" + lid +
                ", orderid=" + orderid +
                ", content='" + content + '\'' +
                ", contentStartTime='" + contentStartTime + '\'' +
                ", flag=" + flag +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLid() {
        return lid;
    }

    public void setLid(Integer lid) {
        this.lid = lid;
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContentStartTime() {
        return contentStartTime;
    }

    public void setContentStartTime(String contentStartTime) {
        this.contentStartTime = contentStartTime;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Comments() {
    }

    public Comments(Integer id, Integer lid, Integer orderid, String content, String contentStartTime, Integer flag) {
        this.id = id;
        this.lid = lid;
        this.orderid = orderid;
        this.content = content;
        this.contentStartTime = contentStartTime;
        this.flag = flag;
    }
}

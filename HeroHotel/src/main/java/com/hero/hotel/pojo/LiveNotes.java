package com.hero.hotel.pojo;

public class LiveNotes {
    private Integer id;
    private Integer houseid;
    private Integer typeid;
    private Integer info;
    private Integer flag;
    private String date;

    @Override
    public String toString() {
        return "LiveNotes{" +
                "id=" + id +
                ", houseid=" + houseid +
                ", typeid=" + typeid +
                ", info=" + info +
                ", flag=" + flag +
                ", date='" + date + '\'' +
                '}';
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

    public Integer getInfo() {
        return info;
    }

    public void setInfo(Integer info) {
        this.info = info;
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

    public LiveNotes(Integer id, Integer houseid, Integer typeid, Integer info, Integer flag, String date) {
        this.id = id;
        this.houseid = houseid;
        this.typeid = typeid;
        this.info = info;
        this.flag = flag;
        this.date = date;
    }

    public LiveNotes() {
    }
}

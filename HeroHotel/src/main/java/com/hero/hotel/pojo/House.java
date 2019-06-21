package com.hero.hotel.pojo;
/*
 *	 房间表
 */
public class House {
    private Integer id;//房间id
    private Integer typeid;//房间类型id
    private Integer flag;
    private String clean;//清洁状态
    private Integer maintenance;//维修状态

    @Override
    public String toString() {
        return "House{" +
                "id=" + id +
                ", typeid=" + typeid +
                ", flag=" + flag +
                ", clean='" + clean + '\'' +
                ", maintenance=" + maintenance +
                '}';
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

    public String getClean() {
        return clean;
    }

    public void setClean(String clean) {
        this.clean = clean;
    }

    public Integer getMaintenance() {
        return maintenance;
    }

    public void setMaintenance(Integer maintenance) {
        this.maintenance = maintenance;
    }

    public House(Integer id, Integer typeid, Integer flag, String clean, Integer maintenance) {
        this.id = id;
        this.typeid = typeid;
        this.flag = flag;
        this.clean = clean;
        this.maintenance = maintenance;
    }

    public House() {
    }
}

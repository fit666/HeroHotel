package com.hero.hotel.pojo;

public class Permissions {
    private Integer id;
    private String perm;
    private Integer flag;

    @Override
    public String toString() {
        return "Permissions{" +
                "id=" + id +
                ", perm='" + perm + '\'' +
                ", flag=" + flag +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPerm() {
        return perm;
    }

    public void setPerm(String perm) {
        this.perm = perm;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Permissions() {
    }

    public Permissions(Integer id, String perm, Integer flag) {
        this.id = id;
        this.perm = perm;
        this.flag = flag;
    }
}

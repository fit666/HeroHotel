package com.hero.hotel.pojo;

public class Roles {
    private Integer id;
    private  String roleName;
    private Integer flag;

    @Override
    public String toString() {
        return "Roles{" +
                "id=" + id +
                ", roleName='" + roleName + '\'' +
                ", flag=" + flag +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Roles() {
    }

    public Roles(Integer id, String roleName, Integer flag) {
        this.id = id;
        this.roleName = roleName;
        this.flag = flag;
    }
}

package com.hero.hotel.pojo;
/*
 * 	角色表
 */
public class Role {
    private Integer id;//角色id
    private String rolename;//角色名
    private Integer flag;

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", rolename='" + rolename + '\'' +
                ", flag=" + flag +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Role(Integer id, String rolename, Integer flag) {
        this.id = id;
        this.rolename = rolename;
        this.flag = flag;
    }

    public Role() {
    }
}

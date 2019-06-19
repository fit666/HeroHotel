package com.hero.hotel.pojo;

public class RolesPermissions {
    private Integer roleId;
    private Integer permId;
    private Integer flag;
    private Integer id;

    @Override
    public String toString() {
        return "RolesPermissions{" +
                "roleId=" + roleId +
                ", permId=" + permId +
                ", flag=" + flag +
                ", id=" + id +
                '}';
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getPermId() {
        return permId;
    }

    public void setPermId(Integer permId) {
        this.permId = permId;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public RolesPermissions() {
    }

    public RolesPermissions(Integer roleId, Integer permId, Integer flag, Integer id) {
        this.roleId = roleId;
        this.permId = permId;
        this.flag = flag;
        this.id = id;
    }
}

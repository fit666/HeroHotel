package com.hero.hotel.pojo;

public class Manager {
    private Integer id;
    private String macCount;
    private String password;
    private String createTime;
    private Integer roleId;
    private Integer flag;

    @Override
    public String toString() {
        return "Manager{" +
                "id=" + id +
                ", macCount='" + macCount + '\'' +
                ", password='" + password + '\'' +
                ", createTime='" + createTime + '\'' +
                ", roleId=" + roleId +
                ", flag=" + flag +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMacCount() {
        return macCount;
    }

    public void setMacCount(String macCount) {
        this.macCount = macCount;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Manager() {
    }

    public Manager(Integer id, String macCount, String password, String createTime, Integer roleId, Integer flag) {
        this.id = id;
        this.macCount = macCount;
        this.password = password;
        this.createTime = createTime;
        this.roleId = roleId;
        this.flag = flag;
    }
}

package com.hero.hotel.pojo;

public class User {
    private Integer id;
    private Integer roleid;
    private Integer infoid;
    private Integer flag;
    private String account;
    private String password;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", roleid=" + roleid +
                ", infoid=" + infoid +
                ", flag=" + flag +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", tel='" + tel + '\'' +
                ", monetary='" + monetary + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public Integer getInfoid() {
        return infoid;
    }

    public void setInfoid(Integer infoid) {
        this.infoid = infoid;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getMonetary() {
        return monetary;
    }

    public void setMonetary(String monetary) {
        this.monetary = monetary;
    }

    public User() {
    }

    public User(Integer id, Integer roleid, Integer infoid, Integer flag, String account, String password, String tel, String monetary) {
        this.id = id;
        this.roleid = roleid;
        this.infoid = infoid;
        this.flag = flag;
        this.account = account;
        this.password = password;
        this.tel = tel;
        this.monetary = monetary;
    }

    private String tel;
    private String monetary;
}

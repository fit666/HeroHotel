package com.hero.hotel.pojo;
/*
 * 	 用户表
 */
public class User {
    private Integer id;//用户id
    private Integer roleid;//角色id
    private Integer infoid;//个人信息id
    private Integer flag;
    private String account;//账号
    private String password;//密码
    private String tel;//手机号
    private String monetary;//消费金额

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

}

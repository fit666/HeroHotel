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
    private int monetary;//消费金额
    private String createtime;//注册时间
    private Integer rm;//记住我
    private Info info;//个人信息
    private Vip vip;//vip等级
    private String code;//手机验证码
    
    @Override
	public String toString() {
		return "User [id=" + id + ", roleid=" + roleid + ", infoid=" + infoid + ", flag=" + flag + ", account="
				+ account + ", password=" + password + ", tel=" + tel + ", monetary=" + monetary + ", createtime="
				+ createtime + ", rm=" + rm + ", info=" + info + ", vip=" + vip + "]";
	}
    
    public Integer getRm() {
		return rm;
	}
  
    

    public String getCreatetime() {
		return createtime;
	}

	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	

	public void setRm(Integer rm) {
		this.rm = rm;
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

    public int getMonetary() {
        return monetary;
    }
    
   

	public Info getInfo() {
		return info;
	}

	public void setInfo(Info info) {
		this.info = info;
	}

	public Vip getVip() {
		return vip;
	}

	public void setVip(Vip vip) {
		this.vip = vip;
	}

	public void setMonetary(int monetary) {
        this.monetary = monetary;
    }

    public User() {
    }

    
	

}

package com.hero.hotel.pojo;

public class Manager {
    private Integer id;
    private String maccount;
    private String password;
    private String createTime;
    private Integer roleId;
    private Integer flag;
    private Integer rm;
    
    

   
	@Override
    public String toString() {
        return "Manager{" +
                "id=" + id +
                ", maccount='" + maccount + '\'' +
                ", password='" + password + '\'' +
                ", createTime='" + createTime + '\'' +
                ", roleId=" + roleId +
                ", flag=" + flag +
                '}';
    }
	
    public String getMaccount() {
		return maccount;
	}

	public void setMaccount(String maccount) {
		this.maccount = maccount;
	}

	public Integer getRm() {
		return rm;
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

	public Manager(Integer id, String maccount, String password, String createTime, Integer roleId, Integer flag,
			Integer rm) {
		super();
		this.id = id;
		this.maccount = maccount;
		this.password = password;
		this.createTime = createTime;
		this.roleId = roleId;
		this.flag = flag;
		this.rm = rm;
	}
    
}

   

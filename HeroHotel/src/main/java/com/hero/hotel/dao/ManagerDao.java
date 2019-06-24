package com.hero.hotel.dao;

import org.apache.ibatis.annotations.Select;

import com.hero.hotel.pojo.User;


public interface ManagerDao {
	//根据账号查询密码
	@Select("select * from t_user where account=#{account} and flag=1")
	public User findManagerPwd(String account);
}

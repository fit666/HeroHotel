package com.hero.hotel.dao;

import org.apache.ibatis.annotations.Select;

import com.hero.hotel.pojo.Manager;

public interface ManagerDao {
	//根据账号查询密码
	@Select("select * from manager where macCount=#{account} and flag=1")
	public Manager findManagerPwd(Integer account);
}

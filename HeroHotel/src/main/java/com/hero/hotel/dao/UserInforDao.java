package com.hero.hotel.dao;

import org.apache.ibatis.annotations.Select;

import com.hero.hotel.pojo.Info;

public interface UserInforDao {
	//根据id查找用户信息
	@Select("select * from userinfor where id=#{uid}")
	public Info findById(Integer uid);
}

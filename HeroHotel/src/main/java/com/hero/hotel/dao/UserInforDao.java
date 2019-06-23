package com.hero.hotel.dao;

import org.apache.ibatis.annotations.Select;

import com.hero.hotel.pojo.Info;

public interface UserInforDao {
	//根据id查找用户信息
	@Select("select * from t_info where infoid=#{uid}")
	public Info findById(Integer uid);
}

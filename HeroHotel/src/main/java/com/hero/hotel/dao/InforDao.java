package com.hero.hotel.dao;

import org.apache.ibatis.annotations.Select;

import com.hero.hotel.pojo.Info;

public interface InforDao {
	//根据id查找用户信息
	@Select("select * from t_info where infoid=#{infoid}")
	public Info findById(Integer infoid);
}

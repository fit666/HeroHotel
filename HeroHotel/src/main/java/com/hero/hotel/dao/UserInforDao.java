package com.hero.hotel.dao;

import org.apache.ibatis.annotations.Select;

import com.hero.hotel.pojo.UserInfor;

public interface UserInforDao {
	//根据id查找vip信息
	@Select("select * from userinfor where id=#{uid}")
	public UserInfor findById(Integer uid);
}

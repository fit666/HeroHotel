package com.hero.hotel.dao;

import org.apache.ibatis.annotations.Select;

import com.hero.hotel.pojo.Members;

public interface MembersDao {
	//根据id查找vip信息
	@Select("select * from members where id=#{mid}")
	public Members findById(Integer mid);
}

package com.hero.hotel.dao;

import org.apache.ibatis.annotations.Select;

import com.hero.hotel.pojo.Vip;



public interface VipDao {
	//根据id查找vip信息
	@Select("select * from members where id=#{mid}")
	public Vip findById(Integer mid);
}

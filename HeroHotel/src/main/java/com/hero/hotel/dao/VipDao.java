package com.hero.hotel.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.hero.hotel.pojo.Vip;

public interface VipDao {
	
	@Select("select vname,discount where vmoney=#{i}")
	public Vip queryClassByMoney(int i);
	
	@Select("select * from t_vip ")
	public List<Vip> queryAllVip();
}

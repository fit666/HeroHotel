package com.hero.hotel.dao;

import org.apache.ibatis.annotations.Select;

import com.hero.hotel.pojo.Vip;



public interface VipDao {
	//根据累计消费查找vip信息
	@Select("select MIN(id),vname,discount from t_vip WHERE vmoney>#{mid}")
	public Vip findById(Integer mid);
}

package com.hero.hotel.dao;

import org.apache.ibatis.annotations.Select;

import com.hero.hotel.pojo.Vip;



public interface VipDao {
	//根据累计消费查找vip信息
	@Select("SELECT * FROM t_vip WHERE id = (select MAX(id) from t_vip where id =(select MAX(id) from t_vip WHERE vmoney<#{monetary}) or id= (select MIN(id) from t_vip WHERE vmoney>#{monetary}))")
	public Vip findById(double monetary);
}

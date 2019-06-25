package com.hero.hotel.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.hero.hotel.pojo.Order;

public interface OrderDao {
	@Select("select * from t_order where userid=#{uid}")
	public List<Order> queryAllByUid(int uid);

}

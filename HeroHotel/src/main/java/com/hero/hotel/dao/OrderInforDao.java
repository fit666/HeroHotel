package com.hero.hotel.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

public interface OrderInforDao {

	@Select("select roomid from orderinfor where today=#{time} and flag=0")
	public List<Integer> findOrderInforRid(String time);

}

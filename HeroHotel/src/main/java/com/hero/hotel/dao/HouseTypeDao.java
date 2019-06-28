package com.hero.hotel.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.hero.hotel.pojo.HouseType;


public interface HouseTypeDao {
	
	@Select("select typeid,hname,serve,breakfast,imgurl,price from t_housetype where flag=1")
	public List<HouseType> queryAllType();
}

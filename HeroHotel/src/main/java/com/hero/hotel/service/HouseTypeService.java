package com.hero.hotel.service;

import java.util.List;

import com.hero.hotel.pojo.HouseType;

public interface HouseTypeService {
	//查询所有房间
	public List<HouseType> findAllHouses();
	//获取所有的房间类型
	public List<HouseType> findAllType();

}

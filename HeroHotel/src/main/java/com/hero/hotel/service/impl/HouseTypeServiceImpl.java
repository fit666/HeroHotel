package com.hero.hotel.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hero.hotel.dao.HouseTypeDao;
import com.hero.hotel.pojo.HouseType;
import com.hero.hotel.service.HouseTypeService;
@Service
public class HouseTypeServiceImpl implements HouseTypeService {
	@Resource
	private HouseTypeDao houseTypeDao;
	@Override
	public List<HouseType> queryAllType() {
		// TODO Auto-generated method stub
		return houseTypeDao.queryAllType();
	}

}

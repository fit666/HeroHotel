package com.hero.hotel.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hero.hotel.dao.VipDao;
import com.hero.hotel.pojo.Vip;
import com.hero.hotel.service.VipService;
@Service
public class VipServiceImpl implements VipService {
	@Resource
	private VipDao vipDao;

	@Override
	public List<Vip> queryAllVip() {
		// TODO Auto-generated method stub
		return vipDao.queryAllVip();
	}
}

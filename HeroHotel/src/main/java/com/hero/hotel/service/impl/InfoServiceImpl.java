package com.hero.hotel.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hero.hotel.dao.InfoDao;
import com.hero.hotel.pojo.Info;
import com.hero.hotel.service.InfoService;

@Service
public class InfoServiceImpl implements InfoService{
	
	@Resource
	private InfoDao infoDao;
	@Override
	public List<Info> queryInfo(String tel) {
		// TODO Auto-generated method stub
		return infoDao.queryInfoByTel(tel);
	}

	@Override
	public int addInfo(Info info) {
		// TODO Auto-generated method stub
		return infoDao.addInfo(info);
	}

}

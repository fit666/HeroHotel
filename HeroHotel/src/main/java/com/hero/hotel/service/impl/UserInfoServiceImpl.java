package com.hero.hotel.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hero.hotel.dao.UserInfoDao;

import com.hero.hotel.service.UserInfoService;

@Service("userInforService")
public class UserInfoServiceImpl implements UserInfoService {

	@Resource
	private UserInfoDao userInfoDao;

	@Override
	public List<Map> findUserMessage() {

		return null;
	}

	@Override
	public List<String> findUserInfo() {

		List<String> nowUserInfos = userInfoDao.findUserInfo();
		return nowUserInfos;
	}

}

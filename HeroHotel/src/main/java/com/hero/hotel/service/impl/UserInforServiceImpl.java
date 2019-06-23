package com.hero.hotel.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hero.hotel.dao.UserInfoDao;
import com.hero.hotel.pojo.NowUserInfo;
import com.hero.hotel.service.UserInforService;

@Service("userInforService")
public class UserInforServiceImpl implements UserInforService {

	@Resource
	private UserInfoDao userInfoDao;

	@Override
	public List<Map> findUserMessage() {

		return null;
	}

	@Override
	public List<NowUserInfo> findUserInfo() {

		List<NowUserInfo> nowUserInfos = userInfoDao.findUserInfo();
		return nowUserInfos;
	}

}

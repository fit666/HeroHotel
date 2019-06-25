package com.hero.hotel.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hero.hotel.dao.UserDao;
import com.hero.hotel.pojo.Info;
import com.hero.hotel.pojo.User;
import com.hero.hotel.service.UserService;
@Service
public class UserServiceImpl implements UserService{
	@Resource
	private UserDao userDao;
	@Override
	public User queryInfo(int account) {
		
		return userDao.querySelf(account);
	}
	@Override
	public int updatePwd(User user) {
		// TODO Auto-generated method stub
		return userDao.updatePwd(user);
	}

}

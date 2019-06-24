package com.hero.hotel.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hero.hotel.dao.UserDao;
import com.hero.hotel.pojo.User;
import com.hero.hotel.service.UserService;
@Service("accountService")
public class UserServiceImpl implements UserService{
	@Resource
	private UserDao accountDao;
	@Override
	public List<User> findAllVip() {
		return accountDao.findAll();
	}

}

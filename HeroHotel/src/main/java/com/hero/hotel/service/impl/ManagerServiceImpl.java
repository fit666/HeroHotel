package com.hero.hotel.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hero.hotel.dao.ManagerDao;
import com.hero.hotel.pojo.Manager;
import com.hero.hotel.service.ManagerService;

@Service("managerService")
public class ManagerServiceImpl implements ManagerService{
	@Resource
	private ManagerDao managerDao;
	

	/*
	 * 通过用户账号查找密码(non-Javadoc)
	 * @see com.hero.hotel.service.ManagerService#findManagerPwd(java.lang.Integer)
	 */
	@Override
	public Manager findManagerPwd(Integer account) {
		
		return managerDao.findManagerPwd(account);
	}

}

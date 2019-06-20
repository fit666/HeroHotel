package com.hero.hotel.service;

import com.hero.hotel.pojo.Manager;

public interface ManagerService {
	//通过账号查找密码
	 Manager findManagerPwd(Integer account);
}

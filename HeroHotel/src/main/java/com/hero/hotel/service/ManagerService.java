package com.hero.hotel.service;

import com.hero.hotel.pojo.User;

public interface ManagerService {
	//通过账号查找密码
	 User findManagerPwd(String account);
}

package com.hero.hotel.service;

import java.util.List;

import com.hero.hotel.pojo.User;


public interface UserService {

	List<User> findAllVip();
	//注册
	public String register(User user);
	//发送短信验证码
	public String sendMessage(User user);


}


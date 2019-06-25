package com.hero.hotel.service;

import java.util.List;

import com.hero.hotel.pojo.User;


public interface UserService {

	List<User> findAllVip();
	//注册
	public String register(User user);
	//发送短信验证码
	public String sendMessage(User user);
	//停用账号
	String vipStop(Integer id);
	//停用用户账号
	String vipStart(Integer id);
	//删除会员账号
	String userDelete(Integer id);
	//获取所有已删除的会员
	List<User> findAllDeletedVips();


}


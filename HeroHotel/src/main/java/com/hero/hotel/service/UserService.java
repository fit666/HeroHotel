package com.hero.hotel.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;

import com.hero.hotel.pojo.User;


public interface UserService {

	List<User> findAllVip();
	//注册
	public String register(User user,HttpSession session);
	//发送短信验证码
	public String sendMessage(User user,HttpSession session);
	//账号密码登录
	public String login(User user, HttpSession session);
	//手机验证码登录
	public String loginTel(User user,HttpSession session);

}


package com.hero.hotel.service;

import com.hero.hotel.pojo.User;

import java.util.List;

import javax.servlet.http.HttpSession;


public interface UserService {

	List<User> findAllVip();
	//注册
	public String register(User user,HttpSession session);
	
	//停用账号
	String vipStop(Integer id);
	//&#x505c;&#x7528;&#x7528;&#x6237;&#x8d26;&#x53f7;
	String vipStart(Integer id);
	//删除会员账号
	String userDelete(Integer id);
	//获取所有已删除的会员
	List<User> findAllDeletedVips();
	//发送短信验证码
	public String sendMessage(User user,HttpSession session);
	//账号密码登录
	public String login(User user,HttpSession session);
	//手机验证码登录
	public String loginTel(User user,HttpSession session);
	//忘记密码（修改密码）
	public String forgetPass(User user, HttpSession session);

}


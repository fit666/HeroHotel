package com.hero.hotel.controller;


import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hero.hotel.pojo.User;
import com.hero.hotel.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Resource
	private UserService accountService;

	public UserService getAccountService() {
		return accountService;
	}

	public void setAccountService(UserService accountService) {
		this.accountService = accountService;
	}

	//登录
	@RequestMapping("/login")
	@ResponseBody
	public String login() {
		
		
		return null;
	}
	

	// 注册
	@RequestMapping("/register")
	@ResponseBody
	public String register(User user) {
		System.out.println(user);
		String result = "注册失败";
		result = accountService.register(user);
		return result;
	}

	
	// 获取手机动态验证码
	@RequestMapping("/code")
	@ResponseBody
	public String getCode(User user) {
		String result="短信发送失败";
		result=accountService.sendMessage(user);
		return result;
	}


}

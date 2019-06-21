package com.hero.hotel.controller;


import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hero.hotel.pojo.Account;
import com.hero.hotel.service.UserService;

@Controller
@RequestMapping("/account")
public class UserController {
	@Resource
	private UserService accountService;

	public UserService getAccountService() {
		return accountService;
	}

	public void setAccountService(UserService accountService) {
		this.accountService = accountService;
	}


	// 注册
	@RequestMapping("/register")
	@ResponseBody
	public String register(Account account) {
		System.out.println(account);
		String result = "注册失败";
		result = accountService.register(account);
		return result;
	}

	
	// 获取手机动态验证码
	@RequestMapping("/code")
	@ResponseBody
	public String getCode(Account account) {
		String result="短信发送失败";
		result=accountService.sendMessage(account);
		return result;
	}

}

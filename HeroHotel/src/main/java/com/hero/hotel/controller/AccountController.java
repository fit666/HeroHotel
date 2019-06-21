package com.hero.hotel.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hero.hotel.pojo.Account;
import com.hero.hotel.service.AccountService;

@Controller
@RequestMapping("/account")
public class AccountController {
	@Resource
	private AccountService accountService;

	public AccountService getAccountService() {
		return accountService;
	}

	public void setAccountService(AccountService accountService) {
		this.accountService = accountService;
	}

	@RequestMapping("/test")
	@ResponseBody
	public List<String> test() {
		List<String> l = new ArrayList<>();
		l.add("s0");
		l.add("s1");
		return l;
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

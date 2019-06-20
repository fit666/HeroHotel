package com.hero.hotel.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hero.hotel.pojo.Account;
import com.hero.hotel.service.AccountService;

@Controller
public class AccountController {
	@Resource
	private AccountService accountService;
	
	public AccountService getAccountService() {
		return accountService;
	}

	public void setAccountService(AccountService accountService) {
		this.accountService = accountService;
	}

	//注册
	@RequestMapping("/register")
	@ResponseBody
	public String register(Account account,HttpSession session) {
		String result="注册失败";
		result=accountService.register(account, session);
		return result;
	}

}

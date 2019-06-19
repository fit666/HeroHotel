package com.hero.hotel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hero.hotel.pojo.Account;

@Controller
public class UserController {
	
	//注册
	
	@RequestMapping("/register")
	public String register(Account account) {
		
		
		return null;
	}

}

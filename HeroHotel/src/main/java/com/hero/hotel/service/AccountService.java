package com.hero.hotel.service;

import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;

import com.hero.hotel.pojo.Account;

public interface AccountService {
	
	public String register(Account account,HttpSession session);

}

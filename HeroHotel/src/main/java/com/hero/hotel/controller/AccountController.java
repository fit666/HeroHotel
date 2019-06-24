package com.hero.hotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hero.hotel.pojo.Account;
import com.hero.hotel.service.AccountService;

@Controller
public class AccountController {
	@Autowired
	private AccountService accountService;
	/*
	 * 查询所有会员
	 */
	@RequestMapping("/findAllVip")
	public ModelAndView findAllVip(){
		ModelAndView mav=new ModelAndView();
		List<Account> vips=accountService.findAllVip();
		mav.addObject("allVips", vips);
		mav.setViewName("/vip-list.html");
		return mav;
	}
}

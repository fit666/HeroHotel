package com.hero.hotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hero.hotel.pojo.User;
import com.hero.hotel.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	/*
	 * 查询所有会员
	 */
	@RequestMapping("/findAllVip")
	public ModelAndView findAllVip(){
		ModelAndView mav=new ModelAndView();
		List<User> vips=userService.findAllVip();
		mav.addObject("allVips", vips);
		mav.setViewName("/vip-list.html");
		return mav;
	}

}

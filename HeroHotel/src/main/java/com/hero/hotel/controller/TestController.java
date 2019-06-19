package com.hero.hotel.controller;


import javax.annotation.Resource;

import org.springframework.stereotype.Controller;


@Controller
public class TestController {
	@Resource
	private UserService userService;
	
	
	
	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}



	
	

}

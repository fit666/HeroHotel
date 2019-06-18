package com.hero.hotel.controller;


import java.util.List;

import javax.annotation.Resource;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hero.hotel.pojo.User;
import com.hero.hotel.service.UserService;


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

	@RequestMapping("login")
	@ResponseBody
	public List<User> hello() {
		
		System.out.println(66);
		return userService.findUsers();
	}
	
	@RequestMapping("info")
	public String login(User user) {
		Subject currentUser=SecurityUtils.getSubject();
		return "index.html";
	}
	
	

}

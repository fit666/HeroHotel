package com.hero.hotel.test;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hero.hotel.service.UserService;

@Controller
public class Base {
	
	@Resource
	private UserService userService;
	
	
	public UserService getUserService() {
		return userService;
	}


	public void setUserService(UserService userService) {
		this.userService = userService;
	}


	//1连接测试
	@RequestMapping("/test1")
	@ResponseBody
	public List<User> test() {
		return userService.findUsers();
	}

}

package com.hero.hotel.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hero.hotel.service.UserInforService;

@Controller
@RequestMapping("/userInfor")
public class UserInforController {
	
	@Resource
	private UserInforService userInforService;

	@GetMapping("/findUserMessage")
	public ModelAndView findUserMessage(String phoneNumber){
		
		
		
		
		return null;
		
	}
}

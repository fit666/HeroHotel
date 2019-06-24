package com.hero.hotel.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.ResponseBody;
import com.hero.hotel.pojo.User;
import com.hero.hotel.service.UserService;
import com.hero.hotel.service.impl.UserServiceImpl;

@Controller
@RequestMapping("/user")
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
		mav.setViewName("/backstage-html/vip-list.html");
		return mav;
	}

	// 注册
	@RequestMapping("/register")
	@ResponseBody
	public String register(User user) {
		System.out.println(user);
		String result = "注册失败";
		result = userService.register(user);
		return result;
	}

	// 获取手机动态验证码
	@RequestMapping("/code")
	@ResponseBody
	public String getCode(User user) {
		String result = "短信发送失败";
		result = userService.sendMessage(user);
		return result;
	}

	// 用户登录
	@RequestMapping("/login")
	@ResponseBody
	public String login() {

		return "";
	}
	/*
	 * 获取所有管理员
	 */
	@RequestMapping("/findAllManagers")
	public ModelAndView findAllManagers(){
		ModelAndView mav=new ModelAndView();
		List<User> managers=userService.findAllManagers();
		mav.addObject("managers",managers);
		mav.setViewName("/backstage-html/manager-list.html");
		System.out.println(managers);
		return mav;
	}

}

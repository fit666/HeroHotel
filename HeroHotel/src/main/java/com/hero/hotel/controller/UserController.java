package com.hero.hotel.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.ResponseBody;
import com.hero.hotel.pojo.User;
import com.hero.hotel.realm.CustomizedToken;
import com.hero.hotel.service.UserService;
import com.woniu.hotel.enump.LoginType;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	
	
	
	
	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	/*
	 * 查询所有会员
	 */
	@RequestMapping("/findAllVip")
	public ModelAndView findAllVip() {
		System.out.println("----------------------");
		ModelAndView mav = new ModelAndView();
		List<User> vips = userService.findAllVip();
		mav.addObject("allVips", vips);
		System.out.println(vips);
		mav.setViewName("/backstage-html/vip-list.html");
		return mav;
	}

	
	 //账号密码登录（图形验证码）
    @RequestMapping("/login")
	public String login(User user, HttpSession session) {
    	String result="登录失败";
		result=userService.login(user, session);
    	return result;
	}
    
  //手机号动态码登录
    @RequestMapping("/loginTel")
	public String loginTel(User user,HttpSession session) {
    	String result="登录失败";
    	result=userService.loginTel(user, session);
		return result;
	}
    
	// 注册
	@RequestMapping("/register")
	@ResponseBody
	public String register(User user,HttpSession session) {
		System.out.println(user);
		String result = "注册失败";
		result = userService.register(user,session);
		return result;
	}

	// 获取手机动态验证码
	@RequestMapping("/code")
	@ResponseBody
	public String getCode(User user,HttpSession session) {
		String result = "短信发送失败";
		result = userService.sendMessage(user,session);
		return result;
	}

}

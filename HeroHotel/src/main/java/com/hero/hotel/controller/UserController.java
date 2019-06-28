package com.hero.hotel.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.hero.hotel.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.ResponseBody;
import com.hero.hotel.service.UserService;

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
	public ModelAndView findAllVip(){
		ModelAndView mav=new ModelAndView();
		List<User> vips=userService.findAllVip();
		mav.addObject("allVips", vips);
		mav.setViewName("/backstage-html/vip-list.html");
		return mav;
	}

	
	 //账号密码登录（图形验证码）
	
    @RequestMapping("/login")
    @ResponseBody
	public String login(User user, HttpSession session) {
    	String result="登录失败";
		result=userService.login(user,session);
    	return result;
	}
    
  //手机号动态码登录
    @RequestMapping("/loginTel")
    @ResponseBody
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
	/**
	 * 忘记密码
	 * @param id
	 * @return
	 */
	@RequestMapping("/forget")
	@ResponseBody
	public String forgetPass(User user,HttpSession session) {
		String result="修改失败";
		result=userService.forgetPass(user,session);
		return result;
	}

	/*
	 * 停用用户账号
	 */
	@RequestMapping("/vipStop")
	@ResponseBody
	public String vipStop(Integer id){
		return userService.vipStop(id);
	}
	/*
	 * 启用用户账号
	 */
	@RequestMapping("/vipStart")
	@ResponseBody
	public String vipStart(Integer id){
		return userService.vipStart(id);
	}
	/*
	 * 删除会员
	 */
	@RequestMapping("/userDelete")
	@ResponseBody
	public String userDelete(Integer id){
		return userService.userDelete(id);
	}
	/*
	 * 获取所有已删除的会员
	 */
	@RequestMapping("/findAllDeletedVips")
	public ModelAndView findAllDeletedVips(){
		ModelAndView mav=new ModelAndView();
		List<User> vips=userService.findAllDeletedVips();
		mav.addObject("allVips", vips);
		mav.setViewName("/backstage-html/vip-deleted.html");
		return mav;
	}
}

package com.hero.hotel.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hero.hotel.pojo.Info;
import com.hero.hotel.pojo.User;
import com.hero.hotel.service.InfoService;
import com.hero.hotel.service.UserService;


@Controller
@RequestMapping("/user")
public class UserController {
	@Resource
	private UserService userService;
	@Resource
	private InfoService infoService;
	
	@RequestMapping("/userInfo")
	@ResponseBody
	public Map<String,Object> showInfo(HttpServletRequest request) {
		Map<String,Object> map = new HashMap<String,Object>();
		Object obj = request.getSession().getAttribute("user");
		User user = (User) obj;
		List<Info> infos =infoService.queryInfo(user.getTel());
		map.put("user", user);
		map.put("infos",infos);
		return map;
	}
	@RequestMapping("/rpwd")
	@ResponseBody
	public String resetPwd(String pwd,HttpServletRequest request) {
		String result="修改失败";
		Object obj =request.getSession().getAttribute("user");
		User user = (User) obj;
		user.setPassword(pwd);
		if(userService.updatePwd(user)!=0) {
			result="修改成功";
		}
		return result;
	}
	@RequestMapping("/isLogin")
	@ResponseBody
	public String isLogin(HttpServletRequest request) {
		String result="失败";
		Object obj =request.getSession().getAttribute("user");
		if(obj!=null) {
			result="成功";
		}
		return result;
	}
}

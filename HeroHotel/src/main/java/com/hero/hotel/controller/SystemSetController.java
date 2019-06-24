package com.hero.hotel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hero.hotel.pojo.SystemSet;
import com.hero.hotel.service.SystemsetService;

@Controller
@RequestMapping("/system")
public class SystemSetController {
	@Autowired
	private SystemsetService systemsetService;
	/*
	 * 获取系统设置表的数据
	 */
	@RequestMapping("/findBillingReuls")
	public ModelAndView findBillingReuls(){
		ModelAndView mav=new ModelAndView();
		SystemSet set=systemsetService.findRules();
		System.out.println(set);
		mav.addObject("set", set);
		mav.setViewName("/backstage-html/system-billingrules.html");
		return mav;
	}
	/*
	 * 更新系统设置
	 */
	@RequestMapping("/updateSet")
	public ModelAndView updateSet(SystemSet set1){
		ModelAndView mav=new ModelAndView();
		String result=null;
		//判断数据是否正确
		if(set1.getFindvipmessagebyid()==null 
				|| set1.getFindvipmessagebyname()==null
				|| set1.getMoneytoint()==null){
			result="选项不能为空";
			return mav;
		}else{
			boolean res=systemsetService.updateSet(set1);
			if(res){
				result="修改成功";
				SystemSet set=systemsetService.findRules();
				mav.addObject("set", set);
			}else{
				result="修改失败";
			}
		}
		System.out.println(result);
		mav.addObject("result", result);
		mav.setViewName("/backstage-html/system-billingrules2.html");
		return mav;
	}
}

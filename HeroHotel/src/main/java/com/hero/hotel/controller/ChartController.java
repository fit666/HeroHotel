package com.hero.hotel.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Generated;
import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hero.hotel.service.ChartService;

@Controller
@RequestMapping("/chart")
public class ChartController {
	
	@Resource
	private ChartService chartService;

	
	@GetMapping("/findMoney")
	public ModelAndView findMoneyInAndOut(String startTime, String endTime) {

		System.out.println(startTime);
		System.out.println(endTime);

		
		return null;
	}

	// 根据天查询
	@GetMapping("/findMoneyDay")
	public ModelAndView findMoneyDay() {
		
		// 查询数每天的 时间  收入  支出  放到map中  再  存放到list中
		List<Map<String, Object>> lists = new ArrayList<Map<String, Object>>();
		lists =  chartService.findMoneyDay();
		
		System.out.println(lists);
		
		
		return null;

	}

}

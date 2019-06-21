package com.hero.hotel.controller;

import java.util.HashMap;
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
	
//	@Resource
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
		
		
		Map<String, Object> map = new HashMap<String, Object>();
		
//		map = chartService.fingMoneyDay();
		System.out.println("6789------------------");
		
		return null;

	}

}

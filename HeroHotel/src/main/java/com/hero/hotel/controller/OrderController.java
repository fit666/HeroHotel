package com.hero.hotel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hero.hotel.service.OrderService;

@Controller()
@RequestMapping("/order")
public class OrderController {

	private OrderService orderService;
	
	// 结账
	@RequestMapping("/settle accounts")
	public ModelAndView settleAccounts(String houseid) {
		
		Boolean flag = orderService.settleAccounts(houseid);
		
		
		
		return null;

	}

}

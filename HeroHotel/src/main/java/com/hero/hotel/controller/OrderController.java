package com.hero.hotel.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hero.hotel.pojo.Order;
import com.hero.hotel.pojo.User;
import com.hero.hotel.service.OrderService;

@Controller
@RequestMapping("/order")
public class OrderController {
	@Resource
	private OrderService orderService;
	@RequestMapping("allOrders")
	@ResponseBody
	public List<Order> queryOrder(HttpServletRequest request) {
		Object obj =request.getSession().getAttribute("user");
		User user = (User) obj;
		List<Order> orders =orderService.queryAllOrder(1);
		return orders;
	}
}

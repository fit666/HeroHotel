package com.hero.hotel.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.annotation.Resource;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hero.hotel.pojo.HouseType;
import com.hero.hotel.pojo.Info;
import com.hero.hotel.pojo.LiveNotes;
import com.hero.hotel.pojo.Order;
import com.hero.hotel.pojo.OrderItem;
import com.hero.hotel.pojo.User;
import com.hero.hotel.pojo.Vip;
import com.hero.hotel.service.OrderService;

@Controller
@RequestMapping("/order")
public class OrderController {
	@Resource
	private OrderService orderService;



	// 查找某位客人的所有订单记录
	@RequestMapping("/findorder")
	public ModelAndView findOrder(Info info) {
		ModelAndView model = new ModelAndView();
		model = orderService.findAllOrder(info);
		model.setViewName("backstage-html/findOrder.html");
		System.out.println(model);
		return model;
	}

	// 修改订单信息
	@RequestMapping("/updateorder")
	public ModelAndView updateOder(Info info, Order order, OrderItem orderItem) {
		ModelAndView model = new ModelAndView();
		model = orderService.updateOrder(info, order, orderItem);
		model.setViewName("backstage-html/findOrder.html");
		return model;
	}

	// 删除订单
	@RequestMapping("/deleteorder")
	public ModelAndView deleteOrder(LiveNotes liveNotes, OrderItem orderItem, Order order, Info info) {
		ModelAndView model = new ModelAndView();
		model = orderService.deleteOrder(liveNotes, orderItem, order, info);
		model.setViewName("backstage-html/findOrder.html");
		return model;

	}

	// 结账  要跳 那些页面 你来定
	@RequestMapping("/settleAccounts")
	public ModelAndView settleAccounts(Integer orderItemid, Integer houseid) {
		Boolean flag = orderService.settleAccounts(orderItemid, houseid);
		return null;
	}


	// 取消订单   要跳 那些页面 你来定
	@RequestMapping("/canceOrder")
	public ModelAndView canceOrder(Integer orderItemid, Integer houseid) {
		Boolean flag = orderService.settleAccounts(orderItemid, houseid);
		return null;

	}

}

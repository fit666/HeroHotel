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


	// 添加订单(订单中支付编号在支付完成后插入订单中)
	@RequestMapping("/addorder")
	public ModelAndView addOrder(Info info, Order order, OrderItem orderItem,
			@DateTimeFormat(pattern = "yyyy-MM-dd") Date date1, @DateTimeFormat(pattern = "yyyy-MM-dd") Date date2) {
		// 入住时间
		int day = (int) (date2.getTime() - date1.getTime()) / (24 * 60 * 60 * 1000);
		// 计算总价:根据从前端获取的房间数量和房间价格，再从会员表中获取的折扣
		// 从作用域中获取登录账号id
		// 获取入住天数
		int id = 1;// 还未获取
		order.setUserid(id);// 存入账号id
		User user = orderService.findMonetaryByid(id);
		// 从对象中获取对应的折扣
		Vip vip = new Vip();
		if (user.getMonetary() < 2000) {
			vip.setDiscount(1.0);
		} else if (user.getMonetary() >= 2000 && user.getMonetary() < 5000) {
			vip.setDiscount(0.9);
		} else {
			vip.setDiscount(0.8);
		}
		double total = 0.0;
		// 总价
		// 查询房间单价
		HouseType houseType = orderService.findPriceByTypeid(orderItem.getTypeid());

		total = houseType.getPrice() * orderItem.getQuantity() * vip.getDiscount() * day;
		order.setTotal(total);// 存入总价
		// 获取订单生成时间
		Date date = new Date();
		String orderTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
		order.setCreatetime(orderTime);// 存入生成时间
		order.setUpdatetime(orderTime);// 存入修改时间
		// 订单编号
		String orderNumber = "" + System.currentTimeMillis() + id + new Random().nextInt(10);
		order.setOrdernumber(orderNumber);// 存入订单编号
		orderService.addOrder(order);
		// 插入个人信息表
		// 插入个人信息表
		orderService.addInfo(info);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		// 插入房间记录表
		/*
		 * 查询可用的房间
		 */
		// 查询所有房间id
		LiveNotes liveNotes = new LiveNotes();
		liveNotes.setTypeid(orderItem.getTypeid());

		List<String> allDay = new ArrayList<>();
		while (date1.getTime() != date2.getTime()) {

			allDay.add(sdf.format(date1));
			date1 = new Date(date1.getTime() + 24 * 60 * 60 * 1000);
		}
		// 所有房间id
		List<Integer> roomIds = orderService.findAllRoomsByTypeid(orderItem.getTypeid());
		// 将日期转换为字符串
		for (int i = 0; i < allDay.size(); i++) {
			liveNotes.setDate(allDay.get(i));
			// 查询已经入住的房间id
			List<Integer> liveRoomIds = orderService.findAllliveRoomsByTypeid(liveNotes);
			roomIds.removeAll(liveRoomIds);
		}
		ModelAndView model = new ModelAndView();
		model.setViewName("backstage-html/add-oder.html");
		if (roomIds.size() <= 0) {
			return model;
		}
		// 查询个人信息id
		Order order2 = orderService.findIdByOrderNumber(orderNumber);
		Info info2 = orderService.findId(info.getIdcard());
		// 将个人信息id加入入住信息
		liveNotes.setInfoid(info2.getInfoid());
		// 将可入住房间加入入住信息表
		liveNotes.setHouseid(roomIds.get(0));
		for (int i = 0; i < allDay.size(); i++) {
			liveNotes.setDate(allDay.get(i));
			orderService.addLiveNotes(liveNotes);
		}
		// 订单id
		orderItem.setPrice(houseType.getPrice());// 插入价格
		orderItem.setOrderid(order2.getOrderid());// 存入订单id
		orderItem.setStarttime(orderTime);// 存入入住时间
		orderItem.setEndtime(sdf.format(date2));
		orderItem.setDay(day);// 存入入住天数
		orderItem.setHouseid(liveNotes.getHouseid());
		orderService.addOrderItem(orderItem);
		model.setViewName("backstage-html/add-oder.html");
		return model;
	}

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

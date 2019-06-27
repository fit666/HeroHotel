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
	//添加订单(订单中支付编号在支付完成后插入订单中)
	@RequestMapping("/addorder")
	public ModelAndView addOrder(Info info,Order order,OrderItem orderItem,@DateTimeFormat(pattern="yyyy-MM-dd") Date date1,@DateTimeFormat(pattern="yyyy-MM-dd") Date date2){
		//入住时间
		int day =(int)(date2.getTime()-date1.getTime())/(24*60*60*1000);
		//计算总价:根据从前端获取的房间数量和房间价格，再从会员表中获取的折扣
		//从作用域中获取登录账号id
		//获取入住天数
		int id = 1;//还未获取
		//插入个人信息表
		orderService.addInfo(info);
		Info info2 = orderService.findId(info.getIdcard());
		order.setInfoid(info2.getInfoid());//存入个人信息id
		order.setUserid(id);
		User user = orderService.findMonetaryByid(id);
		//从对象中获取对应的折扣
		Vip vip = new Vip();
		vip.setDiscount(1.0);
		if (user != null) {	
			if (user.getMonetary()<2000) {
				vip.setDiscount(1.0);
			} else if (user.getMonetary()>=2000 && user.getMonetary() < 5000) {
				vip.setDiscount(0.9);
			} else {
				vip.setDiscount(0.8);
			}
		}
		double total = 0.0;
		//总价
		//查询房间单价
		HouseType houseType = orderService.findPriceByTypeid(orderItem.getTypeid());
		total = houseType.getPrice()*orderItem.getQuantity()*vip.getDiscount()*day+order.getDeposit();
		order.setTotal(total);//存入总价
		//获取订单生成时间
		Date date = new Date();
		String orderTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
		order.setCreatetime(orderTime);//存入生成时间
		order.setUpdatetime(orderTime);//存入修改时间
		//订单编号
		String orderNumber = "" + System.currentTimeMillis()+id+new Random().nextInt(10);
		order.setOrdernumber(orderNumber);//存入订单编号
		orderService.addOrder(order);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		//插入房间记录表
		/*
		 * 查询可用的房间
		 */
		//查询所有房间id
		LiveNotes liveNotes = new LiveNotes();
		liveNotes.setTypeid(orderItem.getTypeid());
		
		List<String> allDay = new ArrayList<>();
		//保留前端传入的入住时间
		Date date3 = date1;
		while(date1.getTime()!=date2.getTime()){
			
			allDay.add(sdf.format(date1));
			date1=new Date(date1.getTime()+24*60*60*1000);
		}
		//所有房间id
		List<Integer> roomIds = orderService.findAllRoomsByTypeid(orderItem.getTypeid());
		//将日期转换为字符串
		for (int i = 0; i < allDay.size(); i++) {
			liveNotes.setDate(allDay.get(i));
			//查询已经入住的房间id			
			List<Integer> liveRoomIds = orderService.findAllliveRoomsByTypeid(liveNotes);
			roomIds.removeAll(liveRoomIds);
		}
		ModelAndView model = new ModelAndView();
		model.setViewName("backstage-html/add-oder.html");
		if (roomIds.size() <= 0) {
			return model ;
		}
		//查询个人信息id
		Order order2 = orderService.findIdByOrderNumber(orderNumber);
		
		//将个人信息id加入入住信息
		if (roomIds.size() >= orderItem.getQuantity()) {
			
			liveNotes.setInfoid(info2.getInfoid());
			//将可入住房间加入入住信息表
			int roomnumber=orderItem.getQuantity();
			for (int i = 0; i < roomnumber; i++) {
				liveNotes.setHouseid(roomIds.get(i));
				orderItem.setPrice(houseType.getPrice());//插入价格
				orderItem.setOrderid(order2.getOrderid());//存入订单id
				orderItem.setStarttime(sdf.format(date3));//存入入住时间
				orderItem.setEndtime(sdf.format(date2));
				orderItem.setQuantity(1);
				orderItem.setDay(day);//存入入住天数
				orderItem.setHouseid(liveNotes.getHouseid());
				orderService.addOrderItem(orderItem);
				//订单根据订单id获取所有订单项id
				List<Integer> orderItemids =orderService.findOrderItemByOrderid(order2.getOrderid());
				System.out.println(roomIds.get(i)+"1111");
				
					liveNotes.setOrderItemid(orderItemids.get(i));
					for (int k = 0; k < allDay.size(); k++) {
						liveNotes.setDate(allDay.get(k));
						orderService.addLiveNotes(liveNotes);
						
					}
				}
				
			}	
		model.setViewName("backstage-html/add-oder.html");
		return model;
	}
	
	//查找某位客人的所有订单记录
	@RequestMapping("/findorder")
	public ModelAndView findOrder(Info info) {
		System.out.println("6666"+info);
		ModelAndView model = new ModelAndView();
		List<Info> infos = orderService.findOrder(info);
		model.addObject("infos", infos);
		model.setViewName("backstage-html/findOrder.html");
		System.out.println(model);
		return model;
	}

	
	//查询所有订单记录
	@RequestMapping("/findallorder")
	public ModelAndView findAllOrder() {
		ModelAndView model = new ModelAndView();
		List<Info> infos= orderService.findAllOrders();
		model.addObject("infos", infos);
		model.setViewName("backstage-html/findOrder.html");
		return model;
	}
	
	//查询修改订单信息
	@RequestMapping("/findupdate")
	public ModelAndView findupdate(Integer id) {
		ModelAndView model = new ModelAndView();
		model = orderService.findUpdateOrder(id);
		model.setViewName("backstage-html/updateorder.html");
		return model;
	}
	//修改订单信息
	@RequestMapping("/updateorder")
	public ModelAndView updateOder(Info info,Order order,OrderItem orderItem,@DateTimeFormat(pattern="yyyy-MM-dd") Date date1,@DateTimeFormat(pattern="yyyy-MM-dd") Date date2) {
		ModelAndView model = new ModelAndView();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String starttime = sdf.format(date1);
		String endtime = sdf.format(date2);
		orderItem.setStarttime(starttime);
		orderItem.setEndtime(endtime);
		String updatetime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());//获取当前修改订单时间
		order.setUpdatetime(updatetime);
		model = orderService.updateOrder(info,order, orderItem);
		List<Info> infos= orderService.findAllOrders();
		model.addObject("infos", infos);
		model.setViewName("backstage-html/findOrder.html");
		return model;
	}
	



	
	// 结账
	@RequestMapping("/settle accounts")
	public ModelAndView settleAccounts(String houseid) {
		
		Boolean flag = orderService.settleAccounts(houseid);
		
		
		return null;

	}

}

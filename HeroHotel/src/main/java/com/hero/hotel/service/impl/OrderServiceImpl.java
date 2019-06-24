package com.hero.hotel.service.impl;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.hero.hotel.dao.OrderDao;
import com.hero.hotel.pojo.HouseType;
import com.hero.hotel.pojo.Info;
import com.hero.hotel.pojo.LiveNotes;
import com.hero.hotel.pojo.Order;
import com.hero.hotel.pojo.OrderItem;
import com.hero.hotel.pojo.User;
import com.hero.hotel.pojo.Vip;
import com.hero.hotel.service.OrderService;
@Service("orderService")
public class OrderServiceImpl implements OrderService{
	@Resource
	private OrderDao orderDao;

	//订单表插入数据
	@Override
	public void addOrder(Order order) {
		orderDao.addOrder(order);
	}
	//订单项插入数据
	@Override
	public void addOrderItem(OrderItem orderItem) {
		orderDao.addOrderItem(orderItem);
	}
	//个人信息表插入数据
	@Override
	public void addInfo(Info info) {
		orderDao.addInfo(info);
	}
	//查询个人信息id
	@Override
	public Info findId(String idcard) {		
		return orderDao.findId(idcard);
	}

	//入住日志表插入数据
	@Override
	public void addLiveNotes(LiveNotes liveNotes) {
		orderDao.addLiveNotes(liveNotes);
	}
	
	//根据账号id获取消费金额，通过消费金额获取对应的会员折扣
	@Override
	public User findMonetaryByid(Integer id) {		
		return orderDao.findMonetaryByid(id);
	}
	@Override
	public Vip findDiscountByMonetary(double vmoney) {		
		return orderDao.findDiscountByMonetary(vmoney);
	}
	
	//查询订单id,根据订单编号查找
	@Override
	public Order findIdByOrderNumber(String orderNumber) {
		return orderDao.findIdByOrderNumber(orderNumber);
	}
	@Override
	public HouseType findPriceByTypeid(Integer typeid) {
		return orderDao.findPriceByTypeid(typeid);
	}
	//查找该类型的所有房间，查找当天入住日志表中该类房间已经入住的房间，
	@Override
	public List<Integer> findAllRoomsByTypeid(Integer typeid) {		
		return orderDao.findAllRoomsByTypeid(typeid);
	}
	@Override
	public List<Integer> findAllliveRoomsByTypeid(LiveNotes liveNotes) {
		return orderDao.findAllliveRoomsByTypeid(liveNotes);
	}
	
	
	//查询
	@Override
	public Order findAllOrderItemByUserid(Integer id) {
		return orderDao.findAllOrderItemByUserid(id);
	}
	
	/*
	 * 查询某个角色的所有订单
	 * 1.根据名字获取该角色的个人信息
	 * 2.根据个人信息id获取该角色的账号id信息
	 * 3.根据账号id获取该角色的订单id
	 * 4.根据订单id获取所有的订单项id
	 */
	@Override
	public ModelAndView findAllOrder(Info info) {
		ModelAndView model = new ModelAndView();
		Info info1 = orderDao.findInfo(info);
		User user = orderDao.findUser(info1.getInfoid());		
		Order order = orderDao.findOder(user.getId());
		model.addObject("uname", info1.getUname());
		model.addObject(order);
		return model;
	}
	
	//修改订单信息
	@Override
	public ModelAndView updateOrder(Info info, Order order, OrderItem orderItem) {
		ModelAndView model = new ModelAndView();
		orderDao.updateInfo(info);
		orderDao.updateOrderItem(orderItem);
		User user = orderDao.findUser(info.getInfoid());		
		Order order2 = orderDao.findOder(user.getId());
		model.addObject("uname", info.getUname());
		model.addObject(order2);
		return model;
	}
	
	//删除订单
	@Override
	public ModelAndView deleteOrder(LiveNotes liveNotes, OrderItem orderItem, Order order,Info info) {
		ModelAndView model = new ModelAndView();
		orderDao.updateLiveNotesFlag(liveNotes);
		orderDao.updateOrderItemFlag(orderItem);
		orderDao.updateOrderFlag(order);
		User user = orderDao.findUser(info.getInfoid());		
		Order order2 = orderDao.findOder(user.getId());
		model.addObject("uname", info.getUname());
		model.addObject(order2);
		return model;		
	}
}

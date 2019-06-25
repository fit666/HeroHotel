package com.hero.hotel.service;




import java.util.List;


import org.springframework.web.servlet.ModelAndView;

import com.hero.hotel.pojo.HouseType;
import com.hero.hotel.pojo.Info;
import com.hero.hotel.pojo.LiveNotes;
import com.hero.hotel.pojo.Order;
import com.hero.hotel.pojo.OrderItem;
import com.hero.hotel.pojo.User;
import com.hero.hotel.pojo.Vip;

public interface OrderService {
	//订单表插入数据
	public void addOrder(Order order);
	//订单项插入数据
	public void addOrderItem(OrderItem orderItem);
	//个人信息表插入数据
	public void addInfo(Info info);
	//查询个人信息id
	public Info findId(String idcard);
	//入住日志表插入数据
	public void addLiveNotes(LiveNotes liveNotes);
	//根据账号id获取消费金额，通过消费金额获取对应的会员折扣
	public User findMonetaryByid(Integer id);
	public Vip findDiscountByMonetary(double vmoney);
	//查询订单id,根据订单编号查找
	public Order findIdByOrderNumber(String orderNumber);
	//查找房间价格
	public HouseType findPriceByTypeid(Integer typeid);
	//查找该类型的所有房间，查找当天入住日志表中该类房间已经入住的房间，		
	public List<Integer> findAllRoomsByTypeid(Integer typeid);
	public List<Integer> findAllliveRoomsByTypeid(LiveNotes liveNotes);
	/*
	 * 删除订单
	 * 1.进入订单页面，自动先查询该用户的所有订单和订单项，1的为可删，2则为不可删（flag为1的表示可以已定但还未入住的，
	 * flag为2的表示已定已入住的的，3表示取消的订单）
	 * 2点击删除按钮，后台将订单和订单项中的flag修改为3，之后再自动查询一次，显示给页面
	 */
	
	//查询所有订单记录
	public List<Info> findAllOrders();
	
	//查询需要修改的订单信息
	public ModelAndView findUpdateOrder(Integer id);
	
	//删除订单
	public ModelAndView deleteOrder(LiveNotes liveNotes,OrderItem orderItem,Order order,Info info);
	
	//查询某个角色的所有订单
	public List<Info> findOrder(Info info);
	
	//修改订单信息
	public ModelAndView updateOrder(Info info,Order order,OrderItem orderItem);

	// 结账
	public Boolean settleAccounts(String houseid);

	
}

package com.hero.hotel.service.impl;

import java.util.List;

import javax.annotation.Resource;


import org.springframework.stereotype.Controller;

import com.hero.hotel.dao.OrderDao;
import com.hero.hotel.pojo.Order;
import com.hero.hotel.service.OrderService;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.servlet.ModelAndView;

import com.hero.hotel.dao.HouseDao;
import com.hero.hotel.dao.LiveNotesDao;
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
@Transactional
public class OrderServiceImpl implements OrderService {
	@Resource
	private OrderDao orderDao;

	@Resource
	private HouseDao houseDao;

	@Resource
	private LiveNotesDao liveNotesDao;
	@Override
	public List<Order> queryAllOrder(int uid) {
		// TODO Auto-generated method stub
		return orderDao.queryAllByUid(uid);
	}
	// 订单表插入数据
	@Override
	public void addOrder(Order order) {
		orderDao.addOrder(order);
	}

	// 订单项插入数据
	@Override
	public void addOrderItem(OrderItem orderItem) {
		orderDao.addOrderItem(orderItem);
	}

	// 个人信息表插入数据
	@Override
	public void addInfo(Info info) {
		orderDao.addInfo(info);
	}

	// 查询个人信息id
	@Override
	public Info findId(String idcard) {
		return orderDao.findId(idcard);
	}

	// 入住日志表插入数据
	@Override
	public void addLiveNotes(LiveNotes liveNotes) {
		orderDao.addLiveNotes(liveNotes);
	}

	// 根据账号id获取消费金额，通过消费金额获取对应的会员折扣
	@Override
	public User findMonetaryByid(Integer id) {
		return orderDao.findMonetaryByid(id);
	}

	@Override
	public Vip findDiscountByMonetary(double vmoney) {
		return orderDao.findDiscountByMonetary(vmoney);
	}

	// 查询订单id,根据订单编号查找
	@Override
	public Order findIdByOrderNumber(String orderNumber) {
		return orderDao.findIdByOrderNumber(orderNumber);
	}

	@Override
	public HouseType findPriceByTypeid(Integer typeid) {
		return orderDao.findPriceByTypeid(typeid);
	}

	// 查找该类型的所有房间，查找当天入住日志表中该类房间已经入住的房间，
	@Override
	public List<Integer> findAllRoomsByTypeid(Integer typeid) {
		return orderDao.findAllRoomsByTypeid(typeid);
	}

	@Override
	public List<Integer> findAllliveRoomsByTypeid(LiveNotes liveNotes) {
		return orderDao.findAllliveRoomsByTypeid(liveNotes);
	}

	// 查询
	@Override
	public Order findAllOrderItemByUserid(Integer id) {
		return orderDao.findAllOrderItemByUserid(id);
	}

	/*
	 * 查询某个角色的所有订单 1.根据名字获取该角色的个人信息 2.根据个人信息id获取该角色的账号id信息 3.根据账号id获取该角色的订单id
	 * 4.根据订单id获取所有的订单项id
	 */
	@Override
	public ModelAndView findAllOrder(Info info) {
		ModelAndView model = new ModelAndView();

		Info info1 = orderDao.findInfo(info);
		System.out.println("*****" + info1);
		User user = orderDao.findUser(info1.getInfoid());
		System.out.println("*******" + user);
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

	// 删除订单
	@Override
	public ModelAndView deleteOrder(LiveNotes liveNotes, OrderItem orderItem, Order order, Info info) {
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

	// 结账
	@Override
	public Boolean settleAccounts(Integer orderItemid, Integer houseid) {
		
		return OutAndCance(orderItemid,houseid,2);
	}

	// 取消房间
	@Override
	public Boolean canceOrder(Integer orderItemid, Integer houseid) {
		
		return OutAndCance(orderItemid,houseid,1);
	}

	// 取消、退房
	
	public Boolean OutAndCance(Integer orderItemid, Integer houseid,Integer type){
		Boolean flag = false;
		// 2表示 完结
		flag = orderDao.settleAccounts(2, 1, orderItemid);
		// 1 表示 可住
		flag = houseDao.changeHouseTypeByHouseid(type, houseid);

		liveNotesDao.changeType(2, orderItemid);

		// 查询订单里的订单项 有没有 没有结账的id 1 表示是否有 订单项 未完结
		List<Integer> ids = orderDao.isNoSettle(1, orderItemid);
		// 判断 该订单 是否还有 未完成订单项
		if (ids.size() == 0) {
			flag = orderDao.changeOrderFlag(2, 1, orderItemid);
		}
		return flag;
	}
	
	

	//根据某时间段查询住房情况
	@Override
	public Integer findHouseNumberByTypeid(List<String> todays, Integer typeid) {
		//所有的住房信息
		List<LiveNotes> houseByType = houseDao.findHouseByType(typeid);
		//根据房间类型查找所有的房间id
		List<Integer> houseidByType = houseDao.findHouseidByType(typeid);
		//可用房间数量
		Integer houseNumber=houseidByType.size();
		for (int i = 0; i < houseidByType.size(); i++) {
			for (int j = 0; j < houseByType.size(); j++) {
				if(todays.contains(houseByType.get(j).getDate())&&houseidByType.get(i).equals(houseByType.get(j).getHouseid())){
					houseNumber--;
					break;
				}

			}
		}
		return houseNumber;
	}
	//code by sxj , 大佬别删我
	@Override
	public void orderSubmit(String ordernumber, String currenttime, String name, String sex, String tel, String idcard, List<String> todays, List<Integer> housenumber) {
		//先放入用户信息，并返回一个用户id，先用手机号检索，如果有就不插入了，没有就插入
		Integer infoid = 0;
		Info userInfo=orderDao.findInfoByTel(tel);
		System.out.println(userInfo);
		if (userInfo==null){
			orderDao.addInfoByOrder(tel,name,sex,idcard);
			Info info = orderDao.findInfoByTel(tel);
			infoid=info.getInfoid();
		}else {
			infoid=userInfo.getInfoid();
		}

		Integer userid=1;  //这里先假设一个
		//放入订单信息
		orderDao.addOrderInfo(userid,currenttime,ordernumber);
		//存入livenotes信息，这里需要一个infoid，来自info

		//存放一个订单项信息，需要一个订单id，



		//存放订单信息
		for (int typeid = 1; typeid <= 4 ; typeid++) {
			//所有的住房信息
			List<LiveNotes> houseByType = houseDao.findHouseByType(typeid);
			//根据房间类型查找所有的房间id
			List<Integer> houseidByType = houseDao.findHouseidByType(typeid);
			for (int i = 0; i < houseidByType.size(); i++) {
                System.out.println("执行2");
			    if(housenumber.get(typeid).equals(0)){
			        break;
                }
				for (int j = 0; j < houseByType.size(); j++) {
                    System.out.println("执行3");
					if(todays.contains(houseByType.get(j).getDate())&&houseidByType.get(i).equals(houseByType.get(j).getHouseid())){
						houseidByType.remove(i);
						break;
					}
				}
				for (int j = 0; j < houseidByType.size(); j++) {
					if(housenumber.get(typeid).equals(0)){
						break;
					}
					for (int k = 0; k < todays.size(); k++) {
						System.out.println("执行1");
						houseDao.addDay(houseidByType.get(j),typeid,todays.get(k),infoid);

					}
					housenumber.set(typeid,housenumber.get(typeid)-1);
				}
			}


	    }


    }
	@Override
	public Order queryByOrderNumber(String ordernumber) {
		
		return orderDao.findOrderByOrdernumber(ordernumber);
	}
}

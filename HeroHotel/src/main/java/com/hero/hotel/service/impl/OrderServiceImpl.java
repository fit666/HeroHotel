package com.hero.hotel.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.hero.hotel.dao.OrderDao;
import com.hero.hotel.pojo.Order;
import com.hero.hotel.service.OrderService;
@Controller
public class OrderServiceImpl implements OrderService {
	@Resource
	private OrderDao orderDao;
	@Override
	public List<Order> queryAllOrder(int uid) {
		// TODO Auto-generated method stub
		return orderDao.queryAllByUid(uid);
	}

}

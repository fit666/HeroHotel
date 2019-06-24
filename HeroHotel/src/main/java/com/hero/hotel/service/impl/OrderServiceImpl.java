package com.hero.hotel.service.impl;

import org.springframework.stereotype.Service;

import com.hero.hotel.dao.OrderDao;
import com.hero.hotel.service.OrderService;

@Service("orderService")
public class OrderServiceImpl implements OrderService {

	private OrderDao orderDao;
	
	@Override
	public Boolean settleAccounts(String houseid) {

		Boolean flag = orderDao.settleAccounts(houseid);
		
		
		return null;
	}

}

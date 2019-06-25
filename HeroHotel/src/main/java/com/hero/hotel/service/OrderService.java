package com.hero.hotel.service;

import java.util.List;

import com.hero.hotel.pojo.Order;

public interface OrderService {
	
	public List<Order> queryAllOrder(int uid);
}

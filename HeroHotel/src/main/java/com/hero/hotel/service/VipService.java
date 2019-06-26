package com.hero.hotel.service;

import java.util.List;

import com.hero.hotel.pojo.Vip;

public interface VipService {
	//获取所有的会员等级信息
	List<Vip> findAllVips();
	//修改vip信息
	String editVip(Vip vip);
	// 删除vip
	String vipDel(Vip vip);
	//添加vip
	boolean addVip(Vip vip);
	
}

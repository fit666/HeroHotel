package com.hero.hotel.service;

import java.util.List;

import com.hero.hotel.pojo.Info;

public interface InfoService {
	
	public List<Info> queryInfo(String tel);
	
	public int addInfo(Info info);
}

package com.hero.hotel.service;

import java.util.List;
import java.util.Map;

import com.hero.hotel.pojo.NowUserInfo;

public interface UserInforService {

	public List<Map> findUserMessage();

	public List<NowUserInfo> findUserInfo();
}

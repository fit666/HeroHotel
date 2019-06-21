package com.hero.hotel.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.hero.hotel.service.ChartService;

@Service("chartService")
public class ChartServiceImpl implements ChartService {

	@Override
	public List<Map<String, Object>> findMoneyDay() {
		System.out.println("567890");
		List<Map<String, Object>> lists = new ArrayList<Map<String, Object>>();
		Map<String, Object> map = new HashMap<String, Object>();

		// 模拟查询出 收入金额

		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");// 设置日期格式
		System.out.println(df.format(new Date()));// new Date()为获取当前系统时间

		map.put("day", "2019-02-11");
		map.put("inMoney", 123);
		map.put("outMoney", 123123);

		lists.add(map);
		
		System.out.println(lists);
		return lists;
	}

}

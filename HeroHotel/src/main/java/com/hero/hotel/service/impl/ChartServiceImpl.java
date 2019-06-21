package com.hero.hotel.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.hero.hotel.service.ChartService;

public class ChartServiceImpl implements ChartService{

	@Override
	public Map<String, Object> fingMoneyDay() {

		
		Map<String, Object> map = new HashMap<String, Object>();
		
		// 模拟查询出  收入金额
		
		Double inMoney = 1234.0;
		
		
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//设置日期格式
        System.out.println(df.format(new Date()));// new Date()为获取当前系统时间
		
        
        
		
		
		return null;
	}

	
	
}

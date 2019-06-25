package com.hero.hotel.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hero.hotel.pojo.Vip;
import com.hero.hotel.service.VipService;

@Controller
@RequestMapping("/vip")
public class VipController {
	@Resource
	private VipService vipService;
	
	@RequestMapping("/allVips")
	@ResponseBody
	private List<Vip> showAllVip() {
		
		return vipService.queryAllVip();
	}
}

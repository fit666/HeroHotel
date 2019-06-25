package com.hero.hotel.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.hero.hotel.pojo.HouseType;
import com.hero.hotel.service.HouseTypeService;
@Controller
@RequestMapping("/housetype")
public class HouseTypeCotroller {
	
	@Resource
	private HouseTypeService houseTypeService;
	
	@RequestMapping("/showAll")
	@ResponseBody
	public List<HouseType> showHouseType() {
		List<HouseType> types = houseTypeService.queryAllType();
		return types;
	}
}

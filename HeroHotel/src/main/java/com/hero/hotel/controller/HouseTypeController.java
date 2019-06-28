package com.hero.hotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import com.hero.hotel.pojo.HouseType;
import com.hero.hotel.service.HouseTypeService;

@Controller
@RequestMapping("/housetype")
public class HouseTypeController {
	@Autowired
	private HouseTypeService houseTypeService;
	/*
	 * 获取所有的房间类型及其对应的房间
	 */
	@RequestMapping("/allHouses")
	public ModelAndView allHouses(){
		ModelAndView mav=new ModelAndView();
		//查询所有的房间
		List<HouseType> allHouses=houseTypeService.findAllHouses();
		mav.addObject("allHouses", allHouses);
		mav.setViewName("/backstage-html/house-list.html");
		
		return mav;
	}
	
	/*
	 * 获取所有的房间类型
	 */
	@RequestMapping("/findAllType")
	public ModelAndView findAllType(){
		ModelAndView mav=new ModelAndView();
		List<HouseType> allType=houseTypeService.findAllType();
		
		mav.addObject("allType", allType);
		mav.setViewName("/backstage-html/house-add.html");
		
		return mav;
	}
}

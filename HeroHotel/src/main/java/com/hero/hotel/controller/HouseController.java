package com.hero.hotel.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hero.hotel.pojo.House;
import com.hero.hotel.service.HouseService;

@Controller
@RequestMapping("/room")
public class HouseController {

	@Resource
	private HouseService houseService;
	
	

	// 查询所有房间状态

	@GetMapping("/findRoomAll")
	// @ResponseBody
	public ModelAndView findRoomAllStatus() {

		List<House> houses = houseService.findRoomAllStatus();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("rooms", houses);
		modelAndView.setViewName("backstage-html/roomStatus.html");
		System.out.println(houses);
		return modelAndView;

	}

	@GetMapping("/findOkRooms")
	public ModelAndView findOkRooms() {
		List<House> houses = houseService.findOkRooms();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("rooms", houses);
		modelAndView.setViewName("backstage-html/roomStatus.html");
		System.out.println(houses);
		return modelAndView;
	}

	@GetMapping("/findNoRooms")
	public ModelAndView findNoRooms() {
		List<House> houses = houseService.findNoRooms();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("rooms", houses);
		modelAndView.setViewName("backstage-html/roomStatus.html");
		System.out.println(houses);
		return modelAndView;
	}

	@GetMapping("/findZangRooms")
	public ModelAndView findZangRooms() {
		List<House> houses = houseService.findZangRooms();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("rooms", houses);
		modelAndView.setViewName("backstage-html/roomStatus.html");
		System.out.println(houses);
		return modelAndView;
	}

	// @GetMapping("/findRoomTypeNum")
	// @ResponseBody
	// public List<Map> findRoomTypeNum(String time1, String time2) {
	//
	// System.out.println(time1);
	// System.out.println(time2);
	//
	// List<Map> maps = new ArrayList<Map>();
	// Map<String, Object> map = new HashMap<String, Object>();
	// map.put("a", time1);
	// map.put("b", time2);
	// maps.add(map);
	//
	//
	// List<Map> list = houseService.findRoomTypeNum(time1,time2);
	//
	// return maps;
	// }
	
	
	

}

package com.hero.hotel.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.hero.hotel.pojo.Room;
import com.hero.hotel.service.RoomService;

@Controller
@RequestMapping("/room")
public class RoomController {

	@Resource
	private RoomService roomService;

	// 查询所有房间状态

	@GetMapping("/findRoomAll")
	// @ResponseBody
	public ModelAndView findRoomAllStatus() {

		List<Room> rooms = roomService.findRoomAllStatus();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("rooms", rooms);
		modelAndView.setViewName("html/roomStatus.html");
		System.out.println(rooms);
		return modelAndView;

	}

	@GetMapping("/findOkRooms")
	public ModelAndView findOkRooms() {
		List<Room> rooms = roomService.findOkRooms();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("rooms", rooms);
		modelAndView.setViewName("html/roomStatus.html");
		System.out.println(rooms);
		return modelAndView;
	}

	@GetMapping("/findNoRooms")
	public ModelAndView findNoRooms() {
		List<Room> rooms = roomService.findNoRooms();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("rooms", rooms);
		modelAndView.setViewName("html/roomStatus.html");
		System.out.println(rooms);
		return modelAndView;
	}

	@GetMapping("/findZangRooms")
	public ModelAndView findZangRooms() {
		List<Room> rooms = roomService.findZangRooms();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("rooms", rooms);
		modelAndView.setViewName("html/roomStatus.html");
		System.out.println(rooms);
		return modelAndView;
	}

	@GetMapping("/findRoomTypeNum")
	@ResponseBody
	public List<Map> findRoomTypeNum(String time1, String time2) {

		System.out.println(time1);
		System.out.println(time2);

		List<Map> maps = new ArrayList<Map>();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("a", time1);
		map.put("b", time2);
		maps.add(map);

		
		List<Map> list = roomService.findRoomTypeNum(time1,time2);

		return maps;
	}

}

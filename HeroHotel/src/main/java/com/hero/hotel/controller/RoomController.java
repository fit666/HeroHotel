package com.hero.hotel.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
//	@ResponseBody
	public ModelAndView findRoomAllStatus() {
		
		List<Room> rooms = roomService.findRoomAllStatus();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("rooms",rooms);
		modelAndView.setViewName("html/roomStatus.html");
		System.out.println(rooms);
		return modelAndView;

	}

}

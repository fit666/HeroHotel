package com.hero.hotel.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hero.hotel.dao.OrderInforDao;
import com.hero.hotel.dao.RoomDao;
import com.hero.hotel.pojo.Room;
import com.hero.hotel.service.RoomService;

@Service("roomService")
public class RoomServiceImpl implements RoomService {

	@Resource
	private RoomDao roomDao;
	
	@Resource
	private OrderInforDao orderInforDao;

	// 查询所有房间状态
	@Override
	public List<Room> findRoomAllStatus() {
		return roomDao.findRoomAllStatus();
	}

	@Override
	public List<Room> findOkRooms() {
		return roomDao.findOkRooms();
	}

	@Override
	public List<Room> findNoRooms() {
		return roomDao.findNoRooms();
	}

	@Override
	public List<Room> findZangRooms() {
		return roomDao.findZangRooms();
	}

	@Override
	public List<Map> findRoomTypeNum(String time1, String time2) {

		long day = 0;
		java.text.SimpleDateFormat format = new java.text.SimpleDateFormat("yyyy-MM-dd");
		java.util.Date beginDate = null;
		java.util.Date endDate;
		try {
			beginDate = format.parse(time1);
			endDate = format.parse(time2);
			day = (endDate.getTime() - beginDate.getTime()) / (24 * 60 * 60 * 1000);
			System.out.println("相隔的天数=" + day);
		} catch (Exception e) {
			// TODO 自动生成 catch 块
			e.printStackTrace();
		}
		Calendar c = Calendar.getInstance();

		List<String> times = new ArrayList<String>();
		for (int i = 0; i < day; i++) {

			c.setTime(beginDate);
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");// 设置你想要的格式
			c.add(Calendar.DAY_OF_MONTH, i);// 今天+1天
			String dateStr = df.format(c.getTime());
			times.add(dateStr);

			System.out.println(dateStr);
		}

		// List<String> rids = roomDao.findOrderInforRid(time);
		List<List> roomids1 = new ArrayList<List>();
		for (int i = 0; i < times.size(); i++) {
			 System.out.println(times.get(i)+"---------------");
			List<Integer> rids = orderInforDao.findOrderInforRid(times.get(i));

			roomids1.add(rids);
		}

		List<List> roomids2 = new ArrayList<List>();
//		for (int i = 0; i < times.size(); i++) {
//			// System.out.println(times.get(i)+"---------------");
//			List<Integer> rids = orderInforDao.findOrderInforRid(times.get(i));
//
//			roomids2.add(rids);
//		}
		System.out.println(roomids1);

		return null;
	}

}

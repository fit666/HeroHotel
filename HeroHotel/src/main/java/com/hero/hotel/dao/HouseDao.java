package com.hero.hotel.dao;

import java.util.List;

import com.hero.hotel.pojo.LiveNotes;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.hero.hotel.pojo.House;


public interface HouseDao {

	@Select("select * from t_House")
	public List<House> findRoomAllStatus();

	
	@Select("select * from t_House where flag=0")
	public List<House> findOkRooms();

	@Select("select * from t_House where flag=1")
	public List<House> findNoRooms();

	@Select("select * from t_House where flag=2")
	public List<House> findZangRooms();

	@Select("select roomid from orderinfor where today=#{time} and flag=0")
	public List<Integer> findOrderInforRid(String time);

	@Select("select * from t_livenotes where typeid=#{typeid}")
	List<LiveNotes> findHouseByType(Integer typeid);
	@Select("select id from t_house where typeid=#{typeid}")
	List<Integer> findHouseidByType(Integer typeid);

	@Insert("insert into t_livenotes(houseid,typeid,date,infoid,flag) values(#{houseid},#{typeid},#{s},#{infoid},1)")
    public void addDay(Integer houseid, int typeid, String s, Integer infoid);
}
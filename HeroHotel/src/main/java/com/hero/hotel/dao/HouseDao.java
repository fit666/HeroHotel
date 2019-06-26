package com.hero.hotel.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Results;
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
	
	
	
	// 修改 房间状态 
	@Update("UPDATE t_house SET flag = 2 WHERE houseid = #{houseid} ")
	public Boolean changeHouseTypeByHouseid(String houseid);

	//根据房间类型id查询所有对应的房间
	@Select("select * from t_house where typeid=#{typeid}")
	public List<House> findAllByTypeid(Integer typeid);

	//下架房间
	@Update("update t_house set flag=0 where id=#{id}")
	public boolean stopRoom(Integer id);

	//上架房间
	@Update("update t_house set flag=1 where id=#{id}")
	public boolean stertRoom(Integer id);

	//根据房间类型添加房间
	@Insert("insert into t_house(clean,maintenance,typeid) values(1,1,#{typeid}) ")
	public boolean addRoom(Integer typeid);
}
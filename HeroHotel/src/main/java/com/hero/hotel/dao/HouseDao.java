package com.hero.hotel.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
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
	@Update("UPDATE t_house SET flag = #{flag} WHERE houseid = #{houseid} ")
	public Boolean changeHouseTypeByHouseid(@Param("flag")Integer flag,@Param("houseid")Integer houseid);

	
}